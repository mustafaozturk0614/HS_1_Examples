package com.bilgeadam.lesson016.throwOrnek;

/*
    checked Exception==> kontrol edilmesi zorunlu exceptionlar ==> Excepiton ve bu sınıftan miras alan sınıflar

    unchecked Exception==> kontrol edilmesi zorunlu olmayan exceptionlar ==> RunTimeException ve bu sınıftan miras alanlar

2- double iki tane sayı alan bir bolme metodumuz olsun
eger bolen sayı 0 ise bir hata fırlatsın  ( normalde double  iki degeri birbirine bolerken bolen 0 olsa bile hata fırlatmaz fakat
infinity sonucu doner
) ben aslında ınfinity sounucu donmeisni istemiyorum eger bolen 0 ise bir hata fırlatmak istiyorum

 */
public class MyExceptionTest {

    // pozitif sayilarin toplamını bulan bir metod yazmak istiyorum
    // bu metod sayiıları kontrol edecek eğer negatif ise hata fırlatacak
    // hata fırlatma islemi throw
    public static int pozitifToplam(int sayi1, int sayi2) throws EksiDegerException {
        if (sayi1 < 0 || sayi2 < 0) {
            // throw new RuntimeException("sayılar 0 dan kucuk olamaz");
            //  throw new Exception("sayılar 0 dan kucuk olamaz");
            throw new EksiDegerException("sayılar 0 dan kucuk olamaz");
        }
        return sayi1 + sayi2;
    }


    public static double bolme(double bolunen, double bolen) {
        if (bolen == 0) {
            throw new InfinityException("bölen 0 olamaz!!!!");
        }
        return bolunen / bolen;
    }


    public static void main(String[] args) {
        // ctrl alt t tusu ile otamitk tycatch blogu acılır
//        try {
//            pozitifToplam(-1, 5);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


        try {
            pozitifToplam(-1, 8);
        } catch (EksiDegerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(bolme(5, 5));
        try {
            System.out.println(bolme(5, 0));
        } catch (InfinityException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Program devam ediyor");

    }


}
