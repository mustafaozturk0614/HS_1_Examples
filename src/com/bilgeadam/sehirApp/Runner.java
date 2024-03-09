package com.bilgeadam.sehirApp;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner {


    public static void main(String[] args) {
        SehirManager2 sehirManager2 = new SehirManager2();
        sehirManager2.sehirListesiOlustur();
        //    sehirManager2.sehirler.stream().forEach(System.out::println);

        //// //////////////////1.soru//////////////////////////
//        System.out.println("Bolge 1 deki şehirler");
//        sehirManager2.belirliBolgedekiSehirler(EBolge.BOLGE_1);
        //  System.out.println("Bolge 2 deki şehirler");
        //  sehirManager2.belirliBolgedekiSehirler(EBolge.BOLGE_2);
        ///
//        System.out.println("isim listesi");
//        sehirManager2.belirliBolgedekiSehirlerinİsimleri(EBolge.BOLGE_1).forEach(System.out::println);
//        String result=sehirManager2.belirliBolgedekiSehirlerinİsimleri(EBolge.BOLGE_1).stream().collect(Collectors.joining(","));
//        System.out.println(result);

        ///////////////////2.Soru///////////////////

        //  sehirManager2.nufusAraliginaGorePlakaSetiOlustur(200000,500000).forEach(System.out::println);
///////////////////3.Soru///////////////////
//        sehirManager2.harfeGoreSehirAdlarıListesi("V").forEach(System.out::println);
//        System.out.println(sehirManager2.harfeGoreSehirAdlarıUzunluklariToplami("V"));
        ;

        ///////////////////4.Soru///////////////////

        //  System.out.println(sehirManager2.toplamNufus());

        ///////////////////5.Soru///////////////////
        // sehirManager2.belirliBolgedekiNufusİstatikleri(EBolge.BOLGE_4);
        ;
        ///////////////////6.Soru///////////////////
        //  System.out.println(sehirManager2.nufusAralığinaGoreOrtalamaNufus(100000, 900000));
        ///////////////////7.Soru///////////////////
        // sehirManager2.nufusaGoreSehirlistesi(1000000);
        ///////////////////8.Soru///////////////////
        //  sehirManager2.sehirAdlarınıBuyukHarfeDonustur();
        ///////////////////9.Soru///////////////////

        //    sehirManager2.bolgeyeGorePlakaNumarasiTekOlanlar(EBolge.BOLGE_3).forEach(System.out::println);
        ///////////////////10.Soru///////////////////
        //   sehirManager2.bolgeyeGorePlakaNumarasiveİsimleriBirleştir(EBolge.BOLGE_1).forEach(System.out::println);

        /// sehirlerimizi nufusa gore sıralayalım
        //    sehirManager2.sehirler.stream().sorted(Comparator.comparingLong(Sehir::getNufus)).toList().forEach(System.out::println);

        // sehirManager2.sehirler.stream().sorted((x, y) -> (int) (y.getNufus()) - (int) (x.getNufus())).toList().forEach(System.out::println);

        //  sehirManager2.sehirler.stream().sorted(Comparator.comparing(Sehir::getIsim).reversed()).toList().forEach(System.out::println);

        //  sehirManager2.sehirler.stream().skip(20).limit(10).forEach(System.out::println);

        // bolgelere gore sehrileri mapleyelim
        Map<EBolge, List<Sehir>> map = sehirManager2.sehirler.stream().collect(Collectors.groupingBy(Sehir::getBolge));
        map.forEach((k, v) -> {
            System.out.print(k + "=" + v);
            System.out.println();
        });

        // sehir ismine karslılk sehir nufuslarını mapleyelim
        System.out.println(sehirManager2.sehirler.stream().collect(Collectors.toMap(k -> k.getIsim(), v -> v.getNufus())));

        sehirManager2.sehirler.stream().collect(Collectors.toMap(k -> k.getIsim(), v -> v.getNufus())).forEach((x, y) -> System.out.println(x + "=" + y));

        // 1.bolgedeki sehir sayısı;
//        List<String> list = sehirManager2.sehirler.stream().map(sehir -> sehir.getIsim()).collect(Collectors.toList());
//        List<Long> list3 = sehirManager2.sehirler.stream().map(sehir -> sehir.getNufus()).toList();
//        List<Sehir> list2 = sehirManager2.sehirler.stream().filter(sehir -> sehir.getIsim().startsWith("A")).toList();

        System.out.println(sehirManager2.sehirler.stream().filter(sehir -> sehir.getBolge().equals(EBolge.BOLGE_1)).count());

        // her harfdeki sehirlein nufusları toplamını harf key nufus value olacak sekilde mapleyelim
        System.out.println(sehirManager2.sehirler.stream().collect(Collectors.groupingBy(x -> x.getIsim().charAt(0), Collectors.summingLong(Sehir::getNufus))));

    }
}
