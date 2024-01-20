package com.bilgeadam.lesson007;

import java.util.Arrays;

public class LinkedinProfile {

    // Veri alanları (Fields) özellikler
    public  String isim;
    public  String soyIsim;
    public  String meslek;
    public String avatarUrl;
    public  String  adres;
    public int takipci;
    public int baglanti;
    public boolean calismayaAcikmi;
    public  String [] bolumler=new String[10];


    ////// Sınfın davranışları metotlar //////////////////

    public void bolumEkle(String bolum,int index){
        System.out.println("Bolum Ekleniyor....");
        bolumler[index]=bolum;
        System.out.println(bolum+ "=>>>> eklendi");
    }

    public void bolumleriYazdir(){
        for (int i = 0; i < bolumler.length ; i++) {
            System.out.println(bolumler[i]);
        }
    }

    public void calismaDurumuDegistir(){
     // boolean kontrol=calismayaAcikmi;
        System.out.println("Calısma durumu degiştiriliyor");
        if (calismayaAcikmi){
            calismayaAcikmi=false;
        }else {
            calismayaAcikmi=true;
        }
        //kısa yazımı
      // calismayaAcikmi= !calismayaAcikmi;

    }

    public void profilBilgileriGoster(){
        System.out.println("isim soy isim= "+isim+" "+soyIsim);
        System.out.println("meslek= "+meslek);
        System.out.println("adres= "+adres);
        System.out.println("takipci sayısı= "+takipci);
        System.out.println("baglantı sayısı= "+baglanti);
        System.out.println("calısmaya acıkmı= "+calismayaAcikmi);
        System.out.println("bolumler= "+ Arrays.toString(bolumler));

    }


}
