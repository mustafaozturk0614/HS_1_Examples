package com.bilgeadam.lesson005;

public class MetotTest {

    public static void main(String[] args) {
   //      metot1();

//            metot2("Mustafa",1987);
//            String ad="Tuba";
//            int dogumYili=1990;
//            metot2(ad,dogumYili);
//            metot2("2001",2005);
   //     int sonuc= metot3();
//        System.out.println("yeni sonuc===>"+ (sonuc+25));
//        System.out.println("yeni sonuc2===>"+ (metot3()+35));
//
//        System.out.println(metot3());

        System.out.println( metot4("Selim",1995));
        System.out.println( metot5("Selim",1995));

    }


    // void  Geri Donusu olmayan metotlar
        // Geri donussuz Parametresiz metotlar
    public  static void metot1(){
        System.out.println("Metot1 Çalıştı");
        int sayi1=5;
        int sayi2=15;
        int sonuc=sayi1-sayi2;
        System.out.println("sonuc==>"+sonuc);
    }
    // Geri donussuz Parametreli metotlar
    public  static  void metot2(String isim,int dogumYili){
        System.out.println("Metot-2 Çalıştı");
        System.out.println(isim+" adlı kullanıcın yaşı ===>"+(2024-dogumYili));
    }
    //  Geri Donusu olan metotlar
    // Geri donuslu Parametresiz metotlar

    public static  int metot3(){
        System.out.println("Metot3 Çalıştı");
        int sayi1=5;
        int sayi2=15;
        int sonuc=sayi1-sayi2;
     //  System.out.println("sonuc==>"+sonuc);
       return  sonuc;
    }

    // Geri donuslu Parametreli metotlar

    public  static  String metot4(String isim,int dogumYili){
        System.out.println("Metot-4 Çalıştı");
        String sonuc=isim+" adlı kullanıcın yaşı ===>"+(2024-dogumYili);
        return  sonuc;
    }
    public  static  String metot5(String isim,int dogumYili){
        System.out.println("Metot-5 Çalıştı");
       return    isim+" adlı kullanıcın yaşı ===>"+(2024-dogumYili);

    }
}
