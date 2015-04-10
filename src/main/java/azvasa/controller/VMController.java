package azvasa.controller;

import azvasa.model.VMachine;
import azvasa.services.VmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import azvasa.model.User;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/api/v1")
public class VMController {

    @Autowired
    VmService vmService;
        
    @RequestMapping(value = "/vms", method=RequestMethod.GET)
    @ResponseBody
    public List<VMachine>  getVms() throws RemoteException {
        List<VMachine> allVirtualMachines = vmService.getAllVirtualMachines();
        if(allVirtualMachines==null||allVirtualMachines.isEmpty()){
            throw new NoContentException("No Virtual Machines Found!");
        }
        return allVirtualMachines;
    }

    @ExceptionHandler(value={RemoteException.class,InterruptedException.class})
    public ResponseEntity<String> handleException(){
       HttpHeaders headers = new HttpHeaders();
        headers.put("Content-Type", Arrays.asList("application/json"));
        return new ResponseEntity<String>("{\"error\":\"Please contact service provider\"}",headers,HttpStatus.SERVICE_UNAVAILABLE);
    }


    @RequestMapping(value = "/vms/{vm-name}/on", method=RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String>  powerOnVM(@PathVariable("vm-name") String vmName) throws RemoteException, InterruptedException {

        vmService.powerOnVM(vmName);

        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(value = {"/vms/{vm-name}/off"}, method = RequestMethod.POST)
    public ResponseEntity<String> powerOffVM(@PathVariable("vm-name") String vmName) throws RemoteException, InterruptedException {
        vmService.powerOffVM(vmName);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(value = {"/vms/create/{vm-type}"}, method = RequestMethod.GET)
    public ResponseEntity<String> createVm(@PathVariable("vm-type") String vmType) throws RemoteException, InterruptedException {
       String vmName = "new_"+vmType+"_vm";
        //TODO: also allow user to specify the VM name ?
        try {
            //vmType: linx , windows
            vmService.deployVM(vmType,vmName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<String>(HttpStatus.OK);
    }
}