package com.bilgeadam.lesson002;
/*
    a dan z ye kadar alfebeyi yazdıralım dongu kullanarak;
 */
public class Question13 {


    public static void main(String[] args) {

        char baslangic='a';
        char bitis='z';
        System.out.println("Alfabe");
        for (char harf=baslangic;harf<=bitis;harf++){
            System.out.print(harf+"-");
        }
        System.out.println();
        for (char i=97;i<=122; i++){
            System.out.print(i+" ");
        }

    }


}
