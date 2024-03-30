package com.bilgeadam.lesson021.designPatterns.singleton.lazy;

/**
 * 1 tane robotumuz var bu robotun calıs metodu olsun ==> ( hascode() ==> numarlı robot calısıyor)
 * 2- Ev halki sınıfımız olsun bu sınıfta robot cagır metodu olsun  bu metod calısınca  bize robot sınıfındaki calıs metonudu calsıtrsın
 * (ev halki herdefasında aynı robotu cagırmalı)
 * 3- Test sınıfnda 3 tane ev halkı olusturup deneyelim
 */
public class Robot {

    private static Robot instance;

    private Robot() {
    }

    /*
        lazy  singelton olusturma thread safe değildir
        (aynı anda birden fazla thread bu metoda ulaşırsa singelton yapımız bozulur)
        metodu synchronized haline getrirej threalerle guvenli bir şekile çalışmasın sagladık
     */
    public synchronized static Robot getInstance() {
        if (instance == null) {
            instance = new Robot();
        }
        return instance;
    }

    public void calis() {
        System.out.println(hashCode() + " nolu robot çalışıyor....");
    }
}
