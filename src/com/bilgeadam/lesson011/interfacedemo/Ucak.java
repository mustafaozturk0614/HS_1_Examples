package com.bilgeadam.lesson011.interfacedemo;

public  abstract class Ucak extends Arac implements IHavaTasiti{


    @Override
    public void inisYap() {
        System.out.println(getClass().getSimpleName()+" iniş yapıyor");
    }

    @Override
    public void kalkisYap() {
        System.out.println(getClass().getSimpleName()+" kalkışa geçiyor");
    }
}
