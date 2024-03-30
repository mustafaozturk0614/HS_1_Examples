package com.bilgeadam.lesson021.designPatterns.factory;

public class PostgreSql implements ILogger {

    @Override
    public void logToDatabase(String message) {
        System.out.println(message + "===> postgreye loglandı");
    }

}
