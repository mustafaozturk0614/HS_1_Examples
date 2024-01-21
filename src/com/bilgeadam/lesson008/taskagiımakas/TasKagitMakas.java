package com.bilgeadam.lesson008.taskagiımakas;
/*
    1-kullanıcın secim yaptıgı ve bu secimin sonucu geri donen bir metot istiyorum(
     kullanıcıya secenekler sunulacak kullanıcıdan veri girişi alınacak )
    )
    2-pcSecim metodu ==> Rastgele bir secim yapacak bilgisayar ve bu secilen degeri bize donen bir metod
    3- karsılastırma bir metot yazacagız iki parametre alsın sonra bunları karsılastıracagız
    (parametreler kullanıcı ve bilgisayar secmini içerecektir)  ==> KAZANDINIZ ==> KAYBETTİNİZ ==> BERABERE
    4- oyun==>
        pc secim yapacak kullancı secim yapacak
        daha sonra bu secimin sonucu ekrana yazdırılacak
        daha sonra kullanıcıya tekrar oyun oynmak isteyip istemediği sorulacak eğer E tusuna basmış ise tekrar oyun oynayacak
        H tuşuna basarsa program sonlacanak
 */

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    public String oyuncuAdi;
    public String [] secenekler={"Tas","Kagıt","Makas"};
    public int skor;
    public int oyunSayisi;
  //  public  String [][] oyunGecmisi;

    public void  oyun(){
        String kontrol;
        do {
            System.out.println("===== TAS KAGIT MASAK OYUNU======");
            String pcSecim=pcSecim();
            String kullaniciSecim=secimYap();
          // karsilastirma(pcSecim(),secimYap());
            karsilastirma2(pcSecim,kullaniciSecim);
            System.out.println("pc secim==>"+pcSecim);
            System.out.println("kullanici secim==>"+kullaniciSecim);
            System.out.println("Tekrar oyun oynamak istiyormusunuz (E/H)");
            kontrol =new Scanner(System.in).nextLine();
            oyunSayisi++;
        }while (!kontrol.equalsIgnoreCase("H"));
        oyunIstatistikleriGoster();
    }

    public void oyunIstatistikleriGoster(){
        System.out.println("====Oyun Sonu Bilgileri===");
        System.out.println("Kullanıcı adı="+oyuncuAdi);
        System.out.println("Oyun sayısı="+ oyunSayisi);
        System.out.println("Galibiyet sayisi="+ (skor/10));
        System.out.println("Puanınız="+ skor);
    }

    public void karsilastirma(String pcSecim,String kullaniciSecim){

        if (pcSecim.equalsIgnoreCase(kullaniciSecim)){
            System.out.println("BERABERLİK");
        }else{
            if ((pcSecim.equalsIgnoreCase("Tas")&&kullaniciSecim.equalsIgnoreCase("Kagıt")) ||
                    (pcSecim.equalsIgnoreCase("Kagıt")&&kullaniciSecim.equalsIgnoreCase("Makas")) ||
                    (pcSecim.equalsIgnoreCase("Makas")&&kullaniciSecim.equalsIgnoreCase("Tas"))
            ){
                System.out.println("Kazandınız".toUpperCase());
                skor+=10;
            } else {
                System.out.println("Kaybettiniz".toUpperCase());
            }
            }
    }
    public void karsilastirma2(String pcSecim,String kullaniciSecim){
        if (pcSecim.equalsIgnoreCase(kullaniciSecim)){
            System.out.println("Sonuc... : BERABERLİK");
        }else{
            switch (kullaniciSecim){
                case "Tas":
                    if (pcSecim.equalsIgnoreCase("Kagıt")){
                        System.out.println("Sonuc... : KAYBETTİNİZ" );
                    }else{
                        System.out.println("Sonuc... : KAZANDINIZ" );
                        skor+=10;
                    }
                  break;
                case "Kagıt":
                    if (pcSecim.equalsIgnoreCase("Makas")){
                        System.out.println("Sonuc... : KAYBETTİNİZ" );
                    }else{
                        System.out.println("Sonuc... : KAZANDINIZ" );
                        skor+=10;
                    }
                    break;
                case "Makas":
                    if (pcSecim.equalsIgnoreCase("Tas")){
                        System.out.println("Sonuc... : KAYBETTİNİZ" );
                    }else{
                        System.out.println("Sonuc... : KAZANDINIZ" );
                        skor+=10;
                    }
                    break;
            }
        }




    }
    public String pcSecim(){
        Random random=new Random();
        int pcSecimi=random.nextInt(secenekler.length);
        return  secenekler[pcSecimi];
    }


    public String secimYap(){
        secimEkrani();
        int secim= secimKontrol();
        String secilen=secenekler[secim-1];
        return  secilen;
    }

    public  int  secimKontrol(){
        int secim;
        do{
            System.out.println("Lütfen 1,2 veya 3. seceneklerinde birini seciniz");
            secim =new Scanner(System.in).nextInt();
        }while (secim<1||secim>3);
        return secim;
    }
    public void secimEkrani() {
        for (int i = 0; i <secenekler.length ; i++) {
            /*
            1-Tas
            2-Kagıt
            3-Makas
             */
            System.out.println((i+1)+"-"+secenekler[i]);
        }
    }
}
