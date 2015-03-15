package hello;

import com.vmware.vim25.VirtualMachineCapability;
import com.vmware.vim25.VirtualMachineConfigInfo;
import com.vmware.vim25.mo.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) throws MalformedURLException, RemoteException {

        long start = System.currentTimeMillis();
        URL url = new URL("https://130.65.132.14/sdk");
        ServiceInstance si = new ServiceInstance(url, "administrator", "12!@qwQW", true);
        long end = System.currentTimeMillis();
        System.out.println("time taken:" + (end-start));
        Folder rootFolder = si.getRootFolder();
        ManagedEntity[] mes = new InventoryNavigator(rootFolder).searchManagedEntities("VirtualMachine");
        if(mes==null || mes.length ==0)
        {
            return "This didnt work";
        }

        VirtualMachine vm = (VirtualMachine) mes[0];

        VirtualMachineConfigInfo vminfo = vm.getConfig();
        VirtualMachineCapability vmc = vm.getCapability();

        vm.getResourcePool();
        String vmname = vm.getName();
        System.out.println("Hello " + vmname);
        System.out.println("GuestOS: " + vminfo.getGuestFullName());
        System.out.println("Multiple snapshot supported: " + vmc.isMultipleSnapshotsSupported());

        si.getServerConnection().logout();

        model.addAttribute("name", vmname);
        model.addAttribute("hello", "prasad");

        return "prasad";
    }

}
