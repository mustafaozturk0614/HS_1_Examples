package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
    telefon kod ve mail kod adında değişkenlerimiz olsun (int) başlangıc degerleni biz atayalım

    daha sonra dısarıdan bir telefon kodu alacagız birde mail için kod alacagız

    eğer telefon kodu hatlı ise telefon kodu hatalı cıktısını verelim

    eğer mail kodu hatalı ise mail kodu hatalı cıktısını verelim

2- eger kodlar dogru ise dogru cıktılarını verelim

 */
public class Question14 {


    public static void main(String[] args) {

        int telefonKod=654;
        int mailKod=123;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir telefon kodu giriniz");
        int tk= scanner.nextInt();
        System.out.println("Lütfen bir mail kodu giriniz");
        int mk= scanner.nextInt();

        if (tk!=telefonKod){
            System.out.println("Telefon kodu hatalıdır!!!");
        }else {
            System.out.println("Telefon kodu Doğrudur");
        }

        if (mk!=mailKod){
            System.out.println("Mail Kodu hatalıdır!!!!");
        }else {
            System.out.println("Mail kodu Doğrudur");
        }

    }
}
