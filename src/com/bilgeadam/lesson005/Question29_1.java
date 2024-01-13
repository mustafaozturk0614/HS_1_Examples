package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
Dışarıdan girilen kelimen Palindrom olup olmadıgını kontrol edelim
 Palindrom keliimler tersden yazılışı kendisine eşit olan kelimelerdir➔ kek kabak iyi gib

 */
public class Question29_1 {


    public static void main(String[] args) {

        System.out.println("Lütfen bir metin giriniz");
        Scanner scanner=new Scanner(System.in);
        boolean kontrol=true;
        String metin= scanner.nextLine();
        for (int i = 0; i <metin.length()/2 ; i++) {
                //kabak
            if (metin.charAt(i) !=metin.charAt(metin.length()-1-i)){
                kontrol=false;
                break;
            }
        }

        if (kontrol){
            System.out.println(metin+"==> Palindromdur");
        }else {
            System.out.println(metin+"==> Palindrom Değildir !!!!");
        }


    }

}
