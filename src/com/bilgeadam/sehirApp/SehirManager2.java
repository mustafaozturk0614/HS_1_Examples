package com.bilgeadam.sehirApp;

import java.util.*;
import java.util.stream.Collectors;

public class SehirManager2 {

    List<Sehir> sehirler = new ArrayList<>();
    Random random = new Random();

    public void sehirListesiOlustur() {
        for (int i = 0; i < SehirDatabase.iller.length; i++) {
            String isim = SehirDatabase.iller[i];
            Sehir sehir = sehirOlstur(isim, i + 1);
            this.sehirler.add(sehir);
        }
    }

    public Sehir sehirOlstur(String isim, int index) {
        Long nufus = random.nextLong(100000, 5000001);
        EBolge bolge = EBolge.values()[random.nextInt(EBolge.values().length)];
        String plaka = plakaOlustur(index);
        return new Sehir(isim, nufus, plaka, bolge);
    }

    public String plakaOlustur(int index) {
        if (index < 10) {
            return "0" + index;
        } else {
            return String.valueOf(index);
        }

    }

//    Soru 1
//    a)Sehir sınıfından oluşan bir List'ten, belirli bir bölgedeki şehirlerin Listesini elde
//    etmek için bir Java Stream ifadesi yazın.”
//    b)Sehir sınıfından oluşan bir List'ten, belirli bir bölgedeki şehirlerin isimlerini içeren bir
//    Liste elde etmek için bir Java Stream ifadesi yazın.

    //a)
    public List<Sehir> belirliBolgedekiSehirler(EBolge bolge) {
        List<Sehir> bolgeSehirListesi = sehirler.stream().filter(x -> x.getBolge().equals(bolge)).collect(Collectors.toList());
        bolgeSehirListesi.forEach(System.out::println);
        return bolgeSehirListesi;
    }

    // b)
    public List<String> belirliBolgedekiSehirlerinİsimleri(EBolge bolge) {
        List<String> bolgeSehirisimleriListesi = sehirler.stream().filter(sehir -> sehir.getBolge().equals(bolge)).map(x -> x.getIsim()).toList();
        //bolgeSehirisimleriListesi.forEach(System.out::println);
        return bolgeSehirisimleriListesi;
    }

    /*

    Soru 2
    Sehir sınıfından oluşan bir List'ten, belirli bir nüfus aralığına sahip şehirlerin plaka
    numaralarını içeren bir Set elde etmek için bir Java Stream ifadesi yazın.

         */

    public Set<String> nufusAraliginaGorePlakaSetiOlustur(long baslangicNusufu, long bitisNufusu) {
        Set<String> nufusAraliginaGorePlakaSeti = sehirler.stream().filter(sehir -> sehir.getNufus() > baslangicNusufu && sehir.getNufus() < bitisNufusu).map(sehir -> sehir.getPlakaNo()).collect(Collectors.toSet());
        return nufusAraliginaGorePlakaSeti;
    }

//    Soru 3
//    a)Sehir sınıfından oluşan bir List'ten, belirli bir harfle başlayan şehir adlarını içeren bir
//    List elde etmek için bir Java Stream ifadesi yazın.
//            a)Sehir sınıfından oluşan bir List'ten, belirli bir harfle başlayan şehir adlarının harf
//    uzunlukları toplamını bulan Java Stream ifadesi yazın.

    public List<String> harfeGoreSehirAdlarıListesi(String baslangicHarfi) {
        List<String> isimListesi = sehirler.stream().filter(sehir -> sehir.getIsim().startsWith(baslangicHarfi)).map(Sehir::getIsim).toList();
        return isimListesi;
    }

    public int harfeGoreSehirAdlarıUzunluklariToplami(String baslangicHarfi) {
        sehirler.stream().filter(sehir -> sehir.getIsim().startsWith(baslangicHarfi)).map(sehir -> sehir.getIsim().length()).reduce((x, y) -> x + y).ifPresent(System.out::println);
        return sehirler.stream().filter(sehir -> sehir.getIsim().startsWith(baslangicHarfi)).mapToInt(x -> x.getIsim().length()).sum();
    }

    /*
    Soru 4
Sehir sınıfından oluşan bir List'ten, butun sehirlerin nufus toplamını bulmak için bir
Java Stream ifadesi yazın.
     */
    public long toplamNufus() {
        long toplam = sehirler.stream().mapToLong(Sehir::getNufus).sum();
        //     long toplam = sehirler.stream().mapToLong(x -> x.getNufus()).sum();
        return toplam;
    }

    /*

    Soru 5
    Sehir sınıfından oluşan bir List'ten, belirli bir bölgedeki nufus toplamı ,ortalaması, en
    büyük nüfusu gibi istatistikleri bulmak için bir Java Stream ifadesi yazın.

     */
    public void belirliBolgedekiNufusİstatikleri(EBolge bolge) {
        // LongSummaryStatistics istatikler = sehirler.stream().filter(sehir -> sehir.getBolge().equals(bolge)).map(x -> x.getNufus()).collect(Collectors.summarizingLong(x -> x));
        LongSummaryStatistics statistics = sehirler.stream().filter(sehir -> sehir.getBolge().equals(bolge)).collect(Collectors.summarizingLong(Sehir::getNufus));
        System.out.println(statistics);
    }

    /*

    Soru 6
Sehir sınıfından oluşan bir List'ten, belirli bir nüfus aralığındaki şehirlerin ortalama
nüfusunu hesaplamak için bir Java Stream ifadesi yazın.
     */
    public double nufusAralığinaGoreOrtalamaNufus(long baslangic, long bitis) {
        OptionalDouble ort1 = sehirler.stream().filter(sehir -> sehir.getNufus() > baslangic && sehir.getNufus() < bitis).mapToLong(Sehir::getNufus).average();
        Double ort2 = sehirler.stream().filter(sehir -> sehir.getNufus() > baslangic && sehir.getNufus() < bitis).collect(Collectors.averagingDouble(Sehir::getNufus));
        System.out.println("ort2==>" + ort2);
        System.out.println("ort1==>" + ort1);
        return ort1.orElseGet(() -> 0);
    }
/*
Soru 7
Şehirler listesini, nüfusu 1 milyondan fazla olan şehirleri içerecek şekilde filtreleyin.
Filtrelenmiş listeyi ekrana yazdırın.
Soru 8
Şehirler listesini, şehir adlarını büyük harfe dönüştürecek şekilde map işlemine tabi
tutun. Dönüştürülmüş listeyi ekrana yazdırın.
 */

    public void nufusaGoreSehirlistesi(long nufus) {
        sehirler.stream().filter(sehir -> sehir.getNufus() > nufus).forEach(System.out::println);
    }

    /*
    Soru 8
Şehirler listesini, şehir adlarını büyük harfe dönüştürecek şekilde map işlemine tabi
tutun. Dönüştürülmüş listeyi ekrana yazdırın.
 */

    public void sehirAdlarınıBuyukHarfeDonustur() {
        sehirler.stream().map(sehir -> sehir.getIsim().toUpperCase()).forEach(System.out::println);
    }
//    Soru 9
//    Sehir sınıfından oluşan bir List'ten, belirli bir bölgedeki şehirlerin plaka numaralarının
//    tek olanları içeren bir List elde etmek için bir Java Stream ifadesi yazın


    public List<Sehir> bolgeyeGorePlakaNumarasiTekOlanlar(EBolge bolge) {
        return sehirler.stream().filter(sehir -> Integer.parseInt(sehir.getPlakaNo()) % 2 != 0 && sehir.getBolge().equals(bolge)).collect(Collectors.toList());
    }

//    Soru 10
//    Sehir sınıfından oluşan bir List'ten, belirli bir bölgedeki şehirlerin adlarının ilk 3 harfini
//    ve plaka numaralarını aralarında - birleştirerek yeni bir liste elde etmek için bir Java
//    Stream ifadesi yazın.(01-Ada ,02-Adı,03-Afy,04-Ağr,05-Ama,06-Ank…….) gibi

    public List<String> bolgeyeGorePlakaNumarasiveİsimleriBirleştir(EBolge bolge) {
        return sehirler.stream().filter(sehir -> sehir.getBolge().equals(bolge)).map(sehir -> {
            String sehirIsmi = sehir.getIsim().substring(0, 3);
            return sehir.getPlakaNo() + "-" + sehirIsmi;
        }).toList();
    }

}
