package com.bilgeadam.lesson016;

/*

1- bir metod yazalım bu metod bizden array ve bir index alsın ve arraydeki o indexdeki değeri yazdırsın
eger hata varsada hata mesjını ozellestirip yazdıralım

2-bir toplama metodu yazcagız aarayimiz uzerinde gezerken sayıları toplayıp bir toplam degiskeninen ekleyeceğiz ve sonunda toplamı yazdıracagız
ayrıca birde sayac olusturup hata sayımızı tutalım metod sonlandıgında toplamı ve hata sayımızı yazdıralım
 */
public class ExceptionOrnek3 {


    public static void main(String[] args) {
        String[] array = {null, "30", "a", "20", "b", "60", null, "c", ""};
        indexdekiDegeriYazdir(array, -8);
        toplamaYap2(array);
    }

    private static void indexdekiDegeriYazdir(String[] array, int i) {

        try {
            System.out.println(array[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString() + ": lütfen 0 ile " + (array.length - 1) + " degerleri arasında bir deger giriniz");
        }
        System.out.println("Program devam ediyor");
    }

    public static void toplamaYap(String[] array) {
        int sayac = 0;
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                toplam += Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                sayac++;
                System.out.println("sayı içermegen deger==>" + e.toString());
            }

        }
        System.out.println("toplam==>" + toplam);
        System.out.println("hata sayisi==>" + sayac);
    }


    /*
       1- bir null kontrolu metodu yazalım bir string deger alsın eger null ise hata fırlatsın degil ise o stringi bize donsun
       2- toplamayap metoduna entegre edeceğiz bunun için 2. metod yazlım string degerleride birleştirelim
     */
    public static String nullKontrol(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        return value;
    }

    public static void toplamaYap2(String[] array) {
        int sayac = 0;
        int toplam = 0;
        String value = "";
        for (int i = 0; i < array.length; i++) {
            try {
                nullKontrol(array[i]);
                toplam += Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                sayac++;
                System.out.println("sayı içermegen deger==>" + e.toString());
                value += array[i];
            } catch (NullPointerException e) {
                sayac++;
                System.out.println("null deger==>" + e.toString());
            }

        }
        System.out.println("toplam==>" + toplam);
        System.out.println("hata sayisi==>" + sayac);
        System.out.println("string degerler==>" + value);
    }

}
