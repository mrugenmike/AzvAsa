package azvasa.services;

import azvasa.controller.model.AlarmCreationRequest;
import com.vmware.vim25.*;
import com.vmware.vim25.mo.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.rmi.RemoteException;

@Component
public class AlarmService {
    private static Logger logger = org.slf4j.LoggerFactory.getLogger(AlarmService.class);
    @Autowired
    ServiceInstance serviceInstance;
    public void createAlarm(String vmname, String alarmname, AlarmCreationRequest alarmCreationRequest) throws RemoteException {
        final AlarmManager alarmManager = serviceInstance.getAlarmManager();
        final InventoryNavigator navigator = new InventoryNavigator(serviceInstance.getRootFolder());
        final ManagedEntity vm = navigator.searchManagedEntity("VirtualMachine", vmname);
        final Alarm alarm = alarmManager.createAlarm(vm, getAlarmSpec(alarmCreationRequest, alarmname));
        logger.info("created Alarm for VM {}",vmname);
    }

    private AlarmSpec getAlarmSpec(AlarmCreationRequest alarmCreationRequest,String alarmName) {
        AlarmSpec spec = new AlarmSpec();
        spec.setName(alarmName);
        spec.setDescription(alarmCreationRequest.getDescription());
        spec.setEnabled(true);
        spec.setExpression(alarmCreationRequest.getExpression());
        return spec;
    }


}
