package com.bilgeadam.lesson015;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
        COLLECT
          Stream yapısındaki verileri herhangi bir collectionda toplamya yarıyor
          collect metodu toplama collect(Collectors.toList()) ==> bu metod listede toplamaya yarar
          collect metodu toplama collect(Collectors.toSet()) ==> bu metod set de toplamaya yarar

        FOREACH
        foreach metodu herhangi bir deger dondurmez(return degeri yoktur)
        foreach metodu stream akışını sonlandırı foreachden sonra herhangi bir stream metodunu kullanılamaz

        MAP
        map metodu bize bir deger dondurur. ve mutlaka return bekler
        map metodunda sonra başka stream metodlarnı kullanabiliriz
        map metodunu çalıstırdımgız listeden bagımsız farklı veri turlerinde listeler donebilir

        FİLTER
        filter filreleme işlemleri için kullanılır
        mutlaka bir koşul gerektirir
        bize bir stream yapısı done biz bunu collection da toplyabilirz
        filter içinde kullancagımız kosulların donus tipleri mutlaka true yada false olmalıdır
        filter sadece uzerinde calıstıgı collection turunde bir collectşon doner
        filter stream akısını sonlandırmaz devamınada stream metodları kullanilabilir
      */
public class StreamOrnek {


    public static void main(String[] args) {
        Stream<Integer> stream=Stream.of(10,20,402,50);
        // streamler tuketildikten sonra bir daha kullanılamaz
    //    stream.forEach(System.out::println);
    //    stream.forEach(System.out::println);

        List<Integer> sayilar=new ArrayList<>(List.of(25,32,45,87,95));
           //FOREACH KULLANIMI
        //1- çift sayıları yazdıralım stream yapısı kullanarak
        sayilar.stream().forEach(x-> System.out.println(x+5));

        sayilar.stream().forEach(x-> {
            if (x%2==0){
                System.out.println("çiftsayi");
            }
        });
        System.out.println("///////////////");

        //2- sayilar listesindeki elamanları baska bir listede toplayacagız fakat bunu yaparken
        // çift sayıların 5 eksigini tek sayiların 11 fazlasını toplayalım

        List<Integer> sayilar2=new ArrayList<>();
        sayilar.stream().forEach(s->{
            if (s%2==0){
                sayilar2.add(s-5);
            }else {
                sayilar2.add(s+11);
            }
        }  );

        System.out.println(sayilar2);
        List<Integer> sayilar3=new ArrayList<>();
        sayilar.stream().forEach(s->sayilar3.add(s+10));
        System.out.println(sayilar3);

        /// MAP KULLANIMI
        //2- sayilar listesindeki elamanları baska bir listede toplayacagız fakat bunu yaparken
        // çift sayıların 5 eksigini tek sayiların 11 fazlasını toplayalım

        List<Integer> sayilar5 = sayilar.stream().map(s -> {
            if (s % 2 == 0) {
                return s - 5;
            } else {
                return s + 11;
            }
        }).collect(Collectors.toList());


        sayilar.stream().map(s -> {
            if (s % 2 == 0) {
                return s - 5;
            } else {
                return s + 11;
            }
        }).forEach(System.out::println);

     List<Integer> sayilar6 =sayilar.stream().map(x->x+10).toList();
     System.out.println(sayilar6);
     List<String> stringList=sayilar.stream().map(x->x+"=").collect(Collectors.toList());
        System.out.println(stringList);

    List<Boolean> booleanList=sayilar.stream().map(x->{
        if (x%2==0){
            return  true;
        }else {
            return  false;
        }
    }  ).collect(Collectors.toList());
        System.out.println(booleanList);
        sayilar.stream().map(x->x+"abc").forEach(y-> System.out.println(y.toUpperCase().substring(1)));
       // System.out.println("sayilar5="+sayilar5);

//        Set<Integer> sayilar6 = sayilar.stream().map(s -> {
//            if (s % 2 == 0) {
//                return s - 5;
//            } else {
//                return s + 11;
//            }
//        }).collect(Collectors.toSet());   ;

        ///FILTER

       sayilar.stream().filter(x->x%2==0).forEach(System.out::println);

       List<String> programlar=new ArrayList<>(List.of("Java","React","Html","Css","JavaScript","JQuery","NodeJs"));
       // J ile baslayan programları yazdrıalım
        programlar.stream().filter(p->p.startsWith("J")).forEach(System.out::println);
        // J ile baslayan programları bir listede toplayalım

    List<String> JIleBaslayanlar= programlar.stream().filter(p->p.startsWith("J")).collect(Collectors.toList());
        System.out.println(JIleBaslayanlar);
        // J ile baslamayan programları bir listede toplayalım

        List<String> digerProgramlar=programlar.stream().filter(x->{
                    if (x.startsWith("J")){
                        return  false;
                    }else{
                        return  true;
                    }
                }
        ).toList();

        System.out.println(digerProgramlar);

        // J ile baslayanların uzunluklarını bir listede toplayalım
        List<Integer>  uzunluklar =programlar.stream().filter(x->x.startsWith("J")).map(y->y.length()).toList();
        System.out.println(uzunluklar);

        programlar.stream().filter(x->x.startsWith("J")).map(y->y.length()).forEach(System.out::println);

        //// J ile baslayanların  uzunlukları 5 den buyuk ise bu uzunlukları bir listede toplayalım

        List<Integer>  uzunluklar2 = programlar.stream().filter(x->x.startsWith("J")).map(y->y.length()).filter(z->z>5).toList();
        System.out.println(uzunluklar2);
     programlar.stream().filter(x->x.startsWith("J")&&x.length()>5).map(y->y.length()).forEach(System.out::println);

        // Tenary kullanımı ornek
        sayilar.stream().map(s ->s%2==0 ? s-5:s+11).forEach(System.out::println);




    }
}
