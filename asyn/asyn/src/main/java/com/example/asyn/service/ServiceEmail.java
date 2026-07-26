package com.example.asyn.service;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ServiceEmail {

    @Async("customExecutor")
    public void sendEmail() {
        System.out.println("Sending email in thread: " + Thread.currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Email sent!");
    }

}
