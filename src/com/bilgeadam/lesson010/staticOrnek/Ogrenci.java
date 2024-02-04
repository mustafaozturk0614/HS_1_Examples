package com.bilgeadam.lesson010.staticOrnek;
/*
    ogrencilerin bir numarası bir ismi olsun
    daha sonra bir kayıt metodu yazalım
    metodun cıktıları
    Mustafa adlı ogrenci basarı ile kayıt edildi ogrenci no===>1
    Serkan adlı ogrenci basarı ile kayıt edildi ogrenci no===>2
    Özge adlı ogrenci basarı ile kayıt edildi ogrenci no===>3
    Öznur adlı ogrenci basarı ile kayıt edildi ogrenci no===>4
 */
public class Ogrenci {
    public static int ogrenciSayisi;
    public  int ogrenciNo;
    public  String ad;

    public  void kayit(String ad){
        this.ad=ad;
        ogrenciSayisi++;
        this.ogrenciNo=ogrenciSayisi;
        System.out.println( ad +" adlı ogrenci basarı ile kayıt edildi ogrenci no===>"+  ogrenciNo);
    }

}
