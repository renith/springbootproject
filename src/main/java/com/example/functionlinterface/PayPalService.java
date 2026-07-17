package com.example.functionlinterface;


import org.springframework.stereotype.Component;

@Component("paypalService")
public class PayPalService implements PaymentService {
    @Override
    public void get() {
        System.out.println("Paid via PayPal");
    }
}
