package com.bilgeadam.lesson012.enumOrnek;

import java.util.Scanner;

/*
    bir uygulama metodumuz olsun
    ()=>  1 sepete urun eklensin ( secili sepetin urunler listesine sectiğimiz urun eklensin
    önce kullanıcıya urunleri listeliyeceğiz  daha sonra urunu secip listeye ekleyeceğiz) ;
 */
public class Manager {
    Sepet sepet;
    Scanner scanner=new Scanner(System.in);


    public Manager(Sepet sepet) {
        this.sepet = sepet;
    }

    public  void uygulama(){
        int secim;
        do {
            menu();
            System.out.println("Lütfen bir secim yapınız");
            secim=Integer.parseInt(scanner.nextLine());
            switch (secim){
                case 1:
                    urunEkle();
                    break;
                case  3:
                    sepetiGoster();
                    break;


            }

        }while (secim!=0);


    }

    public void sepetiGoster() {
        sepet.getUrunler().forEach(System.out::println);
    }

    public void urunEkle() {
        urunleriListele();
        System.out.println("Lütfen bir urun seciniz");
        int index=Integer.parseInt(scanner.nextLine());
        EUrun [] urunler=EUrun.values();
        EUrun urun=urunler[index-1];
        sepet.getUrunler().add(urun);

    }

    public  void urunleriListele() {

        /*
            1-Cola
            2-Cips
            ...
         */
        EUrun [] urunler=EUrun.values();
        for (EUrun urun  : urunler){
            System.out.println((urun.ordinal()+1)+"-"+urun.name());
        }
    }

    public  void  menu(){
        System.out.println("1-Sepete Urun Ekle");
        System.out.println("2-Urun Sil");
        System.out.println("3-Sepeti Goster ");
    }


}
