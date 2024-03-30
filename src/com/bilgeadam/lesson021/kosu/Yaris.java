package com.bilgeadam.lesson021.kosu;

import java.util.Comparator;
import java.util.List;

public class Yaris {


    public static void main(String[] args) {
        long baslangicZamani = System.nanoTime();


        Kosucu kosucu1 = new Kosucu("Mustafa", 100, baslangicZamani, 5.0);
        Kosucu kosucu2 = new Kosucu("Serkan", 100, baslangicZamani, 1.0);
        Kosucu kosucu3 = new Kosucu("Burhan", 100, baslangicZamani, 1.0);
        Kosucu kosucu4 = new Kosucu("Zeliha", 100, baslangicZamani, 1.0);
        Kosucu kosucu5 = new Kosucu("Ezgi", 100, baslangicZamani, 1.0);
        List<Kosucu> kosucuList = List.of(kosucu1, kosucu2, kosucu3, kosucu4, kosucu5);

        Thread thread1 = new Thread(kosucu1);
        Thread thread2 = new Thread(kosucu2);
        Thread thread3 = new Thread(kosucu3);
        Thread thread4 = new Thread(kosucu4);
        Thread thread5 = new Thread(kosucu5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        kosucuList.stream().forEach(x -> System.out.println(x.getIsim() + "adlı kosucu" + x.getMesafe() + " metreyi" + x.getSure() + "msn koştu"));
        kosucuList.stream().sorted(Comparator.comparingLong(Kosucu::getSure)).forEach(System.out::println);

    }


}
