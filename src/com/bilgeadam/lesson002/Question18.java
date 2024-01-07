package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
    klavyeden 0 grilinceye kadar sayı okumaya devam edeceğiz
    0 girildiğinde sayıların toplamını ve ortalamasını yazdıracagız

 */
public class Question18 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int sayi;
        int toplam=0;
        double ort;
        int sayac=0;
        boolean kontrol=true;

        while (kontrol) {
            System.out.println("Lütfen bir sayi giriniz");
            sayi = scanner.nextInt();
            if (sayi==0){
                kontrol=false;
            }else {
                sayac++;
                toplam += sayi;
            }
        }

//        System.out.println("Lütfen bir sayi giriniz");
//        while ((sayi=scanner.nextInt() )!=0) {
//                sayac++;
//                toplam += sayi;
//            System.out.println("Lütfen bir sayi giriniz");
//
//        }
//        while (true) {
//            System.out.println("Lütfen bir sayi giriniz");
//            sayi = scanner.nextInt();
//            if (sayi==0){
//                break;
//            }else {
//                sayac++;
//                toplam += sayi;
//            }
//
//        }

        System.out.println("toplam: "+toplam);

        if (sayac==0){
            System.out.println("sadece 0 girildi");
        }else{
            ort=toplam/(double) (sayac);
            System.out.println("ortalama:"+ort);
        }



    }
}
