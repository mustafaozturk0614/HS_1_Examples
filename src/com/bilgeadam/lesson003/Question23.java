package com.bilgeadam.lesson003;

import java.util.Scanner;

/*

        iki tane sayı değişkenimiz olsun
        daha sonra dışarıdan bu sayılara hangi işlemi yaptırmak istiryorsam
        ona gore bir işlem sececeğiz ( toplama bölme cıkarma capma (+,-,/,*)
        dışardan sectiğimiz işlem yapılacak ve bize sonuc deger yazdılracak
 */
public class Question23 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String karar="";
        do{
            System.out.println("Lütfen birinci sayiyi giriniz");
            int sayi1=scanner.nextInt();
            System.out.println("Lütfen ikinci sayiyi giriniz");
            int sayi2=scanner.nextInt();


            System.out.println("""
        ********************************
        **********HESAP MAKİNESİ********
        ********************************
        1-TOPLAMA (+)
        2-ÇIKARMA (-)
        3-ÇARPMA (*)
        4-BÖLME (/)
        """
            );
            System.out.println("Lütfen secim yapınız");
            scanner.nextLine();
            String secim=scanner.nextLine();
            int sonuc=0;
            switch (secim){
                case "+":
                    sonuc=sayi1+sayi2;
                    break;
                case "-":
                    sonuc=sayi1-sayi2;
                    break;
                case "*":
                    sonuc=sayi1*sayi2;
                    break;
                case "/":
                    System.out.println("bolum= "+(sayi1/(double)sayi2));
                    break;
                default:
                    System.out.println("yanlış bir secim yaptınız...");
                    break;
            }
            System.out.println("sonuc="+ sonuc );
            System.out.println("Yeni bir işlem yapmak istiyormusunuz (E/H)");

            karar=scanner.nextLine();
        } while(karar.equalsIgnoreCase("e"));

    }
}
