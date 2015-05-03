package azvasa.controller;

import java.lang.Integer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import azvasa.repository.SignUpException;
import azvasa.services.EmailService;
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
public class AlarmMonitor{

	@Autowired
	JdbcTemplate template;

	 @Autowired
	 ServiceInstance serviceInstance;

	//@Scheduled(fixedRate = 1000)
	public void monitorUserAlarm(String username) throws Exception
	{
		EmailService emailService = new EmailService();
		InventoryNavigator navigator = new InventoryNavigator(serviceInstance.getRootFolder());
		String alarms = "SELECT username, vm_name, alarmName, description, alarmMetric , alarmOperator , alarmThresholdValue , email , status " +
				"FROM azvasa.alarm WHERE username ='" + username + "' and status = 'triggered'" ;

		List<Map<String, Object>> rows = template.queryForList(alarms);
		if ((rows != null) || (rows.size() > 0))
		{
			Folder rootFolder = serviceInstance.getRootFolder();
			for (Map<String, Object> tempRow : rows) {
				String vmName               = tempRow.get("vm_name").toString();
				String alarmName            = tempRow.get("alarmName").toString();
				String alarmThresholdValue  = tempRow.get("alarmThresholdValue").toString();
				String alarmMetric          = tempRow.get("alarmMetric").toString();
				String email                = tempRow.get("email").toString();
				String alarmOperator        = tempRow.get("alarmOperator").toString();

				VirtualMachine vm = (VirtualMachine)navigator.searchManagedEntity("VirtualMachine", vmName);
				VirtualMachineQuickStats stas = vm.getSummary().getQuickStats();
				if(alarmMetric.equals("cpu"))
				{
					if(stas.overallCpuUsage > Integer.parseInt(alarmThresholdValue))
					{
						//pop up
						//update alarm status in db
						emailService.sendEmail(email," The memory usage for VM " + vm.getName() + " has exceeded the threshold limit.","Your CPU usage for VM "+ vm.getName() + " is "+ stas.overallCpuUsage +". It has exceeded the threshold value");
					}
				}
				else
				{
					if(stas.guestMemoryUsage > Integer.parseInt(alarmThresholdValue))
					{
						//pop up
						emailService.sendEmail(email," The memory usage for VM" + vm.getName() + " has exceeded the threshold limit.","Your memory usage for VM "+ vm.getName() + " is "+ stas.guestMemoryUsage +". It has exceeded the threshold limit");
					}
				}
			}
		}
	}
}
