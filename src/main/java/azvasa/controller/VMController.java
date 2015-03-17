package azvasa.controller;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import azvasa.model.VMachine;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class VMController {

	
    @RequestMapping("/dashboard")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) throws MalformedURLException, RemoteException {

//        long start = System.currentTimeMillis();
//        URL url = new URL("https://130.65.132.14/sdk");
//        ServiceInstance si = new ServiceInstance(url, "administrator", "12!@qwQW", true);
//        long end = System.currentTimeMillis();
//        System.out.println("time taken:" + (end-start));
//        Folder rootFolder = si.getRootFolder();
//        ManagedEntity[] mes = new InventoryNavigator(rootFolder).searchManagedEntities("VirtualMachine");
//        if(mes==null || mes.length ==0)
//        {
//            return "This didnt work";
//        }
//
//        VirtualMachine vm = (VirtualMachine) mes[0];
//
//        VirtualMachineConfigInfo vminfo = vm.getConfig();
//        VirtualMachineCapability vmc = vm.getCapability();
//
//        vm.getResourcePool();
//        String vmname = vm.getName();
//        System.out.println("Hello " + vmname);
//        System.out.println("GuestOS: " + vminfo.getGuestFullName());
//        System.out.println("Multiple snapshot supported: " + vmc.isMultipleSnapshotsSupported());
//
//        si.getServerConnection().logout();
//        model.addAttribute("name", vmname);
		model.addAttribute("loggedInUser", "Admin");
        return "dashboard";
    }
    
    @RequestMapping(value = "/vms", method=RequestMethod.GET)
    @ResponseBody
    public List<VMachine>  getVms() {
    	ArrayList<VMachine> al = new ArrayList<VMachine>();
    	VMachine v1 = new VMachine("VM_01","Vm on host 1", "130.109.65.211","Green");
    	VMachine v2 = new VMachine("VM_02","Vm on host 1","130.109.65.213","Red");
    	al.add(v1);
    	al.add(v2);
    	return al;    	
    }
}
