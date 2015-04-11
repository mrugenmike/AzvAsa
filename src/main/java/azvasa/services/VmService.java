package azvasa.services;

import azvasa.model.VMachine;
import com.vmware.vim25.VirtualMachineCloneSpec;
import com.vmware.vim25.VirtualMachinePowerState;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import com.vmware.vim25.VirtualMachineRuntimeInfo;
import com.vmware.vim25.mo.*;
import com.vmware.vim25.mo.VirtualMachine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.json.simple.JSONObject;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


import static azvasa.model.VMachine.instance;


@Component
public class VmService {

    @Autowired
    JdbcTemplate template;

    @Autowired
    ServiceInstance serviceInstance;

    @Value("${linux.template}")
    String linuxTemplate;

    @Value("${windows.template}")
    String windowsTemplate;


    public List<VMachine> getAllVirtualMachines() throws RemoteException {
        Folder rootFolder = serviceInstance.getRootFolder();
        ManagedEntity[] vms = new InventoryNavigator(rootFolder).searchManagedEntities(new String[][] { {"VirtualMachine", "name" }, }, true);
        return Arrays.asList(vms).stream().map(virtualMachine -> ((VirtualMachine) virtualMachine)).map(vm-> instance(vm)).collect(Collectors.toList());
        }

    public void powerOnVM(String vmName) throws RemoteException, InterruptedException {
        Folder rootFolder = serviceInstance.getRootFolder();

        InventoryNavigator inv = new InventoryNavigator(
                serviceInstance.getRootFolder());
        VirtualMachine vm = null;

        vm = (VirtualMachine) inv.searchManagedEntity("VirtualMachine", vmName);


        if (vm == null) {
            serviceInstance.getServerConnection().logout();
            throw new VMNotFoundException("VM With the name does not exists.");
        }
        VirtualMachineRuntimeInfo vmri = (VirtualMachineRuntimeInfo) vm.getRuntime();
        if (vmri.getPowerState() == VirtualMachinePowerState.poweredOff) {
            Task task = vm.powerOnVM_Task(null);

            task.waitForTask();

            System.out.println("vm:" + vm.getName() + " powered on.");
        }
    }
    public void powerOffVM(String vmName) throws RemoteException, InterruptedException {
        Folder rootFolder = serviceInstance.getRootFolder();
        VirtualMachine virtualMachine = (VirtualMachine)new InventoryNavigator(rootFolder).searchManagedEntity("VirtualMachine", vmName);
        if(virtualMachine!=null){
            VirtualMachinePowerState powerState = virtualMachine.getRuntime().getPowerState();
            if(powerState.equals(VirtualMachinePowerState.poweredOn)){
                virtualMachine.powerOffVM_Task().waitForTask();
            }
        }else{
            throw new VMNotFoundException(String.format("VM with the name %s doesn't exist",vmName));
        }
    }

    public void deployVM(String type, String vmName) throws Exception{
        String templateName = type.equals("linux")?linuxTemplate:windowsTemplate;
        //String templateName = "VM-CLI-01";
        System.out.println("Deploying VM with Template: "+templateName);
        Folder rootFolder = serviceInstance.getRootFolder();
        VirtualMachine vm = (VirtualMachine) new InventoryNavigator(
                rootFolder).searchManagedEntity(
                "VirtualMachine", templateName);
        if(vm==null)
        {
            System.out.println("No template " + templateName + " found");
            return;
        }
        else{
            System.out.println("NAME: "+vm.getName());
        }
        //DC and Resouce pool config
        VirtualMachineRelocateSpec locationSpec = new VirtualMachineRelocateSpec();
        Datacenter dc = (Datacenter) new InventoryNavigator(rootFolder).searchManagedEntity("Datacenter", "T09-DC");
        Datastore[] dStore = dc.getDatastores();
        System.out.println("Datastore: "+dStore[0].getSummary().name);
        ResourcePool rp = (ResourcePool) new InventoryNavigator(
                dc).searchManagedEntities("ResourcePool")[0];
        locationSpec.setPool(rp.getMOR());
        locationSpec.setDatastore(dStore[0].getMOR());
        //Clone config
        VirtualMachineCloneSpec cloneSpec =
                new VirtualMachineCloneSpec();
        cloneSpec.setLocation(locationSpec);
        cloneSpec.setPowerOn(true);
        cloneSpec.setTemplate(false);

        Task task = vm.cloneVM_Task((Folder) vm.getParent(),
                vmName, cloneSpec);
        System.out.println("Launching the VM clone task. " +
                "Please wait ...");
        String status = task.waitForMe();
        if(status==Task.SUCCESS){
            System.out.println("VM got cloned successfully.");
        }
        else {
            System.out.println("Failure -: VM cannot be cloned");
        }

    }
    
    public JSONObject getStats(String vmName) throws RemoteException, InterruptedException {
        JSONObject json= new JSONObject();

        String sql1 = "SELECT overall_cpu_usage FROM azvasa.stats WHERE vm_name ='" + vmName + "' LIMIT 10";
        List<String> cpu_usage = template.queryForList(sql1,String.class);
        json.put("cpu_usage", cpu_usage);

        String sql2 = "SELECT guest_memory_usage FROM azvasa.stats WHERE vm_name ='" + vmName + "' LIMIT 10";
        List<String> guest_memory_usage = template.queryForList(sql2, String.class);
        json.put("guest_memory_usage", guest_memory_usage);

        String sql3 = "SELECT host_memory_usage FROM azvasa.stats WHERE vm_name ='" + vmName + "' LIMIT 10";
        List<String> host_memory_usage = template.queryForList(sql3, String.class);
        json.put("host_memory_usage", host_memory_usage);

        return json;
    }

}
