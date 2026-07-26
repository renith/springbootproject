package com.example.asyn.controller;


import com.example.asyn.service.ServiceEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Autowired
    private ServiceEmail service;

    @GetMapping("/get")
    public void get(){
        service.sendEmail();

    }
}
