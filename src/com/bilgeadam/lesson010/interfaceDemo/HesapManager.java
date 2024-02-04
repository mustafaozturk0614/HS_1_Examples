package com.bilgeadam.lesson010.interfaceDemo;

import com.bilgeadam.lesson009.bankaDemo2.KrediHesabi;

import java.util.Random;
import java.util.UUID;

public class HesapManager {
    public static  void paraCek(double miktar,VadesizHesap vadesizHesap){
        System.out.println("1.metot");
            vadesizHesap.paraCek(miktar);

    }
    public  static void paraCek(double miktar,VadeliHesap vadeliHesap){
        System.out.println("2.metot");
        vadeliHesap.paraCek(miktar);

    }

    public static   void paraCek(double miktar,Hesap hesap){
        System.out.println("3.metot");
            if (hesap instanceof VadeliHesap){
                System.out.println(hesap.getClass().getSimpleName());
                Random random=new Random();
                boolean kontrol= random.nextBoolean();
                if (kontrol){
                   hesap.setBakiye(hesap.getBakiye()-miktar);
                }else{
                    System.out.println("Vade gununuz gelmemiştir!!!");
                }

            }else if ( hesap instanceof  VadesizHesap){
                System.out.println(hesap.getClass().getSimpleName());
                hesap.setBakiye(hesap.getBakiye()-miktar);
            }
            else if ( hesap instanceof  KrediHesabı){
                System.out.println(hesap.getClass().getSimpleName());
                hesap.setBakiye(hesap.getBakiye()-miktar);
            }
            else {
                System.out.println("hesap bulunamadı");
            }

    }

    public  static void  paraCekPolimorfism(double miktar,Hesap hesap){
        hesap.paraCek(miktar);
    }

    public static void main(String[] args) {
        Hesap vadesizHesap1= new VadesizHesap(UUID.randomUUID().toString(),1500,"Mustafa",55000,50000);
        Hesap vadeliHesap1=new VadeliHesap(UUID.randomUUID().toString(),100000,"Mustafa",32);
        Hesap krediHesabı=new KrediHesabı(UUID.randomUUID().toString(),10000,"Serkan");
    paraCek(500,vadesizHesap1);
    paraCek(500,vadeliHesap1);
    paraCek(600,krediHesabı);

        System.out.println("///////////////////////////////");
        paraCekPolimorfism(500,vadeliHesap1);
        paraCekPolimorfism(250,vadesizHesap1);
        paraCekPolimorfism(600,krediHesabı);

    //    vadeliHesap1.faziGetirisiHesapla();
        ((VadeliHesap) vadeliHesap1).hesapBilgileriGetir();
        Banka banka1=new Banka("Ziraat","123");
        Object banka2=new Banka("Ziraat","123");
        banka1.getHesaplar();
        ((Banka) banka2).getHesaplar();

    }
}
