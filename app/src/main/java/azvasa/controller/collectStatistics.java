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

	//@Scheduled(fixedRate = 300000)
	public void work() throws Exception {
		try
		{
			Folder rootFolder = serviceInstance.getRootFolder();
			ManagedEntity[] VMs = new InventoryNavigator(rootFolder).searchManagedEntities("VirtualMachine");
			for (int i = 0; i < VMs.length; i++) 
			{
				VirtualMachine vm = (VirtualMachine) VMs[i];
				String vmName = vm.getName();
				VirtualMachineQuickStats stas = vm.getSummary().getQuickStats();
				
				System.out.println("----------Statistic of " + vm.getName()+ " ----------------");
				System.out.println("Guest Memory usage: " + stas.guestMemoryUsage);
				System.out.println("Host Memory usage: " + stas.hostMemoryUsage);
				System.out.println("Overall CPU usage: " + stas.overallCpuUsage);

				//insert into Database
				String stats = String.format("insert into stats(vm_name,overall_cpu_usage,guest_memory_usage,host_memory_usage) VALUES('%s','%s','%s','%s')",vm.getName(),stas.overallCpuUsage,stas.guestMemoryUsage,stas.hostMemoryUsage);
				template.execute(stats);
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
