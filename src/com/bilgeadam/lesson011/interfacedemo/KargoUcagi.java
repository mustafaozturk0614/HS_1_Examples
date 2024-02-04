package com.bilgeadam.lesson011.interfacedemo;

public class KargoUcagi extends Ucak implements IYukTasiyabilir{


    @Override
    public void yukAl() {
        System.out.println(getClass().getSimpleName()+" yuk alıyor");
    }

    @Override
    public void yukBosalt() {
        System.out.println(getClass().getSimpleName()+" yuk boşaltıyor");
    }
}
