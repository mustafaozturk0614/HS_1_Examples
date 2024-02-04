package com.bilgeadam.lesson010.interfaceDemo;

import java.util.Random;

/*
    Test sınıfında bir vadeli hesap olusturup fazi oranına baslangıc olarak bir değer atayaın
    0.05 gibi;
    bu sınıfta bir faziGetirisiHesapla() metodu yazlım

    daha sonra  hesap bilgileri getir metodu
    Hesap bilgileri
    hesap no==>
    bakiye==>
    faizoranı==>
    faizGetirisi==>

test sınıfında 2 tane hesap olusturalım ve daha sonra hesap bilgilerini getir metodnu calıstıralım
 */
public class VadeliHesap  extends Hesap implements IVadeliIslemler  {

    private  static  double faizOrani;
    private int vadeGunSayisi;
    private double sonAyKazanc;

//    public VadeliHesap(String hesapNo, double bakiye, String kullaniciIsmi) {
//        super(hesapNo, bakiye, kullaniciIsmi);
//    }
    public VadeliHesap(String hesapNo, double bakiye, String kullaniciIsmi,int vadeGunSayisi) {
        super(hesapNo, bakiye, kullaniciIsmi);
        this.faizOrani =faizOrani;
        this.vadeGunSayisi=vadeGunSayisi;
       this.faizOrani=0.05;
    }

    public  double  faziGetirisiHesapla(){
        this.sonAyKazanc=bakiye*faizOrani*vadeGunSayisi/36500;
        return sonAyKazanc;
    }
    public void  hesapBilgileriGetir(){
        System.out.println(" Hesap bilgileri\n" +
                "        hesap no==>"+ getHesapNo() +"\n" +
                "        bakiye==>"+ getBakiye()  +"\n" +
                "        faizoranı==>"+ faizOrani+"\n" +
                "        faizGetirisi==>"+ faziGetirisiHesapla());
    }

    public static double getFaizOrani() {

        return faizOrani;
    }

    public static void setFaizOrani(double oran) {
       faizOrani = oran;
    }

    public int getVadeGunSayisi() {
        return vadeGunSayisi;
    }

    public void setVadeGunSayisi(int vadeGunSayisi) {
        this.vadeGunSayisi = vadeGunSayisi;
    }

    public double getSonAyKazanc() {
        return sonAyKazanc;
    }

    public void setSonAyKazanc(double sonAyKazanc) {
        this.sonAyKazanc = sonAyKazanc;
    }


    @Override
    public String toString() {
        return "VadeliHesap{" +
                "faizOrani=" + faizOrani +
                ", vadeGunSayisi=" + vadeGunSayisi +
                ", sonAyKazanc=" + sonAyKazanc +
                ", bakiye=" + bakiye +
                ", kullaniciIsmi='" + kullaniciIsmi + '\'' +
                ", banka=" + getBanka() +
                ", hesapNo='" + getHesapNo() + '\'' +
                ", bakiye=" + getBakiye() +
                ", kullaniciIsmi='" + getKullaniciIsmi() + '\'' +
                "} ";
    }


    @Override
    public void paraCek(double miktar) {
        Random random=new Random();
        boolean kontrol= random.nextBoolean();
        if (kontrol){
            super.paraCek(miktar);
        }else{
            System.out.println("Vade gununuz gelmemiştir!!!");
        }
    }
}
