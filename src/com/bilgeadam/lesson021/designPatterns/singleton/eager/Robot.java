package com.bilgeadam.lesson021.designPatterns.singleton.eager;

/**
 * 1 tane robotumuz var bu robotun calıs metodu olsun ==> ( hascode() ==> numarlı robot calısıyor)
 * 2- Ev halki sınıfımız olsun bu sınıfta robot cagır metodu olsun  bu metod calısınca  bize robot sınıfındaki calıs metonudu calsıtrsın
 * (ev halki herdefasında aynı robotu cagırmalı)
 * 3- Test sınıfnda 3 tane ev halkı olusturup deneyelim
 */
public class Robot {

    private static Robot instance = new Robot();

    private Robot() {
    }
    
    public static Robot getInstance() {
        return instance;
    }

    public void calis() {
        System.out.println(hashCode() + " nolu robot çalışıyor....");
    }
}
