package com.bilgeadam.lesson021.designPatterns.factory;

public class DatabaseFactory {


    public static ILogger createDatabase(String dbName) {
        switch (dbName) {
            case "postgre":
                return new PostgreSql();
            case "mongo":
                return new MongoDb();
            default:
                throw new RuntimeException("hatalı database seçimi");
        }
    }
}
