package azvasa.services;

import azvasa.model.VMEntry;
import azvasa.model.VMachine;
import azvasa.repository.VMRepository;
import com.vmware.vim25.*;
import com.vmware.vim25.mo.*;
import com.vmware.vim25.mo.VirtualMachine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.json.simple.JSONObject;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


import static azvasa.model.VMachine.instance;


@Component
public class VmService {

    Logger logger = LoggerFactory.getLogger("VMService");

    @Autowired
    JdbcTemplate template;

    @Autowired
    ServiceInstance serviceInstance;

    @Autowired
    VMRepository vmRepository;

    @Value("${linux.template}")
    String linuxTemplate;

    @Value("${windows.template}")
    String windowsTemplate;


    public List<VMachine> getAllVirtualMachines(String userName) throws RemoteException {
        final List<VMEntry> vmEntries = vmRepository.findBy(userName);
        if(vmEntries!=null && !vmEntries.isEmpty()){
            final List<String> vmnames = vmEntries.stream().map(vmEntry -> vmEntry.getVmName()).collect(Collectors.toList());
            Folder rootFolder = serviceInstance.getRootFolder();
            ManagedEntity[] vms = new InventoryNavigator(rootFolder).searchManagedEntities(new String[][] { {"VirtualMachine", "name" }, }, true);
            final List<VMachine> vMachines = Arrays.asList(vms).stream().map(virtualMachine -> ((VirtualMachine) virtualMachine)).filter(virtualMachine -> vmnames.contains(virtualMachine.getName())).map(vm -> instance(vm)).collect(Collectors.toList());
            return vMachines;
        }
        return null;
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

    public void deployVM(String type, String vmName, String userName) throws VMDeploymentException, RemoteException {
        String templateName = type.equals("linux")?linuxTemplate:windowsTemplate;
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
        try{
            String status = task.waitForMe();
            if(status==Task.SUCCESS){
                logger.info("VM with name {} cloned successfully for user {}",vmName,userName);
                vmRepository.storeVMEntry(new VMEntry(userName,vmName,new Date()));
            }
            else {
                logger.error("VM with name {} failed to be deployed", vmName);
            }
        }catch(Exception ex){
            throw new VMDeploymentException(ex.getMessage());
        }


    }
    
    public JSONObject getStats(String vmName) throws RemoteException, InterruptedException {
        JSONObject json= new JSONObject();

        String sql1 = "SELECT overall_cpu_usage FROM azvasa.stats WHERE vm_name ='" + vmName + "' ORDER BY id LIMIT 12";
        List<Integer> cpu_usage = template.queryForList(sql1,Integer.class);
        json.put("cpu_usage", cpu_usage);

        String sql2 = "SELECT guest_memory_usage FROM azvasa.stats WHERE vm_name ='" + vmName + "' ORDER BY id LIMIT 12";
        List<Integer> guest_memory_usage = template.queryForList(sql2, Integer.class);
        json.put("guest_memory_usage", guest_memory_usage);

        String sql3 = "SELECT host_memory_usage FROM azvasa.stats WHERE vm_name ='" + vmName + "' ORDER BY id LIMIT 12";
        List<Integer> host_memory_usage = template.queryForList(sql3, Integer.class);
        json.put("host_memory_usage", host_memory_usage);

        return json;
    }
}
