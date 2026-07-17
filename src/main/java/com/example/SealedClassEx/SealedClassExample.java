package com.example.SealedClassEx;

sealed class Vehicle permits Car, Bike {
    public void get() {
        System.out.println("Vehicle get()");
    }
}

final class Car extends Vehicle {
    public void get() {
        System.out.println("Car get()");
    }
}

final class Bike extends Vehicle {
    public void get() {
        System.out.println("Bike get()");
    }
}

public class SealedClassExample {
    public static void main(String[] args) {
        Vehicle b = new Bike();
        b.get();
    }
}
