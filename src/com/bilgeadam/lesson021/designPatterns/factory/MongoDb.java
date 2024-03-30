package com.bilgeadam.lesson021.designPatterns.factory;

public class MongoDb implements ILogger {

    @Override
    public void logToDatabase(String message) {
        System.out.println(message + "===> mongo loglandı");
    }
}
