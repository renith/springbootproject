package com.example.factorydesignpattern;

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("EmailNotification");
    }
}

class SmsNotification implements Notification {
    public void notifyUser() {
        System.out.println("SmsNotification");

    }
}

class PushNotification implements Notification {

    public void notifyUser() {
        System.out.println("PushNotification");

    }
}

class Main{
    public static void main(String[] args) {
        Notification notification = FactoryDesignPattern.createNotification("SMS");
        notification.notifyUser();
    }
}

