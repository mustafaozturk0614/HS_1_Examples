package com.bilgeadam.lesson009.bilgisayarDemo;

public class MasaUstuBilgisayar  extends Bilgisayar{
    public Monitor monitor;
    public  int kasaBoyutu;

    public MasaUstuBilgisayar(String marka, AnaKart anaKart, Mouse mouse, Klavye klavye) {
        super(marka, anaKart, mouse, klavye);
    }

    public MasaUstuBilgisayar(String marka, AnaKart anaKart, Mouse mouse, Klavye klavye, Monitor monitor, int kasaBoyutu) {
        super(marka, anaKart, mouse, klavye);
        this.monitor = monitor;
        this.kasaBoyutu = kasaBoyutu;
    }

    @Override
    public String toString() {
        return "MasaUstuBilgisayar{" +
                "monitor=" + monitor +
                ", kasaBoyutu=" + kasaBoyutu +
                ", marka='" + marka + '\'' +
                ", anaKart=" + anaKart +
                ", mouse=" + mouse +
                ", klavye=" + klavye +
                '}';
    }
}
