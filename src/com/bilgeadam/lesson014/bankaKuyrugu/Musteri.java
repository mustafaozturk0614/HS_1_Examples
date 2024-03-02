package com.bilgeadam.lesson014.bankaKuyrugu;

public class Musteri  implements  Comparable<Musteri>{

    private  String ad;
    private int siraNo;
    private boolean musteriMi;


    public Musteri(String ad, int siraNo, boolean musteriMi) {
        this.ad = ad;
        this.siraNo = siraNo;
        this.musteriMi = musteriMi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getSiraNo() {
        return siraNo;
    }

    public void setSiraNo(int siraNo) {
        this.siraNo = siraNo;
    }

    public boolean isMusteriMi() {
        return musteriMi;
    }

    public void setMusteriMi(boolean musteriMi) {
        this.musteriMi = musteriMi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Musteri{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", siraNo=").append(siraNo);
        sb.append(", musteriMi=").append(musteriMi);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Musteri o) {
        if (this.musteriMi){
            return -1;
        } else {
            return 1;
        }
    }
}
