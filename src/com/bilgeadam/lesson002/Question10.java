package com.bilgeadam.lesson002;

import java.util.Scanner;

/*

 dışarıdan girilen bir sayının faktoriyelini hesaplayalım

 */
public class Question10 {

    public static void main(String[] args) {

          int faktoriyel=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= scanner.nextInt();;
        for (int i=sayi;i>0;i--){
            faktoriyel=faktoriyel*i;
        }
        System.out.println(faktoriyel);
    }
}
