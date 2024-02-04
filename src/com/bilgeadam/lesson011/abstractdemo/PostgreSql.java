package com.bilgeadam.lesson011.abstractdemo;

public class PostgreSql extends  Database{


    @Override
    public void veriEkle() {
        System.out.println("Postgreye veri eklendi");
    }

    @Override
    public void veriSil() {
        System.out.println("Postgreden veri silindi");
    }

    @Override
    public void veriGuncelle() {
        System.out.println("Postgrede veri guncellendi");
    }

    @Override
    public void verileriGetir() {
        System.out.println("Postgreden veriler getirildi");
    }
}
