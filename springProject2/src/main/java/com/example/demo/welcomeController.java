package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

//    @GetMapping("/welcome")
    @RequestMapping(method = RequestMethod.GET, path = "/welcome")
    public String welcome(){
        return "Welcome to Spring boot";
    }
}
