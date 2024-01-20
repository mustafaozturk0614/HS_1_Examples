package com.bilgeadam.lesson007;

import java.util.Scanner;

public class Sinav {
    public String sinavAdi;
    public String tur;
    public int ogrenciSayisi;
    public  double gecmeNotu;
    public  String tarih;
     public  String [] ogrenciler=new String[ogrenciSayisi];
     public String [] sorular;

     public String sinavSorumlusu;

    // public int soruSayisi;


    public void gecmeNotuAta(double not){
        gecmeNotu=not;
    }
    public void sinavTarihiBelirle(String sinavTarihi){
        tarih=sinavTarihi;
    }

    public void soruOlustur(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen sınav soru sayısını giriniz");
        int soruSayisi=Integer.parseInt(scanner.nextLine());
        sorular=new String[soruSayisi];
        for (int i = 0; i <sorular.length ; i++) {
            sorular[i]=(i+1)+".soru";
        }
    }
}
