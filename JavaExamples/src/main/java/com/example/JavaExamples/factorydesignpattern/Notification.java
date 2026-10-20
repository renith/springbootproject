package com.example.JavaExamples.factorydesignpattern;

public interface Notification {

    public void notifyUser();
}

class SMSNotification implements Notification{

    public void notifyUser(){
        System.out.println("SMSNotification");
    }
}
class PushNotification implements Notification{

    public void notifyUser(){
        System.out.println("PushNotification");
    }
}
class EmailNotification implements Notification{

    public void notifyUser(){
        System.out.println("EmailNotification");
    }
}


