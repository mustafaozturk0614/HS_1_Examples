package com.bilgeadam.lesson017;

import java.util.UUID;

public class Yuk {
    private String id;
    private double agirlik;
    private long kabulTarihi;

    public Yuk(double agirlik, long kabulTarihi) {
        this.id = UUID.randomUUID().toString();
        this.agirlik = agirlik;
        this.kabulTarihi = kabulTarihi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public long getKabulTarihi() {
        return kabulTarihi;
    }

    public void setKabulTarihi(long kabulTarihi) {
        this.kabulTarihi = kabulTarihi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Yuk{");
        sb.append("id='").append(id).append('\'');
        sb.append(", agirlik=").append(agirlik);
        sb.append(", kabulTarihi=").append(kabulTarihi);
        sb.append('}');
        return sb.toString();
    }
}
