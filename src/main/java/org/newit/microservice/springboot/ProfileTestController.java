package org.newit.microservice.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProfileTestController {

    @Value("${org.newit.printMessage}")
    private String profileMessage;

    @RequestMapping("/printProfileMessage")
    @ResponseBody
    public String printProfileMessage(){
        return profileMessage;
    }
}
