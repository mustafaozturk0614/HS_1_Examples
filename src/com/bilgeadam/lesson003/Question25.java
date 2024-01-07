package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
dışarıdan bir kelime  ve harf alacagğız
dışardan aldıgğımız har bu kelimenin içinde kaç defa geçiyor onu bulalım
 */
public class Question25 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime=scanner.nextLine();
        System.out.println("Lütfen bir harf giriniz");
        String harf=scanner.nextLine();

        int sayac=0;
        for (int i=0;i<kelime.length();i++){
            if (kelime.charAt(i)==harf.charAt(0)){
                sayac++;
            }
        }
        System.out.println("harf sayısı==>"+ sayac);

        sayac=0;
        //2 .çözüm
        for (int i=0;i<kelime.length();i++){
            String value=String.valueOf(kelime.charAt(i));
         //   String value2=Character.toString(kelime.charAt(i));
            if (harf.equals(value)){
                sayac++;
            }
        }

        System.out.println("harf sayısı==>"+ sayac);
    }
}
