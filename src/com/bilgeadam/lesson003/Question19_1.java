package com.bilgeadam.lesson003;

import java.util.Locale;
import java.util.Scanner;

// 1-/Dışarıdan dogum gununuzun ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre
// burc hesabı yapan program
// Koç Burcu : 21 Mart - 20 Nisan
//
//Boğa Burcu : 21 Nisan - 21 Mayıs
//
//İkizler Burcu : 22 Mayıs - 22 Haziran
//
//Yengeç Burcu : 23 Haziran - 22 Temmuz
//
//Aslan Burcu : 23 Temmuz - 22 Ağustos
//
//Başak Burcu : 23 Ağustos - 22 Eylül
//
//Terazi Burcu : 23 Eylül - 22 Ekim
//
//Akrep Burcu : 23 Ekim - 21 Kasım
//
//Yay Burcu : 22 Kasım - 21 Aralık
//
//Oğlak Burcu : 22 Aralık - 21 Ocak
//Kova Burcu : 22 Ocak - 19 Şubat
//
//Balık Burcu : 20 Şubat - 20 Mar
public class Question19_1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int gun;
        String ay;
        System.out.println("lütfen dogdunuz gunu giriniz");
        gun= scanner.nextInt();
        System.out.println("lütfen dogdunuz ayı giriniz");
        scanner.nextLine();
        ay=scanner.nextLine().toLowerCase();

        switch (ay){
            case "ocak":
                if (gun>31||gun<1){
                    System.out.println("Ocak ayının son gunu 31 Ocaktır ilk gunu 1 Ocak lutfen bu tarihler arasında bir deger giriniz");
                } else if (gun<=21) {
                    System.out.println("Burcunuz Oğlak");
                }else {
                    System.out.println("Burcunuz Kova");
                }
                break;
            case "şubat":
                if (gun>28||gun<1){
                    System.out.println("Şubat ayının son gunu 28 Şubat ilk gunu 1 Şubat lutfen bu tarihler arasında bir deger giriniz");
                } else if (gun<=19) {
                    System.out.println("Burcunuz Kova");
                }else {
                    System.out.println("Burcunuz Balık");
                }
                break;

            case "mart":
                if (gun>31||gun<1){
                    System.out.println("Mart ayının son gunu 31 Mart ilk gunu 1 Mart lutfen bu tarihler arasında bir deger giriniz");
                } else if (gun<=20) {
                    System.out.println("Burcunuz Balık");
                }else {
                    System.out.println("Burcunuz Koç");
                }
                break;
            case "nisan":
                if (gun>30||gun<1){
                    System.out.println("Nisan ayının son gunu 30 Nisan ilk gunu 1 Nisan lutfen bu tarihler arasında bir deger giriniz");
                } else if (gun<=20) {
                    System.out.println("Burcunuz Koç");
                }else {
                    System.out.println("Burcunuz Boğa");
                }
                break;
            case "mayıs":
                if (gun>31||gun<1){
                    System.out.println("Mayıs ayının son gunu 31 Mayıs ilk gunu 1 Mayıs lutfen bu tarihler arasında bir deger giriniz");
                } else if (gun<=21) {
                    System.out.println("Burcunuz Boğa");
                }else {
                    System.out.println("Burcunuz İkizler");
                }
                break;
            case "haziran":
                if (gun>30||gun<1){
                    System.out.println("Haziran ayının son gunu 30 Haziran ilk gunu 1 Haziran lutfen bu tarihler arasında bir deger giriniz");
                } else if (gun<=22) {
                    System.out.println("Burcunuz İkizler");
                }else {
                    System.out.println("Burcunuz Yengeç");
                }
                break;
            case "temmuz":
                if (gun>31||gun<1){
                    System.out.println("Temmuz ayının son gunu 31 Temmuz ilk gunu 1 Temmuz lutfen bu tarihler arasında bir deger giriniz");
                } else if (gun<=22) {
                    System.out.println("Burcunuz Yengeç");
                }else {
                    System.out.println("Burcunuz Aslan");
                }
                break;

            case "ağustos":
                if (gun>31||gun<1){
                    System.out.println("Agustos ayının son gunu 31 Agustos ilk gunu 1 Agustos lutfen bu tarihler arasında bir deger giriniz");
                } else if (gun<=22) {
                    System.out.println("Burcunuz Aslan");
                }else {
                    System.out.println("Burcunuz Başak");
                }
                break;
            case "eylül":
                if (gun>30||gun<1){
                    System.out.println("Eylül ayının son gunu 30 Eylül ilk gunu 1 Eylül lutfen bu tarihler arasında bir deger giriniz");
                } else if (gun<=22) {
                    System.out.println("Burcunuz Başak");
                }else {
                    System.out.println("Burcunuz Terazi");
                }
                break;

            case "ekim":
                if (gun>31||gun<1){
                    System.out.println("Ekim ayının son gunu 31 Ekim ilk gunu 1 Ekim lutfen bu tarihler arasında bir deger giriniz");
                } else if (gun<=22) {
                    System.out.println("Burcunuz Terazi");
                }else {
                    System.out.println("Burcunuz Akrep");
                }
                break;
            case "kasım":
                if (gun>30||gun<1){
                    System.out.println("Kasım ayının son gunu 30 Kasım ilk gunu 1 Kasım lutfen bu tarihler arasında bir deger giriniz");
                } else if (gun<=21) {
                    System.out.println("Burcunuz Akrep");
                }else {
                    System.out.println("Burcunuz Yay");
                }
                break;
            case "aralık":
                if (gun>31||gun<1){
                    System.out.println("Aralık ayının son gunu 31 Aralık ilk gunu 1 Aralık lutfen bu tarihler arasında bir deger giriniz");
                } else if (gun<=21) {
                    System.out.println("Burcunuz Yay");
                }else {
                    System.out.println("Burcunuz Oğlak");
                }
                break;
            default:
                System.out.println("lütfen 1 ile 12 arasında bir sayi giriniz");
                break;
        }




    }
}
