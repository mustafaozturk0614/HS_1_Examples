package com.bilgeadam.lesson013.menu.stack;

import java.util.Random;

public class Test {


    public static void main(String[] args) throws InterruptedException {
        TabakManager tabakManager=new TabakManager();
        tabakManager.tabakOlustur();
        System.out.println(tabakManager.kirliler);
        System.out.println(tabakManager.temizler);
        Random random=new Random();
        for (int i = 0; i <20 ; i++) {
            int secim= random.nextInt(1,3);

            tabakManager.secimYap(secim);
            Thread.sleep(1000);
        }

    }
}
