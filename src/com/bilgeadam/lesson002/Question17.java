package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
    klavyeden 0 grilinceye kadar sayı okumaya devam edeceğiz
    0 girildiğinde sayıların toplamını ve ortalamasını yazdıracagız

 */
public class Question17 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int sayi;
        int toplam=0;
        double ort;
        int sayac=0;

        do {
            System.out.println("Lütfen bir sayi giriniz");
           sayi= scanner.nextInt();
            sayac++;
            toplam+=sayi;
        }while (sayi!=0);

        System.out.println("toplam: "+toplam);

        if (sayac==1){
            System.out.println("sadece 0 girildi");
        }else{
            ort=toplam/(double) (sayac-1);
            System.out.println("ortalama:"+ort);
        }



    }
}
