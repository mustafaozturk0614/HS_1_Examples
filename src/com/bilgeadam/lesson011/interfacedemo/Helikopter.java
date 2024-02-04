package com.bilgeadam.lesson011.interfacedemo;

public class Helikopter extends Arac implements IHavaTasiti{
    @Override
    public void inisYap() {
        System.out.println(getClass().getSimpleName()+" inişe geçti");
    }

    @Override
    public void kalkisYap() {
        System.out.println(getClass().getSimpleName()+" kalışa geçti");
    }
}
