package com.bilgeadam.lesson017;
/*
  1-Bir limanımız olacak bu limanda yuk yerleştirlecek alanlar olacak
    limanda yuk yerleştirelcek alanlar liman olusturken belilenebilir
    veya standart her liman için 10 adet yuk yeri olabilir

    Her yukun ==> bir ağırlıgı bir kabul tarihi olsun (String)

    2-Kendi Exception sınıfımızı yaratalım
    -- yukYerisec Metodu olacak ==> bu metot dısarıdan bir yuk yeri secimi alacak
    (metot içinde kullanıcıya bir yuk yeri sectirelim ) ve bu yuk yeri dolu ise bize
    yuk yeri dolu diye bir hata fırlatacak bu metodu çalıstırmadna once default olarak 2 tane yukyerini elle dolduralım
    daha sonra bu metodu calıstıralım

    --yukYerisec2==> yuk yeri secimi yapacak ve bize sectiği yuk yerinin int degerini donecek
    yerleştirme işleminibu metot yapmayacaktır!!!! yine yuk yeri doluysa hata fırlatsın ayrıca sınırların
    dısında bir deger girmiş isekde başka bir hata fırlatsın

    3- agırlıkBelirle ==> limanımız 250 kilonun altını kabul etmiyor  kullanıcadan bir agırlık degeri alalım
    eger 250 nin altındaysa yetersiz ağırlık oldugnu belirten bir hata fırlatalım
        Ödev
    4- tarihBelirleMetodu==>
        a) girilen tarih bugunden öncemi önce ise bir hata fırlatacagız
        b)Cumartesi ve Pazar mesai saatleri dısındadır eger yuk girisi
        cumartesi ve ya pazar gerçekleştirilmek isteniyorsa bununla ilgili bir hata fırlatacagız
        eger bu kosullardan geçmiş isede
 */

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;

public class App {
    private Liman liman;
    private final long GUN = 1000 * 60 * 60 * 24;

    public App() {
        this.liman = new Liman();
    }

    public App(Liman liman) {
        this.liman = liman;
    }

    public void initData() {

        Yuk yuk1 = new Yuk(500, new MyDate(System.currentTimeMillis() - (GUN * 2), EGun.PERSEMBE));
        Yuk yuk2 = new Yuk(700, new MyDate(System.currentTimeMillis() - GUN, EGun.CUMA));
        liman.getYukler()[0] = yuk1;
        liman.getYukler()[1] = yuk2;
    }

    public void bosYerGosterimi() {
        for (int i = 0; i < liman.getYukAlaniSayisi(); i++) {
            if (liman.getYukler()[i] == null) {
                System.out.println((i + 1) + ". alanı secebilirisiniz");
            }
        }
    }

    public boolean yukYeriSec(Yuk yuk) {
        bosYerGosterimi();
        int index = Utility.intDegerAlma("Lütfen bir yuk yeri seciniz");

        if (index < 0 || index >= this.liman.getYukler().length) {
            throw new LimanException(ErrorType.ARALIK_DISI);
        }

        if (this.liman.getYukler()[index - 1] != null) {
            throw new LimanException(ErrorType.DOLU_YER_SECIMI);
        }
        this.liman.getYukler()[index - 1] = yuk;
        return true;
    }

    public int yukYeriSec2() {
        if (liman.getYukler()[liman.getYukler().length - 1] != null) {
            throw new LimanException(ErrorType.YETERSIZ_ALAN_SAYISI);
        }
        bosYerGosterimi();
        int index = Utility.intDegerAlma("Lütfen bir yuk yeri seciniz");
        if (index <= 0 || index > this.liman.getYukler().length) {
            String defaultMessage = ErrorType.ARALIK_DISI.getMessage();
            String message = defaultMessage + "==> " + index + " degerini girdiniz lütfen 1 ile " + liman.getYukAlaniSayisi() + " arasında bir değer giriniz";
            throw new LimanException(ErrorType.ARALIK_DISI, message);
        }

        if (this.liman.getYukler()[index - 1] != null) {
            throw new LimanException(ErrorType.DOLU_YER_SECIMI);
        }
        return index - 1;
    }

    public double agırlıkBelirle() {
        double agirlik = Utility.doubleDegerAlma("Lütfen bir ağırlık giriniz");
        if (agirlik < 250) {
            throw new LimanException(ErrorType.YETERSIZ_AGIRLIK);
        }
        return agirlik;
    }

    public MyDate tarihBelirle() {
        int gunSayisi = Utility.intDegerAlma("lütfen gun sayisi giriniz (- veya +) olabilir (- gunler geçmişi temsil eder)");
        long tarih = System.currentTimeMillis() + (GUN * gunSayisi);
        if (tarih < System.currentTimeMillis()) {
            throw new LimanException(ErrorType.GECERSIZ_KABUL_TARIHI);
        }
        EGun myGun = gunBelirle();
        if (myGun.equals(EGun.CUMARTESI) || myGun.equals(EGun.PAZAR)) {
            throw new LimanException(ErrorType.GECERSIZ_KABUL_TARIHI, "Hafta sonları yük kabulu yapılmamaktadır");
        }
        MyDate myDate = new MyDate(tarih, myGun);
        return myDate;
    }

    private static EGun gunBelirle() {
        boolean kontrol = false;
        EGun myGun = null;
        do {
            String gun = Utility.stringDegerAlma("Lütfen bir Gun ismi giriniz").toUpperCase(Locale.ENGLISH);
            try {
                myGun = EGun.valueOf(gun);
                kontrol = false;
            } catch (Exception e) {
                System.out.println("hata olustu: " + e.toString());
                kontrol = true;
            }


        } while (kontrol);

        return myGun;
    }

    public Optional<Yuk> yukOlustur() {
        Yuk yuk = null;
        try {
            MyDate date = tarihBelirle();
            double agirlik = agırlıkBelirle();
            yuk = new Yuk(agirlik, date);
        } catch (LimanException exception) {
            System.out.println("hata oluştu: " + exception.getMessage());
        } catch (Exception ex) {
            System.out.println("beklenmedik bir hata olustu: " + ex.getMessage());
        }
        return Optional.ofNullable(yuk);
    }

    public void yukKabul() {
        try {
            int index = yukYeriSec2();
            Optional<Yuk> yuk = yukOlustur();
            if (yuk.isEmpty()) {
                System.out.println("Yukunuz Kabul olmamıştır");
            } else {
                System.out.println("Yukunuz kabul olmustur===>" + yuk.get().getId());
                liman.getYukler()[index] = yuk.get();
            }
        } catch (LimanException exception) {
            System.out.println("Yukunuz Kabul olmamıştır: " + exception.getMessage());
        }

    }

    public static void main(String[] args) {
        Liman myLiman = new Liman(3);
        App app = new App(myLiman);
        app.initData();
        app.yukKabul();
        app.yukKabul();
        app.yukKabul();
        app.yukKabul();
        System.out.println(Arrays.toString(app.liman.getYukler()));


//        System.out.println(app.liman.getYukler()[0]);
//        System.out.println(app.liman.getYukler()[1]);
//        System.out.println(app.liman.getYukler()[2]);

        //    app.bosYerGosterimi();
//        try {
//            System.out.println(app.yukYeriSec(new Yuk(850, System.currentTimeMillis())));
//        } catch (LimanException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        app.bosYerGosterimi();

//        try {
//            throw new LimanException(ErrorType.HATA_2, "Yeni bir hata olustu");
//        } catch (LimanException e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            System.out.println(e.getErrorType().getCode());
//        }
//
//        throw new LimanException(ErrorType.HATA_1);

//        try {
//            System.out.println(app.agırlıkBelirle());
//        } catch (LimanException e) {
//            System.out.println(e.getMessage());
//
//        }

        //System.out.println(app.tarihBelirle());
        ;


    }


}
