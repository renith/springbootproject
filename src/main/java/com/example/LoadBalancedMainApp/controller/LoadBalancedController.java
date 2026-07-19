package com.example.LoadBalancedMainApp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LoadBalancedController {
    @Autowired
    private RestTemplate template;
    @GetMapping("/amazon-payment/{price}")
    public String invokePaymentService(@PathVariable int price) {
        String url = "http://demo/test";
        return template.getForObject(url, String.class);
      //  return "fdsf";
    }
}
