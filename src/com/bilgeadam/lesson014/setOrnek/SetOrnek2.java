package com.bilgeadam.lesson014.setOrnek;

import java.util.HashSet;
import java.util.Set;

public class SetOrnek2 {


    public static void main(String[] args) {

        Set<Kullanici>  kullaniciSet= new HashSet<>(
                Set.of(
                        new Kullanici(1,"mustafa"),
                        new Kullanici(2,"okan"),
                        new Kullanici(3,"öznur")
                ));


        Kullanici kullanici1=new Kullanici(1,"mustafa");
        Kullanici kullanici2= new Kullanici(1,"mustafa");

        System.out.println("1==>"+kullanici1.hashCode());
        System.out.println("2==>"+kullanici2.hashCode());
        kullaniciSet.add(kullanici1);
        kullaniciSet.add(kullanici2);
        kullaniciSet.forEach(System.out::println);


    }




}
