package azvasa.controller;

import java.util.ArrayList;
import azvasa.repository.SignUpException;
import org.springframework.beans.factory.annotation.Autowired;

import com.vmware.vim25.VirtualMachineQuickStats;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.ServiceInstance;
import com.vmware.vim25.mo.VirtualMachine;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class collectStatistics {

	@Autowired
	JdbcTemplate template;

	 @Autowired
	 ServiceInstance serviceInstance;

	//@Scheduled(fixedRate = 1000)
	public void monitorUserAlarm(String username)
	{
		String alarms = "SELECT username, vm_name, alarmName, description, alarmMetric , alarmOperator , alarmThresholdValue , email , status " +
				"FROM azvasa.alarm WHERE username ='" + username + "' and status = 'triggered'" ;

		List<Map<String, Object>> rows = template.queryForList(alarms);
		if ((rows != null) || (rows.size() > 0))
		{
			Folder rootFolder = serviceInstance.getRootFolder();
			for (Map<String, Object> tempRow : rows) {
				String vmName               = tempRow.get("vm_name");
				String alarmName            = tempRow.get("alarmName"));
				String alarmThresholdValue  = tempRow.get("alarmThresholdValue"));
				String alarmMetric          = tempRow.get("alarmMetric"));
				String email                = tempRow.get("email"));
				String alarmOperator        = tempRow.get("alarmOperator"));

				VirtualMachine vm = (VirtualMachine)inv.searchManagedEntity("VirtualMachine", vmName);
				//poll the alarm metric
				VirtualMachineQuickStats stas = vm.getSummary().getQuickStats();
				if(alarmMetric == 'cpu')
				{
					if(stas.overallCpuUsage > alarmThresholdValue)
					{
						//pop up
						//update alarm status in db
						email.sendEmail(email," The memory usage for VM " + vm.getName() + " has exceeded the threshold limit.","Your CPU usage for VM "+ vm.getName() + " is "+ stas.overallCpuUsage +". It has exceeded the threshold value");
					}
				}
				else
				{
					if(stas.guestMemoryUsage > alarmThresholdValue)
					{
						//pop up
						email.sendEmail(email," The memory usage for VM" + vm.getName() + " has exceeded the threshold limit.","Your memory usage for VM "+ vm.getName() + " is "+ stas.guestMemoryUsage +". It has exceeded the threshold limit");
					}
				}
			}
		}
	}
}
