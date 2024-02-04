package com.bilgeadam.lesson011.interfacedemo;

public abstract class Gemi  extends Arac implements IDenizTasiti{


    @Override
    public void yelkenAc() {
        System.out.println(getClass().getSimpleName()+" yelken acıyor");
    }

    @Override
    public void limanaYanas() {
        System.out.println(getClass().getSimpleName()+" limana yanasıyor");
    }
}
