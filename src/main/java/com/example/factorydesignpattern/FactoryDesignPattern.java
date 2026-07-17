package com.example.factorydesignpattern;

class FactoryDesignPattern {

    public static Notification createNotification(String type) {

        switch (type) {
            case "SMS":
                return new SmsNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("unknown pattern");
        }
    }

}

