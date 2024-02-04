package com.bilgeadam.lesson011.interfacedemo;
/*
    Bir arac sınıfımız olsun
    Daha sonra ucak otomobil kamyon gemi gibi sınıflarımızı olsutuaralım
    bu sınıflara gerekiyorsa altsınıflar veya ust sınıflar olusturabilrisniz

    hızlanma yavaslama gibi metotlarımz olsun

    kalkıs yap iniş yap  yelkenac limanayanas   sur(kara tasıtları için gecerli bir metot olsun) gibi metotlar yazalım
    bazı araclar yuk tasıyabilir bunun için
    yukal yukbosalt metotlarımız olsun
    bu uygulamyı olustururken ozellikkel interfacelerden yararlanalım


    yukVerme Metodumuz olsun() ==> kamyon yuk aldı ,kargo ucagı yuk aldı ,yuk gemisi yuk aldı
    kalkisaIzınver() ==> kalkıs için izin veriliyor,
    yolcu ucagı kalkıs yaptı
    kargo ucagı kalkıs yaptı
 */
public class Test {

    public static void main(String[] args) {
        Gemi gemi=new YolcuGemisi();
        Otomobil otomobil=new Otomobil();
        Ucak ucak=new KargoUcagi();
        Kamyon kamyon= new Kamyon();
   //     Arac arac=new Arac();

        gemi.yelkenAc();
        gemi.hizlan();
        gemi.yavasla();
        gemi.limanaYanas();
        otomobil.sur();
        ucak.inisYap();
        ucak.kalkisYap();
        ucak.hizlan();
        ucak.yavasla();

        Arac gemi2=new YukGemisi();
        gemi2.yavasla();
        gemi2.hizlan();
        IDenizTasiti denizTasiti= new YolcuGemisi();
        denizTasiti.limanaYanas();
        denizTasiti.yelkenAc();


        YolcuUcagi yolcuUcagi=new YolcuUcagi();
        KargoUcagi kargoUcagi=new KargoUcagi();
        System.out.println("///////////////////////");
        kalkisaIzinVer(yolcuUcagi);
        System.out.println("///////////////////////");
        kalkisaIzinVer(kargoUcagi);

        IYukTasiyabilir kamyon2=new Kamyon();
        IYukTasiyabilir yukGemisi=new YukGemisi();
        IYukTasiyabilir kargoUcagi2=new KargoUcagi();
        yukVerme(kamyon2);
        yukVerme(yukGemisi);
        yukVerme(kargoUcagi2);

        Kamyon kamyon1=new Kamyon();
        YukGemisi yukGemisi1=new YukGemisi();
        KargoUcagi kargoUcagi1=new KargoUcagi();
        YolcuUcagi yolcuUcagi1=new YolcuUcagi();

        yukVerme(kamyon1);
        yukVerme(yukGemisi1);
        yukVerme(kargoUcagi1);
        System.out.println("/////////////////");

        Helikopter helikopter=new Helikopter();
        kalkisaIzinVer(helikopter);

    }
/*
  yukVerme Metodumuz olsun() ==> kamyon yuk aldı ,kargo ucagı yuk aldı ,yuk gemisi yuk aldı
    kalkisaIzınver() ==> kalkıs için izin veriliyor,
 */
    public  static void   yukVerme(IYukTasiyabilir tasit){
        System.out.println("yuk veriliyor");
        tasit.yukAl();
    }
/*
  kalkisaIzınver() ==> kalkıs için izin veriliyor,
    yolcu ucagı kalkıs yaptı
    kargo ucagı kalkıs yaptı
 */
    public  static void kalkisaIzinVer(IHavaTasiti tasit){
        System.out.println("kalkısa izin veriliyor");
        tasit.kalkisYap();
    }

}
