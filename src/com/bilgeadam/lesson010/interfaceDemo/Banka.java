package com.bilgeadam.lesson010.interfaceDemo;

/*
        one to one
        one to many
        many to many

 */
public final class Banka {

    private String isim;
    private String subeKodu;
    private int musteriSayisi;
    private  Hesap[] hesaplar;

//    private  VadeliHesap [] vadeliHesapListesi;
//    private  VadesizHesap [] vadesizHesapListesi;


    public Banka(String isim, String subeKodu) {
        this.isim = isim;
        this.subeKodu = subeKodu;
        this.hesaplar= new Hesap[20];
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSubeKodu() {
        return subeKodu;
    }

    public void setSubeKodu(String subeKodu) {
        this.subeKodu = subeKodu;
    }

    public int getMusteriSayisi() {
        return musteriSayisi;
    }

    public void setMusteriSayisi(int musteriSayisi) {
        this.musteriSayisi = musteriSayisi;
    }

    public Hesap[] getHesaplar() {
        return hesaplar;
    }

    public void setHesaplar(Hesap[] hesaplar) {
        this.hesaplar = hesaplar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banka{");
        sb.append("isim='").append(isim).append('\'');
        sb.append(", subeKodu='").append(subeKodu).append('\'');
        sb.append(", musteriSayisi=").append(musteriSayisi);
        //sb.append(", hesaplar=").append(Arrays.toString(hesaplar));
        sb.append('}');
        return sb.toString();
    }
}
