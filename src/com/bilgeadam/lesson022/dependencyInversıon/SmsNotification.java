package com.bilgeadam.lesson022.dependencyInversıon;

public class SmsNotification implements INotification {

    public void sendNotification(String message) {
        System.out.println("sms bildirimi gonderildi");
        System.out.println(message);
    }
}
