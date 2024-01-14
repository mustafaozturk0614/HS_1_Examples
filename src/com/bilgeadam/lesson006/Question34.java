package com.bilgeadam.lesson006;
/*
 bir dizide ard arad gelen 2 indexdeki sayı değeri 2 ise
 true yazdırıp donguyu sonlandıralım yoksa false yazdıralım

 */
public class Question34 {

    public static void main(String[] args) {
        int[] sayilar = { 2, -2, 16, 1258,20, 2 };

        System.out.println(kontrol(sayilar));
       // kontrol2(sayilar);

    }

    public  static boolean kontrol(int [] array ){
        boolean kontrol=false;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]==2&&array[i+1]==2){
                kontrol=true;
                break;
            }
        }
        return  kontrol;
    }
    public  static void kontrol2(int [] array ){
        boolean kontrol=false;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]==2&&array[i+1]==2){
                kontrol=true;
                break;
            }
        }
        System.out.println(kontrol);

    }
}
