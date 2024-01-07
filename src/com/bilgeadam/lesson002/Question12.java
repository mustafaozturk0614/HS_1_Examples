package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
    dışarıdan bir taban degeri bidre us degeri alalım bu işlem sonucunu bulup ekra yazdıralum
    (2 uzeri 3 =8)
 */
public class Question12 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen taban degerini giriniz");
        int taban=scanner.nextInt();
        System.out.println("lütfen üs degerini giriniz");
        int us=scanner.nextInt();
        int sonuc=1;

        for (int i=0 ;i<us;i++){
            sonuc*=taban;
        }

        System.out.println(taban+"^"+us+"= "+sonuc);

    }

}
