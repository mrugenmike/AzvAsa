package azvasa.services;

import azvasa.model.VMachine;
import com.vmware.vim25.VirtualMachinePowerState;
import com.vmware.vim25.mo.*;
import com.vmware.vim25.mo.VirtualMachine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static azvasa.model.VMachine.*;

@Component
public class VmService {

    @Autowired
    ServiceInstance serviceInstance;

    public List<VMachine> getAllVirtualMachines() throws RemoteException {
        Folder rootFolder = serviceInstance.getRootFolder();
        ManagedEntity[] vms = new InventoryNavigator(rootFolder).searchManagedEntities(new String[][] { {"VirtualMachine", "name" }, }, true);
        return Arrays.asList(vms).stream().map(virtualMachine -> ((VirtualMachine) virtualMachine)).map(vm-> instance(vm)).collect(Collectors.toList());
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
}
