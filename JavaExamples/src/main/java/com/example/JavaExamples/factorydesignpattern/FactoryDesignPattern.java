package com.example.JavaExamples.factorydesignpattern;

public class FactoryDesignPattern {

    public static Notification getInstance(String type){

        switch (type){
            case "SMS":
                return   new SMSNotification();
            case "PUSH":
                return new  PushNotification();
            case "EMAIL":
                return  new EmailNotification();
            default:
                throw  new IllegalArgumentException("fffh");

        }
    }

    public static void main(String[] args) {
        Notification obj = FactoryDesignPattern.getInstance("EMAIL");
        obj.notifyUser();

    }
}
