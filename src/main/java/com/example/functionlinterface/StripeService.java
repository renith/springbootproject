package com.example.functionlinterface;

import org.springframework.stereotype.Component;

@Component("paypalService")
public class StripeService  implements  PaymentService{
    public void get(){
        System.out.println("fdfdsf");
    }
}
