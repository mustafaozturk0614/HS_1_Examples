package com.bilgeadam.lesson003;

import java.util.Scanner;

//dısarıdan girilen sayının mukemmel sayı olup olmadıgını bulalım
//        mukemmel sayı kendisi haric bölenlerinin toplamı kendise eşit olan sayı
//        6=1+2+3
public class Question20 {

    public static void main(String[] args) {
        System.out.println("Program başladı");
        int toplam=0;
        System.out.println("Lütfen bir sayi giriniz");
        int sayi=new Scanner(System.in).nextInt();

        for (int i=1;i<=sayi/2;i++){
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if (sayi==toplam){
            System.out.println(sayi+ " Mükemmel sayıdır");
        }else {
            System.out.println(sayi+ " Mükemmel sayı değildir!!!");
        }
        System.out.println("Program sonlandı.....");

    }

}
