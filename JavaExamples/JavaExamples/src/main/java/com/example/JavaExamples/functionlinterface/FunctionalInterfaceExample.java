package com.example.JavaExamples.functionlinterface;

public class FunctionalInterfaceExample {

     public static void main(String[] args) {

        PaymentService paymentService = new PayPalService();
        paymentService.get();
    }
}
