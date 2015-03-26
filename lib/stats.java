import java.net.URL;

import com.vmware.vim25.VirtualMachineQuickStats;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.ServiceInstance;
import com.vmware.vim25.mo.VirtualMachine;

public class stats {
	
	public static void main(String[] args) throws Exception
	{
		URL url = new URL("https://130.65.132.109/sdk");
		ServiceInstance si = new ServiceInstance(url, "administrator", "12!@qwQW", true);
		Folder root_folder = si.getRootFolder();
		ManagedEntity[] vm_pool = new InventoryNavigator(root_folder).searchManagedEntities("VirtualMachine");
		
		for (int i = 0; i < vm_pool.length; i++) {
			
			VirtualMachine vm = (VirtualMachine) vm_pool[i];
			
			VirtualMachineQuickStats stas = vm.getSummary().getQuickStats();
			System.out.println("---------------Statistic of " + vm.getName()+ " ----------------");
			System.out.println("Guest Memory usage: " + stas.guestMemoryUsage);
			System.out.println("Host Memory usage: " + stas.hostMemoryUsage);
			System.out.println("Overall CPU usage: " + stas.overallCpuUsage);
	}

	}

}