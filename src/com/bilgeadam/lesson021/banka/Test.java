package com.bilgeadam.lesson021.banka;

/*
    2 tane thread olusturp   calıstılarım
     1. threadn 1000 kere çalışsın her defasında aynı mıktar parayı hesaba yatırsın (100)
     2. threadn 1000 kere çalışsın her defasında aynı mıktar parayı hesaptan çeksin  (100)
     en sonunda  hesaptaki miktarı gözlemleyelim

 */
public class Test {


    public static void main(String[] args) {

        Hesap hesap = new Hesap();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                hesap.paraCek(100);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                hesap.paraYatir(100);
            }
        });

        thread1.start();
        thread2.start();

    }
}
