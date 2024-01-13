package com.bilgeadam.lesson004;

public class Question27 {

    public static void main(String[] args) {

        String value="1234";
        // value değişkeninin karakterlerinin sayısal değerleri toplamını bulalım

        System.out.println("Program başladı");
        char newValue;
        int toplam=0;
        int toplam2=0;
        for (int i = 0; i <value.length() ; i++) {
            //1.çözüm
            newValue=value.charAt(i);
            String value2=String.valueOf(newValue);
            int sayi=Integer.parseInt(value2);
            System.out.println(sayi);
            toplam+=sayi;
            //2 cözüm
            int sayi2=Character.getNumericValue(newValue);
            toplam2+=sayi2;
        }

        System.out.println("toplam==> "+toplam);
        System.out.println("toplam2==> "+toplam2);
        /*
            String degerinin kakrakterli rakam ise toplayalım ve topam 3 e ekleyelim
            değil ise bir string degerde toplayalım program sonunda bu ikisini yazdıralım
         */
        int toplam3=0;
        value="123xyz451";
        String karakterler="";
    //1.çözüm
//        for (int i = 0; i <value.length() ; i++) {
//            char karakter=value.charAt(i);
//            if (karakter>=48&&karakter<=57){
//                int sayi=Character.getNumericValue(karakter);
//                toplam3+=sayi;
//            }else{
//                karakterler+=karakter;
//            }
//
//        }
//2.çözüm
        for (int i = 0; i <value.length() ; i++) {
            char karakter=value.charAt(i);
            if (Character.isDigit(karakter)){
                int sayi=Character.getNumericValue(karakter);
                toplam3+=sayi;
            }else{
                karakterler+=karakter;
            }
        }
        System.out.println(karakterler);
        System.out.println("toplam3==> "+toplam3);

    }

  //  Integer,Double,Boolean,Long,Float,Character,Byte
}
