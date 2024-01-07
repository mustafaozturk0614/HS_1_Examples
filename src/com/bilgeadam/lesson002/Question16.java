package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
    switch-case

    Pizza boyutu sececeğiz
    dısarıdan bir secim alacagaız
    S, "kucuk boy pizza sectiniz"
    M,  otra boy pizza sectiniz
    L, buyuk boy pizza sectiniz
    Xl ekstra buyuk  boy pizza sectiniz
 */
public class Question16 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir pizza boyutu seciniz");
        String secim=scanner.nextLine();

        switch (secim){
            case "S":
                System.out.println("kucuk boy pizza sectiniz");
                break;
            case "M":
                System.out.println("orta boy pizza sectiniz");
                break;
            case "L":
                System.out.println("buyuk boy pizza sectiniz");
                break;
            case "XL":
                System.out.println("extra buyuk boy pizza sectiniz");
                break;
            default:
                System.out.println("Yanlış bir secim yaptınız");
                break;
        }
    }




}
