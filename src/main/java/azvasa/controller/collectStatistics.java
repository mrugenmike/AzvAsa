package azvasa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.vmware.vim25.VirtualMachineQuickStats;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.ServiceInstance;
import com.vmware.vim25.mo.VirtualMachine;

public class collectStatistics extends Thread{

	 @Autowired
	 ServiceInstance serviceInstance;
	 
	public void run()
	{
		try {
			collectData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void collectData() throws Exception {
		try
		{
			Folder rootFolder = serviceInstance.getRootFolder();
			ManagedEntity[] VMs = new InventoryNavigator(rootFolder).searchManagedEntities("VirtualMachine");
			for (int i = 0; i < VMs.length; i++) 
			{
				VirtualMachine vm = (VirtualMachine) VMs[i];
				VirtualMachineQuickStats stas = vm.getSummary().getQuickStats();
				System.out.println("----------Statistic of " + vm.getName()+ " ----------------");
				System.out.println("Guest Memory usage: " + stas.guestMemoryUsage);
				System.out.println("Host Memory usage: " + stas.hostMemoryUsage);
				System.out.println("Overall CPU usage: " + stas.overallCpuUsage);
				
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
