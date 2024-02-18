package com.bilgeadam.lesson012;

public enum EAylar {
    HAZIRAN("Yaz",30)

    ,TEMMUZ("Yaz",31),
    AGUSTOS("Yaz",31)

    ,EYLUL("Sonbahar",30)

    ,EKIM("Sonbahar",31);

    private String mevsim;
    private int gunSayisi;

    private EAylar (String mevsim,int gunSayisi){
        this.mevsim=mevsim;
        this.gunSayisi=gunSayisi;

    }
    public void isimUzunlugu(){
        System.out.println(this.name().length());
    }

    public String getMevsim() {
        return mevsim;
    }

    public void setMevsim(String mevsim) {
        this.mevsim = mevsim;
    }

    public int getGunSayisi() {
        return gunSayisi;
    }

    public void setGunSayisi(int gunSayisi) {
        this.gunSayisi = gunSayisi;
    }
}
