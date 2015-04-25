package azvasa.controller;

import azvasa.controller.model.AlarmCreationRequest;
import azvasa.services.AlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.rmi.RemoteException;

@RequestMapping("/api/v1")
@RestController
public class AlarmController {

    @Autowired
    private AlarmService alarmService;

    @RequestMapping(value = "alarms/{vmname}/{alarmname}",method = RequestMethod.POST)
    ResponseEntity<String> createAlarm(@RequestBody AlarmCreationRequest alarmCreationRequest,@PathVariable String vmname,@PathVariable String alarmname){
        try {
            alarmService.createAlarm(vmname,alarmname,alarmCreationRequest);
        } catch (RemoteException e) {
            e.printStackTrace();
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
