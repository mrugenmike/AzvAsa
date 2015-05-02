package azvasa.controller;

import azvasa.model.AlarmCreationRequest;
import azvasa.services.AlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.RemoteException;
import java.util.List;
import azvasa.model.AlarmModel;

@RequestMapping("/api/v1")
@RestController
public class AlarmController {

    @Autowired
    private AlarmService alarmService;

    @RequestMapping(value = "alarms/{vmname}/{alarmname}/{username}",method = RequestMethod.POST)
    ResponseEntity<String> createAlarm(@RequestBody AlarmCreationRequest alarmCreationRequest,@PathVariable String vmname,@PathVariable String alarmname , @PathVariable String username){
        try
        {
            alarmService.createAlarm(username,vmname,alarmname,alarmCreationRequest);
        }
        catch(RemoteException e) {
            e.printStackTrace();
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(value = "alarms/{vmname}/{username}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    List getAlarms(@PathVariable String vmname , @PathVariable String username) throws Exception
    {
        List alarms = alarmService.getAlarms(username,vmname);
        return alarms;
    }

    @RequestMapping(value = "sendAlarmNotification/",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void sendEmailNotification() throws Exception
    {
        alarmService.sendEmailNotification();
    }
}
