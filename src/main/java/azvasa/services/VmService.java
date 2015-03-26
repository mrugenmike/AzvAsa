package azvasa.services;

import azvasa.model.VMachine;
import com.vmware.vim25.InvalidProperty;
import com.vmware.vim25.VirtualMachineConfigInfo;
import com.vmware.vim25.VirtualMachineRuntimeInfo;
import com.vmware.vim25.mo.*;
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
    }
