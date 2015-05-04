package com.azvasa;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollectorController {


    @RequestMapping(value = "api/v1/start",method = RequestMethod.POST,params= {"vmname"})
    ResponseEntity<String> startCollector(@RequestParam(value = "vmname") String vmname)
    {

            ServiceInstanceSingleton.startLogTimer(vmname);

            return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(value = "api/v1/stop",method = RequestMethod.POST,params= {"vmname"})
    ResponseEntity<String> stopCollector(@RequestParam(value = "vmname") String vmname){

        ServiceInstanceSingleton.stopLogTimer(vmname);

        return new ResponseEntity<String>("Stopped Timer",HttpStatus.OK);
    }
}
