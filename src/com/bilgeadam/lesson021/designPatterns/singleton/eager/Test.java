package com.bilgeadam.lesson021.designPatterns.singleton.eager;

public class Test {

    public static void main(String[] args) {

        EvHalki anne = new EvHalki("Anne");
        EvHalki baba = new EvHalki("Baba");
        EvHalki cocuk = new EvHalki("Çocuk");

        cocuk.start();
        anne.start();
        baba.start();

    }
}
