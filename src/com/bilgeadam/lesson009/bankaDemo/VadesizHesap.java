package com.bilgeadam.lesson009.bankaDemo;

public class VadesizHesap extends  Hesap{

    private  double  gunlukLimit;
    public  double avansMiktari;


    public VadesizHesap(String hesapNo, double bakiye, String kullaniciIsmi, double gunlukLimit, double avansMiktari) {
        super(hesapNo, bakiye, kullaniciIsmi);
        this.gunlukLimit = gunlukLimit;
        this.avansMiktari = avansMiktari;
    }

    public double getGunlukLimit() {
        return gunlukLimit;
    }

    public void setGunlukLimit(double gunlukLimit) {
        this.gunlukLimit = gunlukLimit;
    }

    public double getAvansMiktari() {
        return avansMiktari;
    }

    public void setAvansMiktari(double avansMiktari) {
        this.avansMiktari = avansMiktari;
    }

    @Override
    public String toString() {
        return "VadesizHesap{" +
                "gunlukLimit=" + gunlukLimit +
                ", avansMiktari=" + avansMiktari +
                ", bakiye=" + bakiye +
                ", kullaniciIsmi='" + kullaniciIsmi + '\'' +
                '}';
    }
}
