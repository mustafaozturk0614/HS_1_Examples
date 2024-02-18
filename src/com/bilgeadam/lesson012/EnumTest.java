package com.bilgeadam.lesson012;

import java.util.Scanner;

public class EnumTest {

    public static void main(String[] args) {

        System.out.println(EAylar.HAZIRAN);

        EAylar ay1=EAylar.AGUSTOS;
        // Enum Metotları
        //1-Stringe cevirme metodları
        String ay2=EAylar.AGUSTOS.name();
        String ay3=EAylar.AGUSTOS.toString();

        System.out.println(ay1);
        System.out.println(ay2.toLowerCase());
        System.out.println(ay3);
        // 2 sıralamasını veren moetod( index degerleri)
        System.out.println(EAylar.HAZIRAN.ordinal());
        System.out.println(EAylar.TEMMUZ.ordinal());
        // enumları dizeye aktama metodu
         EAylar [] aylar=EAylar.values();
         Enum [] aylar2= EAylar.values();

         for(EAylar ay: aylar ){
          //  System.out.println(ay);
             System.out.println((ay.ordinal()+1)+"-"+ay.name());
         }

         EAylar.AGUSTOS.isimUzunlugu();

        System.out.println(EAylar.EYLUL.getMevsim());
        System.out.println(EAylar.EYLUL.getGunSayisi());

        // Mevsimi yaz olanları yazdıralım
        for(EAylar ay: aylar ){
            if (ay.getMevsim().equals("Yaz")){
                System.out.println((ay.ordinal()+1)+"-"+ay.name());
            }
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir ay adı giriniz");
        String isim=scanner.nextLine();
        EAylar ay4 =EAylar.valueOf(isim);
        System.out.println(ay4);

    }
}
