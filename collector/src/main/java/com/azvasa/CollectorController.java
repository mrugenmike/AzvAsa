package com.azvasa;

import com.azvasa.timer.TimerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.Timer;

@RestController
public class CollectorController {

    private static Timer timer = new Timer();

    @RequestMapping(value = "api/v1/start",method = RequestMethod.POST)
    ResponseEntity<String> startCollector(@RequestBody @Valid StartRequest request){
            timer.cancel();
            timer = new Timer();
            Collector collectorTask = new Collector(request.getVmname(),request.getLogPath());
            timer.schedule(collectorTask, 0, 5*1000);
            return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(value = "api/v1/stop",method = RequestMethod.POST)
    ResponseEntity<String> stopCollector(){
        timer.cancel();
        return new ResponseEntity<String>("Stopped Timer",HttpStatus.OK);
    }
}
