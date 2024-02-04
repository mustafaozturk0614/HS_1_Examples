package com.bilgeadam.lesson010.staticOrnek;

public class OgrenciTest {

    public static void main(String[] args) {

        Ogrenci ogrenci1=new Ogrenci();
        ogrenci1.kayit("Mustafa");
        System.out.println(ogrenci1.ogrenciNo);
        System.out.println(ogrenci1.ad);
        Ogrenci ogrenci2=new Ogrenci();
        ogrenci2.kayit("Serkan");
        System.out.println(ogrenci2.ogrenciNo);
        Ogrenci ogrenci3=new Ogrenci();
        ogrenci3.kayit("Özge");
        System.out.println(ogrenci3.ogrenciNo);

        System.out.println(ogrenci1.ad+"==>"+ogrenci1.ogrenciNo);
        System.out.println(ogrenci2.ad+"==>"+ogrenci2.ogrenciNo);
        System.out.println(ogrenci3.ad+"==>"+ogrenci3.ogrenciNo);

    }
}
