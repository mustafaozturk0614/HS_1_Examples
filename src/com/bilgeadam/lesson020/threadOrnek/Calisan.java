package com.bilgeadam.lesson020.threadOrnek;

public class Calisan extends Thread {

    String isim;
    long sure;

    public Calisan(String isim, long sure) {
        this.isim = isim;
        this.sure = sure;
    }

    public void bilgiGoster(int sayi) {
        System.out.println(isim + " adlı çalısan çalışıyor==>" + sayi);
    }

    public void calis() {
        for (int i = 1; i <= 5; i++) {
            bilgiGoster(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            bilgiGoster(i);
            try {
                Thread.sleep(sure * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
