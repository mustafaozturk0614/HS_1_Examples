package com.bilgeadam.lesson008.pokemon;

public class Pokemon {
    public int id;
    public String ad;
    public int guc;
    public String tur;
    public  int can;
    public int seviye;
    public String sahibi;
    public int hediyePuani;

    //constructor (kurucu metot)
    //newleme işlemimde kurucu metoto calısır
    public  Pokemon(){
        System.out.println("Pokemon olusturuluyor.....");
        hediyePuani=100;
    }
    public Pokemon(int myId,String myAd,String myTur){
        id=myId;
        ad=myAd;
        tur=myTur;
    }
    public Pokemon(int myId,String myAd,String myTur,int myGuc,int myCan){
        System.out.println("Super sınıftaki yapıcı metoto calıstı");
        id=myId;
        ad=myAd;
        tur=myTur;
        guc=myGuc;
        can=myCan;
    }
    public void  saldir(){
        System.out.println(ad+" adlı pokemon saldiriyor");
    }

    public void kacinma(){
        System.out.println(ad+" adlı pokemon saldırıdan kacınıyor");
    }

    public  void  bilgileriGoster(){
        System.out.println("===============");
        System.out.println("id= "+id);
        System.out.println("ad= "+ad);
        System.out.println("tur= "+tur);
        System.out.println("can= "+can);
        System.out.println("guc= "+guc);
        System.out.println("seviye= "+seviye);
        System.out.println("sahibi= "+sahibi);
        System.out.println("hediye puan= "+hediyePuani);
        System.out.println("===============");
    }


}
