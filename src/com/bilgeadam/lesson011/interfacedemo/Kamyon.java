package com.bilgeadam.lesson011.interfacedemo;

public class Kamyon extends  Arac implements IKaraTasiti,IYukTasiyabilir{


    @Override
    public void sur() {
        System.out.println(getClass().getSimpleName()+" hareket ediyor");
    }

    @Override
    public void yukAl() {
        System.out.println(getClass().getSimpleName()+" yuk alıyor");
    }

    @Override
    public void yukBosalt() {
        System.out.println(getClass().getSimpleName()+" yuk boşaltıyor");
    }
}
