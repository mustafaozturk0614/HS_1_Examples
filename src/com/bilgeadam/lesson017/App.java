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

public class App {

    public static void main(String[] args) {
        try {
            throw new LimanException(ErrorType.HATA_2, "Yeni bir hata olustu");
        } catch (LimanException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e.getErrorType().getCode());
        }

        throw new LimanException(ErrorType.HATA_1);


    }
}
