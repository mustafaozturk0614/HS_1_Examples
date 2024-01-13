package com.bilgeadam.lesson005;

import com.bilgeadam.lesson001.ScannerTest;

import java.util.Scanner;

/*

dışardıdan bir metin girelim daha sonra bu metinin tersini bir değişkene atayıp yazdıralım
 Java ====> avaJ

 */
public class Question28 {


    public static void main(String[] args) {

        System.out.println("Lütfen bir metin giriniz");
        Scanner scanner=new Scanner(System.in);
        String tersMetin="";
        String metin= scanner.nextLine();
        for (int i = metin.length()-1; i > -1 ; i--) {
            tersMetin+=metin.charAt(i);
        }

        System.out.println(tersMetin);

    }
}
