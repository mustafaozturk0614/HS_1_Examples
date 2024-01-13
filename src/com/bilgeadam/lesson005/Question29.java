package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
Dışarıdan girilen kelimen Palindrom olup olmadıgını kontrol edelim
 Palindrom keliimler tersden yazılışı kendisine eşit olan kelimelerdir➔ kek kabak iyi gib

 */
public class Question29 {


    public static void main(String[] args) {

        System.out.println("Lütfen bir metin giriniz");
        Scanner scanner=new Scanner(System.in);
        String tersMetin="";
        String metin= scanner.nextLine();
        for (int i = metin.length()-1; i > -1 ; i--) {
            tersMetin+=metin.charAt(i);
        }

        if (metin.equals(tersMetin)){
            System.out.println(metin+"==> Palindromdur");
        }else {
            System.out.println(metin+"==> Palindrom Değildir !!!!");
        }


    }

}
