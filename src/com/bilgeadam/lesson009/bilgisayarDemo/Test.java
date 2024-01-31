package com.bilgeadam.lesson009.bilgisayarDemo;

public class Test {

    public static void main(String[] args) {

        Ram ram=new Ram(32);
        Islemci islemci=new Islemci(8);
        EkranKarti ekranKarti=new EkranKarti(64);
        AnaKart anaKart=new AnaKart(ekranKarti,islemci,ram);

        Mouse mouse=new Mouse(1);
        Klavye klavye=new Klavye("mekanik");

        Bilgisayar bilgisayar=new Bilgisayar("Lenova",anaKart,mouse,klavye);
        System.out.println(bilgisayar);
        DizUstuBilgisayar dizUstuBilgisayar=new DizUstuBilgisayar("Monster",anaKart,mouse,klavye,90,"");
        System.out.println(dizUstuBilgisayar);
        MasaUstuBilgisayar masaUstuBilgisayar=new MasaUstuBilgisayar("Casper",
                new AnaKart(new EkranKarti(128),new Islemci(8),new Ram(64)) ,
                new Mouse(2),new Klavye("Mekanik")
                ,new Monitor(14,144),96);
        System.out.println(masaUstuBilgisayar);
    }
}
