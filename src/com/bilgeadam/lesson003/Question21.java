package com.bilgeadam.lesson003;

import java.util.Scanner;
/*
    Wrapper sınıflar nelerdir primitive turlerle ilişkileri
 */
/*
3-dışarıdan girlen 0 ile 100 arasındaki(100 dahil)
5 adet sayıdan en buyuk ve ne kucuk olanı bulup ekrana yazdıralım
 */
public class Question21 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int max=-1;
        int min=101;
//       int max2=Integer.MIN_VALUE;
//       int min2=Integer.MAX_VALUE;

        for (int i=0;i<5;i++){
            System.out.println("Lütfen bir sayi giriniz");
            int sayi= scanner.nextInt();
            if (sayi>100 || sayi<0){
                System.out.println("0 ile 100 arasında bir sayı giriniz");
                i--;
            }else {
                if (sayi>max){
                    max=sayi;
                }
                if (sayi<min){
                    min=sayi;
                }
            }
        }
        System.out.println("max= "+ max);
        System.out.println("min= "+ min);
    }
}
