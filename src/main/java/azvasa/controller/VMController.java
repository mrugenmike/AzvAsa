package azvasa.controller;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.*;

import azvasa.model.VMachine;
import azvasa.services.VmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/api/v1")
public class VMController {

    @Autowired
    VmService vmService;

	
    @RequestMapping("/dashboard")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) throws MalformedURLException, RemoteException {
		model.addAttribute("loggedInUser", "Admin");
        return "dashboard";
    }
    
    @RequestMapping(value = "/vms", method=RequestMethod.GET)
    @ResponseBody
    public List<VMachine>  getVms() throws RemoteException {
        List<VMachine> allVirtualMachines = vmService.getAllVirtualMachines();
        if(allVirtualMachines==null||allVirtualMachines.isEmpty()){
            throw new NoContentException("No Virtual Machines Found!");
        }
        return allVirtualMachines;
    }

    @ExceptionHandler(RemoteException.class)
    public ResponseEntity<String> handleException(){
       HttpHeaders headers = new HttpHeaders();
        headers.put("Content-Type", Arrays.asList("application/json"));
        return new ResponseEntity<String>("{\"error\":\"Please contact service provider\"}",headers,HttpStatus.SERVICE_UNAVAILABLE);
    }
}
