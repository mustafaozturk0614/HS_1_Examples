package com.bilgeadam.lesson002;

import java.util.Scanner;

/*

Girilen sayının basamakları toplamını ve kaç basamaklı oldugunu ekrana yazdıralım do while
ile yapalım
 */
public class Question11 {

    public static void main(String[] args) {
        int basamakSayisi=0;
        int basamakToplamı=0;
        System.out.println("Lütfen bir sayi giriniz");
        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();
        do {
            int basamakDegeri=sayi%10;
            basamakToplamı+=basamakDegeri;
            basamakSayisi++;
            sayi=sayi/10;
        }while (sayi>0);
        //ctrl + d ile satır aşağı kopyalanır
        System.out.println("basamak toplamı: "+basamakToplamı);
        System.out.println("basamak sayısı: "+basamakSayisi);



    }
}
