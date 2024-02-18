package com.bilgeadam.lesson012.enumOrnek;
/*
    Bir sepetim olsun
    sepetimde urunlarim olacak
    fakat urunler uygulamaya ayaga kalktından sonra degişmeyece
    uygulama boyunca yeni urun ekleme olmayacak uygulamamda basta olan urunleri kullancagım
    buna gore urunleri ve sepeti soyutlayıp olusturalım( sepete urun eklenbilcek urnler goruntulenebilcek )
CIPS,KOLA,SEKER,
    YAG,UN,EKMEK,CAY,
    YUMURTA,YOGURT,SUT;
 */


/*
    1- urun silme urun ismi ile ilk buldugu indexdeki değeri silebilr
    2- sepeti goster dedğimde sepetin toplam fiyarını gostersin (urunlermizin baslangıc fiyatları olsun daha sonra
     sepetimizdeki urunlerin fiyatlarını toplayıp  yazdıralım)
     3- alısverisiTamamla()=> alısveriş tamamlanacak sepet yenilencek
 */
public class Test {

    public static void main(String[] args) {
        Sepet sepet=new Sepet(1);
        Manager manager=new Manager(sepet);
        manager.uygulama();


    }
}
