package azvasa.services;

import azvasa.model.VMachine;
import com.vmware.vim25.VirtualMachinePowerState;
import com.vmware.vim25.VirtualMachineRuntimeInfo;
import com.vmware.vim25.mo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static azvasa.model.VMachine.instance;

@Component
public class VmService {

    @Autowired
    ServiceInstance serviceInstance;

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

            vm = (VirtualMachine)inv.searchManagedEntity("VirtualMachine", vmName);


        if(vm==null)
        {
            serviceInstance.getServerConnection().logout();
            throw new VMNotFoundException("VM With the name does not exists.");
        }
        VirtualMachineRuntimeInfo vmri = (VirtualMachineRuntimeInfo)vm.getRuntime();
        if(vmri.getPowerState() == VirtualMachinePowerState.poweredOff)
        {
            Task task = vm.powerOnVM_Task(null);

                task.waitForTask();

            System.out.println("vm:" + vm.getName() + " powered off.");
        }

    }
}
