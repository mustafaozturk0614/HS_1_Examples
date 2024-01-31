package com.bilgeadam.lesson009.bilgisayarDemo;

public class AnaKart {
    public EkranKarti ekranKarti;
    public Islemci islemci;
    public Ram ram;

    public AnaKart(EkranKarti ekranKarti, Islemci islemci, Ram ram) {
        this.ekranKarti = ekranKarti;
        this.islemci = islemci;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "AnaKart{" +
                "ekranKarti=" + ekranKarti +
                ", islemci=" + islemci +
                ", ram=" + ram +
                '}';
    }
}
