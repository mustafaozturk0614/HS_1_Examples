package com.bilgeadam.lesson006;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 Adana adlı sehirin plaka kodu : 01
Adıyaman adlı sehrin plaka kodu :02

 */
public class Question35 {

    public static void main(String[] args) {

        String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
                + "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya;100-Edremit;1000-Mengen";

        String [] array=sehirler.split(";");




        plakaVeSehirleriYazdir(array);


    }

    public  static  void plakaVeSehirleriYazdir(String [] array){
        /*
            array[0]="01-Adana";
            array[1]="02-Adıyaman";
         */
        for (int i = 0; i < array.length ; i++) {
            int index=array[i].indexOf("-");
            String code=array[i].substring(0, index);
            String il=array[i].substring(index+1);
            System.out.println(il+" adlı sehirin plaka kodu : "+code);
        }

    }
}
