package com.bilgeadam.lesson010.interfaceDemo;

import java.util.Scanner;

public class VadesizHesap extends Hesap implements IVadesizIslemler {
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

    @Override
    public void avansMiktariBelirle(double miktar) {
        this.avansMiktari=miktar;
    }

    @Override
    public double gunlukLimitArttır() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Gunluk limit artısı belrile");
        double limit=Double.parseDouble(scanner.nextLine());
        this.gunlukLimit+=limit;
        return  limit;
    }


}
