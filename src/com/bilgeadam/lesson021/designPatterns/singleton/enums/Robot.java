package com.bilgeadam.lesson021.designPatterns.singleton.enums;

/**
 * 1 tane robotumuz var bu robotun calıs metodu olsun ==> ( hascode() ==> numarlı robot calısıyor)
 * 2- Ev halki sınıfımız olsun bu sınıfta robot cagır metodu olsun  bu metod calısınca  bize robot sınıfındaki calıs metonudu calsıtrsın
 * (ev halki herdefasında aynı robotu cagırmalı)
 * 3- Test sınıfnda 3 tane ev halkı olusturup deneyelim
 */
public enum Robot {
    ROBOT;

    public void calis() {
        System.out.println(ROBOT.hashCode() + " nolu robot çalışıyor....");
    }
}
