package com.bilgeadam.lesson013.menu;

public class Menu {
    private  ECorba corba;
    private  EYemek yemek;
    private ETatli tatli;
    private EIcecek icecek;
    private EGun gun;

    public Menu(ECorba corba, EYemek yemek, ETatli tatli, EIcecek icecek, EGun gun) {
        this.corba = corba;
        this.yemek = yemek;
        this.tatli = tatli;
        this.icecek = icecek;
        this.gun = gun;
    }

    public Menu(ECorba corba, EYemek yemek, ETatli tatli, EIcecek icecek) {
        this.corba = corba;
        this.yemek = yemek;
        this.tatli = tatli;
        this.icecek = icecek;
    }

    public ECorba getCorba() {
        return corba;
    }

    public void setCorba(ECorba corba) {
        this.corba = corba;
    }

    public EYemek getYemek() {
        return yemek;
    }

    public void setYemek(EYemek yemek) {
        this.yemek = yemek;
    }

    public ETatli getTatli() {
        return tatli;
    }

    public void setTatli(ETatli tatli) {
        this.tatli = tatli;
    }

    public EIcecek getIcecek() {
        return icecek;
    }

    public void setIcecek(EIcecek icecek) {
        this.icecek = icecek;
    }

    public EGun getGun() {
        return gun;
    }

    public void setGun(EGun gun) {
        this.gun = gun;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Menu{");
        sb.append("corba=").append(corba);
        sb.append(", yemek=").append(yemek);
        sb.append(", tatli=").append(tatli);
        sb.append(", icecek=").append(icecek);
        sb.append(", gun=").append(gun);
        sb.append('}');
        return sb.toString();
    }
}
