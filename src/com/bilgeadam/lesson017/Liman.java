package com.bilgeadam.lesson017;

import java.util.Arrays;

public class Liman {
    private int yukAlaniSayisi;
    private Yuk[] yukler;


    public Liman() {
        this.yukAlaniSayisi = 10;
        this.yukler = new Yuk[yukAlaniSayisi];

    }

    public Liman(int alanSayisi) {
        this.yukAlaniSayisi = alanSayisi;
        this.yukler = new Yuk[alanSayisi];
    }

    public int getYukAlaniSayisi() {
        return yukAlaniSayisi;
    }

    public void setYukAlaniSayisi(int yukAlaniSayisi) {
        this.yukAlaniSayisi = yukAlaniSayisi;
    }

    public Yuk[] getYukler() {
        return yukler;
    }

    public void setYukler(Yuk[] yukler) {
        this.yukler = yukler;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Liman{");
        sb.append("alanSayisi=").append(yukAlaniSayisi);
        sb.append(", yukler=").append(Arrays.toString(yukler));
        sb.append('}');
        return sb.toString();
    }
}
