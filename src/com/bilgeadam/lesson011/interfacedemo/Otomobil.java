package com.bilgeadam.lesson011.interfacedemo;

public class Otomobil  extends  Arac implements IKaraTasiti{


    @Override
    public void sur() {
        System.out.println(getClass().getSimpleName()+" hareket ediyor");
    }
}
