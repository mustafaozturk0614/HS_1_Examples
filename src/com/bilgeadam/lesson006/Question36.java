package com.bilgeadam.lesson006;

public class Question36 {


    public static void main(String[] args) {

        String [] [] kullanicilar={
                {"Mustafa","42"},
                {"Öznur","40"},
                {"Serkan","38"},
                {"Furkan","26"},
                {"Özge","25"}
        };
        //1- kullanıcıların  yaş ortalamasını bulan bir metot yazalım

        System.out.println("ortalama yas==>"+ ortalamaYas(kullanicilar));

        //2-  en yaşlı kullanıcın ismini donen bir metod yazalım
        System.out.println("en yaşlı kullanici==> "+enYasliKullaniciyiBul(kullanicilar));

    }

    public static  double ortalamaYas(String [] [] array){
        int toplamYas=0;
        int yas;

        for (int i = 0; i < array.length ; i++) {
            yas=Integer.parseInt(array[i][1]);
            toplamYas+=yas;

        }
        return  toplamYas/(double) array.length;
    }

    public  static  String enYasliKullaniciyiBul(String [] [] array){
       // int max=Integer.parseInt( array[0][1]);
       int max=Integer.MIN_VALUE;
        String isim="";
        for (int i = 0; i <array.length ; i++) {
            int yas=Integer.parseInt(array[i][1]);
            if (yas>max){
                max=yas;
                isim=array[i][0];
            }
        }
        return  isim;

    }


}
