package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
    telefon kod ve mail kod adında değişkenlerimiz olsun (int) başlangıc degerleni biz atayalım

    daha sonra dısarıdan bir telefon kodu alacagız birde mail için kod alacagız

    ikisde dogru ise sisteme kayıt oldunuz
    telefon dogru mail yanlıs ise email kodu hatalı
    mail dogru telefon yanlıs ise telefon kodu hatalı
    eger ikside yanlıs ise telefon ve email kodu hatalıdır cıktısı verelim

 */
public class Question15 {


    public static void main(String[] args) {

        int telefonKod=654;
        int mailKod=123;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir telefon kodu giriniz");
        int tk= scanner.nextInt();
        System.out.println("Lütfen bir mail kodu giriniz");
        int mk= scanner.nextInt();
        // Yanlış bir çözüm
        if (tk==telefonKod &&mailKod==mk){
            System.out.println("Başarılı bir şekilde uye oldunuz");
            System.out.println("1.kontrol");
        }else {
            System.out.println("1.kontrol");
        }

        if (telefonKod!=tk&&mailKod==mk) {
            System.out.println("Mail kodu dogru telefon kodu hatalıdır");
            System.out.println("2.kontol");
        }else {
            System.out.println("2.kontol");
        }
        if (telefonKod==tk&&mailKod!=mk) {
            System.out.println("Mail kodu hatalı telefon kodu dogrudur");
            System.out.println("3.kontol");
        }

        else {
            System.out.println("3.kontol");
        }
        if (telefonKod!=tk&&mailKod!=mk) {
            System.out.println("mail kodu ve telefon kodu hatalıdır!!!!!");
            System.out.println("4.kontol");
        }
        else {
            System.out.println("4.kontol");
        }

        System.out.println("//////////////////////////////////////////////////");
        //Doğru Çözüm
        if (mailKod==mk&&telefonKod==tk){
            System.out.println("Başarılı bir şekilde uye oldunuz");
            System.out.println("1.kontrol");
        } else if (telefonKod!=tk&&mailKod==mk) {
            System.out.println("Mail kodu dogru telefon kodu hatalıdır");
            System.out.println("2.kontrol");
        } else if (telefonKod==tk&&mailKod!=mk) {
            System.out.println("Mail kodu hatalı telefon kodu dogrudur");
            System.out.println("3.kontrol");
        }else {
            System.out.println("mail kodu ve telefon kodu hatalıdır!!!!!");
            System.out.println("4.kontrol");
        }

    }
}
