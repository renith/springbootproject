package com.example.functionlinterface;

@FunctionalInterface
public interface PaymentService {  // ✅ must be public
    void get();
}