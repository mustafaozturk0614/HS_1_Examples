package com.bilgeadam.lesson013.menu.arraylistornek;

import java.util.ArrayList;
import java.util.List;

/*

    Ankara
    Bursa
    Antalya
    Artvin
    Erzurum
    Karaman

    bu sehilrlerle bir liste olusturalım
    1- An ile baslayan sehileri listeden silmenizi istiyorum bir metod yazalım
 */
public class ArrayListOrnek {





    public static void main(String[] args) {
        List<String > sehirler=new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("Antalya");//"xxx"
        sehirler.add("Bursa");
        sehirler.add("Artvin");
        sehirler.add("Erzurum");
        sehirler.add("Karaman");

        List<String> sehirler2=new ArrayList<>(List.of("İzmir","Konya","Balıkesir" ));
       anIleBaslayanSehirleriGuncelle2(sehirler2);
       sehirler.addAll(sehirler2);
     //  sehirler.removeAll(sehirler2);
       //sehirler listesinde baskent varmı
        if (sehirler.contains("Ankara")){
            System.out.println("Baskent bu listede vardır");
        }
        System.out.println(sehirler.containsAll(sehirler2));

       // System.out.println(sehirler);


       sehirler.forEach(System.out::println);
        System.out.println("/////////////////////////////");
       sehirler.subList(0,3).forEach(System.out::println);
        System.out.println("/////////////////////////////");
        sehirler.subList(3,sehirler.size()).forEach(System.out::println);


    }

    public static void anIleBaslayanSehirleriSil(List<String> sehirler) {
        for (int i = 0; i <sehirler.size(); i++) {
            if (sehirler.get(i).startsWith("An")){
                sehirler.remove(i);
                i--;
            }
        }
    }
    public static void anIleBaslayanSehirleriGuncelle(List<String> sehirler) {
        for (int i = 0; i <sehirler.size(); i++) {
            if (sehirler.get(i).startsWith("An")){
                sehirler.set(i,"xxx");
            }
        }
    }
    public static void anIleBaslayanSehirleriGuncelle2(List<String> sehirler) {
        for (int i = 0; i <sehirler.size(); i++) {
            if (sehirler.get(i).startsWith("An")){
                sehirler.remove(i);
                sehirler.add(i,"xxx");
            }
        }
    }



    // foreach asenkron yapıda çalıştığı için silme ve ekleme işlemleri foreach uzerinden yapılamaz!!!
//    public static void anİleBaslayanSehirleriSil2(List<String> sehirler) {
//        for ( String sehir :sehirler) {
//            if (sehir.startsWith("An")){
//                sehirler.remove(sehir);
//            }
//        }
//    }

}
