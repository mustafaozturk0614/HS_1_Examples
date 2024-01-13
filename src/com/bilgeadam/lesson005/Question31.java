package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
        kullanıcıdan bir ulke ismi alalım
        daha sonra bu ülke ismi eger arayimizde var ise
        girdiğiniz ülke bulundu
        yok ise girdiğiniz ülke bulunamadı cıktısını versin


 */
public class Question31 {

    public static void main(String[] args) {

        String [] dizi={"Türkiye","Japonya","Danimarka","Fransa"};
       // ulkeKontrol(dizi);
        //System.out.println(ulkeKontrol2(dizi));

        String ulke = ulkeAdiGir();
        System.out.println(ulkeKontrol3(dizi,ulke));   ;
        System.out.println(ulkeKontrol3(dizi,"Fransa"));   ;


    }

    private static String ulkeAdiGir() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir ülke giriniz");
        String ulke=scanner.nextLine();
        return ulke;
    }

    public  static  String ulkeKontrol3(String [] ulkeler ,String ulke){
        boolean kontrol=false;
        for (int i = 0; i <ulkeler.length; i++) {
            if (ulke.equalsIgnoreCase(ulkeler[i])){
                kontrol=true;
                break;
            }
        }
        if (kontrol){
            return     "Ülke bulundu";
        }else {
            return    "Ülke bulunamadı!!!!";
        }
    }


    public  static  void ulkeKontrol(String [] ulkeler){
        String ulke=ulkeAdiGir();
        boolean kontrol=false;
        for (int i = 0; i <ulkeler.length; i++) {
            if (ulke.equalsIgnoreCase(ulkeler[i])){
                kontrol=true;
                break;
            }
        }
        if (kontrol){
            System.out.println("Ülke bulundu");
        }else {
            System.out.println("Ülke bulunamadı!!!!");
        }
    }
    public  static  String ulkeKontrol2(String [] ulkeler){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir ülke giriniz");
        String ulke=scanner.nextLine();
        boolean kontrol=false;
        for (int i = 0; i <ulkeler.length; i++) {
            if (ulke.equalsIgnoreCase(ulkeler[i])){
                kontrol=true;
                break;
            }
        }
        if (kontrol){
         return     "Ülke bulundu";
        }else {
         return    "Ülke bulunamadı!!!!";
        }
    }

}
