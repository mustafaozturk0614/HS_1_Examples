package com.bilgeadam.lesson013.menu.stack;

import java.util.Random;
import java.util.Stack;

public class TabakManager {

    Stack<Tabak> kirliler;
    Stack<Tabak> temizler;

    public TabakManager() {
        this.kirliler=new Stack<>();
        this.temizler=new Stack<>();
    }

 public  void  tabakOlustur(){
     Random random=new Random();
     for (int i = 1; i <11 ; i++) {
         Tabak tabak=new Tabak(i, random.nextBoolean());
        if (tabak.isKirliMi()){
            kirliler.push(tabak);
        }else{
            temizler.push(tabak);
        }
     }
 }


 public void  kullan(){
        if (temizler.isEmpty()){
            System.out.println("Temiz tabak kalmamıstır");
            temizle();
        }

        Tabak tabak=temizler.pop();
     System.out.println(tabak.getId()+" li tabak kullanılımıstır");
     tabak.setKirliMi(true);
     kirliler.push(tabak);
 }

    public void  temizle(){
        if (kirliler.isEmpty()){
            System.out.println("Kirli tabak kalmamıstır");
            kullan();
        }
        Tabak tabak=kirliler.pop();
        System.out.println(tabak.getId()+" li tabak temizlenmiştir");
        tabak.setKirliMi(false);
        temizler.push(tabak);
    }


    public  void  secimYap(int secim){
        switch (secim){
            case 1:
                temizle();
                break;
            case 2:
                kullan();
                break;
            default:
                break;
        }

    }
}
