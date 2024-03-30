package com.bilgeadam.lesson021.kosu;

/*
1- Kosucularımız var  ==> ismi kat edeceği mesefa sure ve  baslangıc zamanı olsun
   adım uzunlugu ==> buda  şimdilik hepsi için 1 metre

 kosucu sınıfımız thread gibi calsıacak  kosucuların kac metre kosackları yarıs sınıfında belilenecek (100metre)
 her defasında adım uzunlugu kadar yol kat edecek ( 1 er 1 er dusunebilirz)
 her 10 metrede bir cıktı verelim  mustafa==> 10.metre  mustafa==> 20.metrede  ...... mustafa 100.metrede
 cıktılarını verelim  yarıs sonundada  mustafa adlı kosucu 100 metreyi 2000 msn kostu di,ye bir cıktı verelim

 daha sonra yarıs sınıfnda 5 tane kosucu olsuturp bu threadlari baslatıp yarsı sonucu gozlemliyeceğiz


 */
public class Kosucu implements Runnable {

    private String isim;
    private int mesafe;
    private long sure;
    private long baslangicZamani;
    private double adimUzunlugu;

    public Kosucu(String isim, int mesafe, long baslangicZamani, double adimUzunlugu) {
        this.isim = isim;
        this.mesafe = mesafe;
        this.baslangicZamani = baslangicZamani;
        this.adimUzunlugu = adimUzunlugu;
    }


    public Kosucu(String isim, int mesafe, double adimUzunlugu) {
        this.isim = isim;
        this.mesafe = mesafe;
        this.adimUzunlugu = adimUzunlugu;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMesafe() {
        return mesafe;
    }

    public void setMesafe(int mesafe) {
        this.mesafe = mesafe;
    }

    public long getSure() {
        return sure;
    }

    public void setSure(long sure) {
        this.sure = sure;
    }

    public long getBaslangicZamani() {
        return baslangicZamani;
    }

    public void setBaslangicZamani(long baslangicZamani) {
        this.baslangicZamani = baslangicZamani;
    }

    public double getAdimUzunlugu() {
        return adimUzunlugu;
    }

    public void setAdimUzunlugu(double adimUzunlugu) {
        this.adimUzunlugu = adimUzunlugu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kosucu{");
        sb.append("isim='").append(isim).append('\'');
        sb.append(", mesafe=").append(mesafe);
        sb.append(", sure=").append(sure);
        sb.append(", baslangicZamani=").append(baslangicZamani);
        sb.append(", adimUzunlugu=").append(adimUzunlugu);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void run() {
        System.out.println("baslangic zamanı==>" + baslangicZamani);
        double anlikMesafe = 0;
        while (anlikMesafe < this.mesafe) {
            anlikMesafe += adimUzunlugu;
            if (anlikMesafe % 10 == 0) {
                System.out.println(isim + "====>" + anlikMesafe + ".metrede");
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        long bitisZamani = System.nanoTime();
        this.sure = bitisZamani - baslangicZamani;
        // System.out.println(isim + " adlı kosucu " + mesafe + " metreyi " + sure + " msn koştu");

    }
}
