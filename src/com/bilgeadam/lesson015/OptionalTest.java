package com.bilgeadam.lesson015;

import java.util.Optional;

public class OptionalTest {


    public static void main(String[] args) {
    /*
     Optional olusturma işlemleri
     */

        Integer sayi1=10;
        Optional<Integer> sayi2=Optional.of(16);
        Optional<Integer> sayi3=Optional.of(sayi1);
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3.get()+10);
 /*
    Optional.of metodunu kullanıyorsak mutlaka gecerli bir deger kullanmak zorundayız null bir deger ile uretemeyiz
    null bir deger ile uretmek istyorsak ofNullable kullanabiliriz
  */
        String deger1=null;
        String deger2="Mustafa";
        Optional<String> optional1=Optional.of(deger2);
        System.out.println(optional1);
        Optional<String> optional2=Optional.ofNullable(deger2);
        System.out.println(optional2);
        Optional<String> optional3=Optional.ofNullable(deger1);
        System.out.println(optional3);
       // Optional<String> optional4=Optional.of(deger1);
       // System.out.println(optional4);
        Optional<String> optional5=Optional.empty();
        System.out.println(optional5);


        String isim=optional2.get();
        System.out.println(isim);

        if (optional5.isEmpty()){
            System.out.println("boş bir deger");
        }
        if (optional2.isPresent()){
            System.out.println("is present");
            System.out.println(optional2.get());
        }

        Optional<String> optional6=Optional.of("Java");

        optional6.ifPresent(System.out::println);
        optional5.ifPresent(System.out::println);
        optional6.ifPresent((s) -> System.out.println(s.toUpperCase()));
    // eger veri varsa optional bos degilse o veriyi doner yoksa öetot içindeki veriyi doner

        String result =optional6.orElse("boş");
         System.out.println("result1="+result);
        String result2 =optional5.orElse("boş");
        System.out.println("result2="+result2);
        System.out.println("/////////////////////////");
        optional6.ifPresentOrElse((s)-> System.out.println(s),()-> System.out.println("bulunamadı"));
        System.out.println("/////////////////////////");
        optional5.ifPresentOrElse((s)-> System.out.println(s),()-> System.out.println("bulunamadı"));
        System.out.println(optional6.filter(x->x.length()>3)); ;
        optional6.filter(x->x.length()>4).ifPresent(System.out::println);


    }




}
