package com.bilgeadam.sehirApp;

public class Sehir  implements  Comparable<Sehir>{

    private String isim;
    private  long nufus;
    private  String  plakaNo;
    private EBolge bolge;

    public Sehir() {
    }

    public Sehir(String isim, long nufus, String plakaNo, EBolge bolge) {
        this.isim = isim;
        this.nufus = nufus;
        this.plakaNo = plakaNo;
        this.bolge = bolge;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getNufus() {
        return nufus;
    }

    public void setNufus(long nufus) {
        this.nufus = nufus;
    }

    public String getPlakaNo() {
        return plakaNo;
    }

    public void setPlakaNo(String plakaNo) {
        this.plakaNo = plakaNo;
    }

    public EBolge getBolge() {
        return bolge;
    }

    public void setBolge(EBolge bolge) {
        this.bolge = bolge;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sehir{");
        sb.append("isim='").append(isim).append('\'');
        sb.append(", nufus=").append(nufus);
        sb.append(", plakaNo='").append(plakaNo).append('\'');
        sb.append(", bolge=").append(bolge);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Sehir o) {
        return  this.getIsim().compareTo(o.getIsim());
    }
}
