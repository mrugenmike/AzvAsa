package azvasa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mrugen on 5/3/15.
 */
@Controller
public class kibanaController {


    @RequestMapping("/kibana")
    String kibana(){
        return "kibana";
    }

}
