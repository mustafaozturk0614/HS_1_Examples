package com.bilgeadam.lesson013.menu;

public enum EIcecek {
    AYRAN(false),KOLA(false),GAZOZ(false),MEYVESUYU(false),LİMONATA(false),FANTA(false);
    boolean atandiMi;

    EIcecek(boolean atandiMi) {
        this.atandiMi = atandiMi;
    }

    public boolean isAtandiMi() {
        return atandiMi;
    }

    public void setAtandiMi(boolean atandiMi) {
        this.atandiMi = atandiMi;
    }
}
