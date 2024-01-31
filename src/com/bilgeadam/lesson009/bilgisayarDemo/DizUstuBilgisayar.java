package com.bilgeadam.lesson009.bilgisayarDemo;

public class DizUstuBilgisayar extends Bilgisayar{

    double sarjYuzdesi;
    String ekran;

    public DizUstuBilgisayar(String marka, AnaKart anaKart, Mouse mouse, Klavye klavye, double sarjYuzdesi, String ekran) {
        super(marka, anaKart, mouse, klavye);
        this.sarjYuzdesi = sarjYuzdesi;
        this.ekran = ekran;
    }

    @Override
    public String toString() {

        return super.toString() +"DizUstuBilgisayar{" +
                "sarjYuzdesi=" + sarjYuzdesi +
                ", ekran='" + ekran + '\'' +
                '}';
    }
}
