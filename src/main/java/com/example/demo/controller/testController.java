package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/dc")
    public String dc(){
        String service = "Service is started " ;
        System.out.println(service);
        return service;
}

}
