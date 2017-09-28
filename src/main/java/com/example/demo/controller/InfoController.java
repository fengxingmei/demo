package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RefreshScope
@RestController
public class InfoController {

    @Value("${spring.datasource.driver-class-name}")
    private String driverClass;

    @RequestMapping("/info")
    public String driverClass(){
        return this.driverClass;
    }

    public void setDriverClass(String s){
        this.driverClass = s;
    }

    public String getDriverClass() {
        return driverClass;
    }
}
