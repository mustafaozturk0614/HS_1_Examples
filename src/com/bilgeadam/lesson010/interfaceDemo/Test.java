package com.bilgeadam.lesson010.interfaceDemo;





import java.util.UUID;

public class Test {


    public static void main(String[] args) {

VadesizHesap vadesizHesap1= new VadesizHesap(UUID.randomUUID().toString(),1500,"Mustafa",55000,50000);
     VadeliHesap vadeliHesap1=new VadeliHesap(UUID.randomUUID().toString(),100000,"Mustafa",32);
     VadeliHesap vadeliHesap2=new VadeliHesap(UUID.randomUUID().toString(),200000,"Serkan",365);
     vadeliHesap1.setFaizOrani(0.08);
     vadeliHesap1.hesapBilgileriGetir();
     vadeliHesap2.hesapBilgileriGetir();

       VadeliHesap.setFaizOrani(0.15);

        vadeliHesap1.hesapBilgileriGetir();
        vadeliHesap2.hesapBilgileriGetir();

        vadeliHesap1.paraCek(150);
        vadesizHesap1.paraCek(500);
    }
}
