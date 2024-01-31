package com.bilgeadam.lesson009.bilgisayarDemo;

public class Bilgisayar {
    public String marka;
    public AnaKart anaKart;
    public Mouse mouse;
    public Klavye klavye;

    public Bilgisayar(String marka, AnaKart anaKart, Mouse mouse, Klavye klavye) {
        this.marka = marka;
        this.anaKart = anaKart;
        this.mouse = mouse;
        this.klavye = klavye;
    }

    public Bilgisayar(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Bilgisayar{" +
                "marka='" + marka + '\'' +
                ", anaKart=" + anaKart +
                ", mouse=" + mouse +
                ", klavye=" + klavye +
                '}';
    }
}
