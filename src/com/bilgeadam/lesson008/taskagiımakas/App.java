package com.bilgeadam.lesson008.taskagiımakas;

public class App {

    public static void main(String[] args) {

        TasKagitMakas tasKagitMakas=new TasKagitMakas();

     //   System.out.println(tasKagitMakas.secimYap()); ;
//        tasKagitMakas.karsilastirma2("Tas","Kagıt");
//        tasKagitMakas.karsilastirma2("Tas","Makas");
//        tasKagitMakas.karsilastirma2("Makas","Kagıt");
//        tasKagitMakas.karsilastirma2("Makas","Tas");
//        tasKagitMakas.karsilastirma2("Kagıt","Tas");
//        tasKagitMakas.karsilastirma2("Kagıt","Makas");
//        tasKagitMakas.karsilastirma2("Makas","Makas");
        tasKagitMakas.oyuncuAdi="Mustafa";
        tasKagitMakas.oyun();
        System.out.println(tasKagitMakas.skor);
        TasKagitMakas tasKagitMakas2=new TasKagitMakas();
        tasKagitMakas2.oyuncuAdi="Özge";
        tasKagitMakas2.oyun();
    }
}
