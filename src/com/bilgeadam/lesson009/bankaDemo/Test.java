package com.bilgeadam.lesson009.bankaDemo;

import java.util.UUID;

public class Test {


    public static void main(String[] args) {

        Banka banka=new Banka("Ziraat","5001");
        VadesizHesap vadesizHesap1= new VadesizHesap(UUID.randomUUID().toString(),1500,"Mustafa",55000,50000);
        VadesizHesap vadesizHesap2= new VadesizHesap(UUID.randomUUID().toString(),5500,"Mustafa",95000,90000);
        VadesizHesap vadesizHesap3= new VadesizHesap(UUID.randomUUID().toString(),15000,"Mustafa",80000,80000);
        VadesizHesap vadesizHesap4= new VadesizHesap(UUID.randomUUID().toString(),500,"Mustafa",5000,5000);
        VadesizHesap vadesizHesap5= new VadesizHesap(UUID.randomUUID().toString(),0,"Mustafa",4000,40000);

        VadeliHesap vadeliHesap1=new VadeliHesap(UUID.randomUUID().toString(),100000,"Mustafa",0.5,32);
        VadeliHesap vadeliHesap2=new VadeliHesap(UUID.randomUUID().toString(),200000,"Mustafa",0.8,365);
        VadeliHesap vadeliHesap3=new VadeliHesap(UUID.randomUUID().toString(),300000,"Mustafa",0.5,32);
        VadeliHesap vadeliHesap4=new VadeliHesap(UUID.randomUUID().toString(),400000,"Mustafa",0.5,32);
        VadeliHesap vadeliHesap5=new VadeliHesap(UUID.randomUUID().toString(),500000,"Mustafa",0.5,32);

        banka.getHesaplar()[0]=vadeliHesap1;
        banka.getHesaplar()[1]=vadeliHesap2;




       Hesap [] hesaplar={vadeliHesap1,vadeliHesap2,vadeliHesap3,vadeliHesap4,
               vadeliHesap5,vadesizHesap1,vadesizHesap2,vadesizHesap3,vadesizHesap4,vadesizHesap5};

       banka.setHesaplar(hesaplar);

        for (int i = 0; i < banka.getHesaplar().length ; i++) {
              Hesap hesap=banka.getHesaplar()[i];
             hesap.setBanka(banka);
            System.out.println(banka.getHesaplar()[i]);
        }
        System.out.println("///////////////////////////////////////");
        for(Hesap hesap : banka.getHesaplar()){
            System.out.println(hesap);
        }
        System.out.println(vadeliHesap3.getBanka());


    }
}
