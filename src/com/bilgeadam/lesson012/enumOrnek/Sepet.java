package com.bilgeadam.lesson012.enumOrnek;

import java.util.ArrayList;
import java.util.List;

public class Sepet {
    private int id;
    private List<EUrun> urunler;
    private  double toplam;
    private  int urunSayisi;

    public Sepet() {
       this.urunler=new ArrayList<>();
    }

    public Sepet(int id) {
        this();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<EUrun> getUrunler() {
        return urunler;
    }

    public void setUrunler(List<EUrun> urunler) {
        this.urunler = urunler;
    }

    public double getToplam() {
        return toplam;
    }

    public void setToplam(double toplam) {
        this.toplam = toplam;
    }

    public int getUrunSayisi() {
        return urunSayisi;
    }

    public void setUrunSayisi(int urunSayisi) {
        this.urunSayisi = urunSayisi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sepet{");
        sb.append("id=").append(id);
        sb.append(", urunler=").append(urunler);
        sb.append(", toplam=").append(toplam);
        sb.append(", urunSayisi=").append(urunSayisi);
        sb.append('}');
        return sb.toString();
    }
}
