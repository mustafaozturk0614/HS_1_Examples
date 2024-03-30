package com.bilgeadam.lesson021.banka;

/*

bakiye si olsun  ve parayatır  paraccek metotları olsun
metotlara gelen miktarlar bakiyeyi değiştirsin
 */
public class Hesap {

    private int bakiye;


    public synchronized void paraCek(int tutar) {
        bakiye = bakiye - tutar;
        System.out.println(Thread.currentThread().getName() + "===> para cekti==>" + bakiye);

    }

    public synchronized void paraYatir(int tutar) {
        bakiye = bakiye + tutar;
        System.out.println(Thread.currentThread().getName() + "===> para yatırdı==>" + bakiye);
    }

}
