package com.bilgeadam.lesson022.dependencyInversıon;

public class EmailNotification implements INotification {
    public void sendNotification(String message) {
        System.out.println("email bildirimi gonderildi");
        System.out.println(message);
    }
}
