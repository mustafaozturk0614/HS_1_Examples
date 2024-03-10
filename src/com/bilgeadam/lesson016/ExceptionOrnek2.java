package com.bilgeadam.lesson016;

import java.util.Scanner;

/*
   1- iki tane integer deger alan bir bolme metodu yazalım ve sonucunu yazdıralım
    eger hata fıralatma olasılıgı varsada bunuda yakalayalım

2- yeni bir bolme metodu yazalım scanner ile 2 tane sayı alalım eger hata varsa sayıları tekra alıp bolme işlemini yaptırmaya calısalım
herhanig bir sonuc aldıgımızda ise o sonucu yazdırıp metodu sonlandrabiliriz
 */
public class ExceptionOrnek2 {

    public static void bolme(Integer sayi1, Integer sayi2) {
        try {
            double sonuc = sayi1 / sayi2;
            System.out.println("sonuc==> " + sonuc);
        } catch (ArithmeticException ex) {
            //   ex.printStackTrace();
            System.out.println(ex.toString() + " ====> bir sayi 0' a bölünemez");
        } catch (NullPointerException e) {
            System.out.println(e.toString() + " ===>bir sayi null olamaz");
        } catch (Exception e) {
            System.out.println(e.toString() + " beklenmedik bir hata olustu");
        }
    }

    public static void bolme2(Double sayi1, Double sayi2) {
        System.out.println(sayi1 / sayi2);
    }

    public static void bolme3() {
        Scanner scanner = new Scanner(System.in);
        boolean kontrol = false;
        do {
            try {
                System.out.println("lütfen 1.sayiyi giriniz");
                int sayi1 = scanner.nextInt();
                System.out.println("lütfen 2.sayiyi giriniz");
                int sayi2 = scanner.nextInt();
                double result = sayi1 / sayi2;
                System.out.println("sonuc===>" + result);
                kontrol = true;
            } catch (ArithmeticException e) {
                System.out.println(e.toString() + " ==> 0 a bölünme hatası");

            } catch (Exception e) {
                System.out.println(e.toString() + " bir hata olustu ");

            } finally {
                scanner.nextLine();
            }
        } while (!kontrol);


    }


    public static void main(String[] args) {
//        bolme(null, 0);
//        System.out.println("Program devam ediyor");
//        bolme(6, 0);
//        System.out.println("Program devam ediyor");
//        bolme(6, 2);
//        System.out.println("Program devam ediyor");
//        bolme2(12D, 0D);
        bolme3();
        System.out.println("program devam ediyor");
        System.out.println("program devam ediyor");
        System.out.println("program devam ediyor");
        System.out.println("program devam ediyor");
    }
}
