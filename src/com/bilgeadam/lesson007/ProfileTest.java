package com.bilgeadam.lesson007;

import java.util.Random;

public class ProfileTest {

    public static void main(String[] args) {
        Random random=new Random();// nesne olusturma
        LinkedinProfile profile1= new LinkedinProfile();// nesne olustuma kısmı
        LinkedinProfile profile2;// tanımlama işlemi

        profile1.profilBilgileriGoster();

        profile1.isim="Mustafa";
        profile1.soyIsim="Öztürk";
//        profile1.takipci= random.nextInt(100,2000);
//        profile1.baglanti= random.nextInt(100,2000);
        profile1.adres= "Ankara Türkiye";
        profile1.calismayaAcikmi=true;
        profile1.meslek="Yazılım Muhendisi";
        profile1.profilBilgileriGoster();
//        System.out.println(profile1.isim);
//        profile1.calismaDurumuDegistir();
//        System.out.println(profile1.calismayaAcikmi);
//        profile1.calismaDurumuDegistir();
//        System.out.println(profile1.calismayaAcikmi);
//        profile1.bolumEkle("Eğitim",0);
//        profile1.bolumEkle("Deneyim",1);
//        profile1.profilBilgileriGoster();

        profile2=new LinkedinProfile();
        profile2.isim="Mustafa";

        System.out.println(profile2.isim);
        System.out.println(profile1.equals(profile2));
        System.out.println(profile1.isim.equals(profile2.isim));
        profile2=profile1;
        System.out.println(profile1.equals(profile2));
    }
}
