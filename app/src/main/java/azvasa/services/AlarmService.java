package azvasa.services;

import azvasa.model.AlarmCreationRequest;
import com.vmware.vim25.*;
import com.vmware.vim25.mo.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.rmi.RemoteException;
import azvasa.model.AlarmModel;
import org.springframework.jdbc.core.JdbcTemplate;


@Component
public class AlarmService {
    private static Logger logger = org.slf4j.LoggerFactory.getLogger(AlarmService.class);

    @Autowired
    JdbcTemplate template;

    @Autowired
    ServiceInstance serviceInstance;

    EmailService email = new EmailService();

    public void createAlarm(String userName , String vmname, String alarmname, AlarmCreationRequest alarmCreationRequest) throws RemoteException {
        //validation to check if the alarm with the same metric has been set

        final AlarmManager alarmManager = serviceInstance.getAlarmManager();
        final InventoryNavigator navigator = new InventoryNavigator(serviceInstance.getRootFolder());
        final ManagedEntity vm = navigator.searchManagedEntity("VirtualMachine", vmname);

        String al = "SELECT count(1) FROM azvasa.alarm WHERE username = '"+ userName +"' and vm_name  = '" + vmname +"' and alarmMetric = '"+  alarmCreationRequest.getMetric() + "'" ;
        Integer alarmCount = (Integer)template.queryForObject(al, Integer.class);

        if(alarmCount > 0)
        {
            System.out.println("Alarm already set for .. so deleting !!");
            String del = "DELETE FROM azvasa.alarm WHERE username = '" + userName + "' and vm_name  = '" + vmname +"' and alarmMetric = '"+  alarmCreationRequest.getMetric() + "'";
            template.execute(del);

            Alarm[] alarms = alarmManager.getAlarm(vm);
            if (alarms != null) {
                for (int k = 0; k < alarms.length; k++) {
                    Alarm a = alarms[k];
                    if(a.getAlarmInfo().getName().equalsIgnoreCase(alarmname))
                        a.removeAlarm();
                }
            }

        }

        AlarmSpec spec = getAlarmSpec(alarmCreationRequest, alarmname);
        final Alarm alarm = alarmManager.createAlarm(vm, spec);

        String stats = String.format("insert into azvasa.alarm" +
                "(username , vm_name, alarmName , description , alarmMetric , alarmOperator , alarmThresholdValue , email , status ) " +
                " VALUES('%s','%s','%s','%s','%s','%s','%s','%s','Running')", userName ,vmname , alarmname, alarmCreationRequest.getDescription(), alarmCreationRequest.getMetric() , alarmCreationRequest.getOperator() , alarmCreationRequest.getRedValue(), alarmCreationRequest.getEmail());

        template.execute(stats);
    }

    public AlarmSpec getAlarmSpec(AlarmCreationRequest alarmCreationRequest,String alarmName) {
        AlarmSpec spec = new AlarmSpec();
        spec.setAction(alarmCreationRequest.getemailAction());
        spec.setExpression(alarmCreationRequest.getExpression());
        spec.setName(alarmName);
        spec.setDescription(alarmCreationRequest.getDescription());
        spec.setEnabled(true);

        AlarmSetting as = new AlarmSetting();
        as.setReportingFrequency(0); //as often as possible
        as.setToleranceRange(0);

        spec.setSetting(as);
        return spec;
    }

    public void deleteAlarm(String alarmName, String username , String vmname)  throws Exception
    {
        //delete alarm ?? remove from DB
        //String alarms = "UPDATE alarm set status = 'Off' where username='"+username+"' and alarmName = '"+alarmName+"'";

        String del = "DELETE FROM azvasa.alarm WHERE username = '" + username + "' and vm_name  = '" + vmname +"' and alarmName = '"+  alarmName + "'";
        template.execute(del);

        final AlarmManager alarmManager = serviceInstance.getAlarmManager();
        InventoryNavigator inv = new InventoryNavigator(serviceInstance.getRootFolder());
        VirtualMachine vm = (VirtualMachine) inv.searchManagedEntity("VirtualMachine", vmname);
        Alarm[] alarms = alarmManager.getAlarm(vm);
        if (alarms != null) {
            for (int k = 0; k < alarms.length; k++) {
                Alarm a = alarms[k];
                if(a.getAlarmInfo().getName().equalsIgnoreCase(alarmName))
                    a.removeAlarm();
            }
        }

        //return res;
    }

    public List getAlarms(String username)  throws Exception
    {
        String alarms = "SELECT username, vm_name, alarmName, description, status FROM azvasa.alarm WHERE username ='"
                + username + "' and status = 'Running'";
        List alarmsList = template.queryForList(alarms);
        return alarmsList;
    }

    public List getAlarms(String username, String vmname)  throws Exception
    {
        String alarms = "SELECT username, vm_name, alarmName, description FROM azvasa.alarm WHERE username ='"
                + username + "' and vm_name  = '" + vmname +"'" +" and status = 'Running'" ;
        List alarmsList = template.queryForList(alarms);

        /*get Status of every alarm
        final AlarmManager alarmManager = serviceInstance.getAlarmManager();
        InventoryNavigator inv = new InventoryNavigator(si.getRootFolder());
        VirtualMachine vm = (VirtualMachine) inv.searchManagedEntity("VirtualMachine", vmname);
        Alarm[] alarms = alarmMgr.getAlarm(vm);
        if (alarms != null) {
            for (int k = 0; k < alarms.length; k++) {
                Alarm a = alarms[k];
                a.getAlarmInfo().
            }
        }*/

        return alarmsList;
    }
}
