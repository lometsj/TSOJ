package com.mith.tsoj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class controller {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "index";
    }
}
