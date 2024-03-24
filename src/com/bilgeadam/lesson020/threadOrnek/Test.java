package com.bilgeadam.lesson020.threadOrnek;

public class Test {

    public static void main(String[] args) {

        Calisan calisan1 = new Calisan("Mustafa", 1);
        Calisan calisan2 = new Calisan("Sinem", 3);
        Calisan calisan3 = new Calisan("Furkan", 5);
        long start = System.currentTimeMillis();
//        calisan1.calis();
//        calisan2.calis();
//        calisan3.calis();
        calisan1.start();
        calisan2.start();
        calisan3.start();
        try {
            // main threadi bekletiyor
            calisan1.join();
            calisan2.join();
            calisan3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("toplam sure==>" + (end - start));


    }
}
