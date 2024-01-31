package com.bilgeadam.lesson009.bankaDemo2;

import com.bilgeadam.lesson009.bankaDemo.Hesap;

import java.util.UUID;

public class KrediHesabi extends Hesap {

    public KrediHesabi(String hesapNo, double bakiye, String kullaniciIsmi) {
        super(hesapNo, bakiye, kullaniciIsmi);
    }

    @Override
    public String toString() {
        return "KrediHesabi{" +
                "kullaniciIsmi='" + kullaniciIsmi + '\'' +
                '}';
    }

    public void  deneme(){
        kullaniciIsmi="Mustafa";
        setBakiye(500);
        setHesapNo(UUID.randomUUID().toString());

    }
}
