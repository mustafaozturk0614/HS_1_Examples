package com.bilgeadam.lesson017;

public class MyDate {

    private long tarih;

    private EGun gun;

    public MyDate(long tarih, EGun gun) {
        this.tarih = tarih;
        this.gun = gun;
    }

    public long getTarih() {
        return tarih;
    }

    public void setTarih(long tarih) {
        this.tarih = tarih;
    }

    public EGun getGun() {
        return gun;
    }

    public void setGun(EGun gun) {
        this.gun = gun;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyDate{");
        sb.append("tarih=").append(tarih);
        sb.append(", gun=").append(gun);
        sb.append('}');
        return sb.toString();
    }
}
