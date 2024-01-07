package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
4-Dışarıdan girilne bir sayının asal sayı olup olmadıgını bulalım asal ise
asaldır çıktısı verelim asal değil ise asal değildir çıktısını verelim
 */
public class Question22 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();
        boolean asalmi=true;
        if (sayi==2){
            System.out.println("2 bir asal sayıdır");

        }else{
            for (int i = 2; i <sayi ; i++) {
                    if (sayi%i==0){
                        asalmi=false;
                        break;
                    }
            }
            if (asalmi){
                System.out.println(sayi+" Asal sayıdır");
            }else{
                System.out.println(sayi+" Asal sayı değildir");
            }
        }


    }
}
