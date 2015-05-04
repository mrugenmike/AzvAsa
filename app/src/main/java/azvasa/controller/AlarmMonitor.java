package azvasa.controller;

import java.lang.Integer;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map;

import azvasa.services.AlarmService;
import azvasa.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;

import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ServiceInstance;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import azvasa.services.ElasticSearchService;

@Component
public class AlarmMonitor{

	@Autowired
	JdbcTemplate template;

	@Autowired
	EmailService emailService;

	@Autowired
	AlarmService alarmService;

	static Long lastExecutionTime ;
	@Scheduled(fixedDelay = 10000)
	public void monitorUserAlarm() throws Exception
	{
		lastExecutionTime = new Date().getTime();
		String query = "SELECT username, vm_name, alarmName, description, alarmMetric , alarmOperator , alarmThresholdValue , email , status " +
				"FROM azvasa.alarm WHERE status = 'Running'" ;

		List<Map<String, Object>> rows = template.queryForList(query);
		if ((rows != null) || (rows.size() > 0)) {
			for (Map<String, Object> tempRow : rows)
			{
				String vmName = tempRow.get("vm_name").toString();
				String alarmName = tempRow.get("alarmName").toString();
				int alarmThresholdValue = Integer.parseInt(tempRow.get("alarmThresholdValue").toString());
				String alarmMetric = tempRow.get("alarmMetric").toString();
				String email = tempRow.get("email").toString();
				String alarmOperator = tempRow.get("alarmOperator").toString();

				ElasticSearchService elasticSearchService = new ElasticSearchService();
				SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd'T'HH:mm:ss.SSSZ");
				final String executionTime = sdf.format(new Date(lastExecutionTime));

				final int threshold = alarmThresholdValue * 100;
				if(alarmOperator.equalsIgnoreCase("greaterThan")){
					final List<Map<String, Object>> results = ElasticSearchService.searchLogsGreaterThan(vmName, executionTime,alarmMetric, threshold,10);
					for(Map<String,Object>result:results){
						if(Integer.parseInt(result.get(alarmMetric).toString())>=threshold){
							emailService.sendEmail(email,"Alert from Azvasa",String.format("<b>Alarm with name %s for your VM %s has been triggered</b>",alarmName,vmName));
							alarmService.updateTriggeringAlarm(alarmName, vmName);
							break;
						}
					}
				}else{
					final List<Map<String, Object>> results = ElasticSearchService.searchLogsLesserThan(vmName, executionTime, alarmMetric, alarmThresholdValue * 100, 10);
					for(Map<String,Object>result:results){
						if(Integer.parseInt(result.get(alarmMetric).toString())<=threshold){
							emailService.sendEmail(email,"Alert from Azvasa",String.format("<b>Alarm with name %s for your VM %s has been triggered</b>",alarmName,vmName));
							alarmService.updateTriggeringAlarm(alarmName, vmName);
							break;
						}
					}
				}
			}
		}
	}
}
