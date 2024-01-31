package com.bilgeadam.lesson009.bankaDemo;

public class VadeliHesap  extends Hesap{

    private  final double FAIZ_ORANI;
    private int vadeGunSayisi;

    private double sonAyKazanc;

//    public VadeliHesap(String hesapNo, double bakiye, String kullaniciIsmi) {
//        super(hesapNo, bakiye, kullaniciIsmi);
//    }
    public VadeliHesap(String hesapNo, double bakiye, String kullaniciIsmi,double faizOrani,int vadeGunSayisi) {
        super(hesapNo, bakiye, kullaniciIsmi);
        this.FAIZ_ORANI=faizOrani;
        this.vadeGunSayisi=vadeGunSayisi;
    }

    public double getFaizOrani() {
        return FAIZ_ORANI;
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
                "faizOrani=" + FAIZ_ORANI +
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



}
