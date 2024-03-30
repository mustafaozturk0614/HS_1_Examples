package com.bilgeadam.lesson021.designPatterns.factory;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen loglama yapcagınız databse ismini giriniz");
        String dbName = scanner.nextLine().toLowerCase();
        ILogger logger = DatabaseFactory.createDatabase(dbName);
//        switch (dbName) {
//            case "postgre":
//                logger = new PostgreSql();
//                break;
//            case "mongo":
//                logger = new MongoDb();
//                break;
//
//        }
        logger.logToDatabase("hata olustu");

    }

}
