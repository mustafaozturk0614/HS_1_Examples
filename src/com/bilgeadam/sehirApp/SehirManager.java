package com.bilgeadam.sehirApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SehirManager {


 static    List<Sehir> sehirler=new ArrayList<>(
            List.of(
                    new Sehir(SehirDatabase.iller[80],500000,"81", EBolge.BOLGE_4),
                    new Sehir(SehirDatabase.iller[0],100000,"01", EBolge.BOLGE_3),
                    new Sehir(SehirDatabase.iller[12],200000,"13", EBolge.BOLGE_2),
                    new Sehir(SehirDatabase.iller[26],50000,"27", EBolge.BOLGE_3),
                    new Sehir(SehirDatabase.iller[33],1100000,"34", EBolge.BOLGE_1),
                    new Sehir(SehirDatabase.iller[70],120000,"71", EBolge.BOLGE_3)
            )
    );

    public static void main(String[] args) {

        Collections.sort(sehirler);
        sehirler.forEach(System.out::println);

        Comparator nufusaGore=new Comparator<Sehir>() {
            @Override
            public int compare(Sehir o1, Sehir o2) {
                return (int) (o1.getNufus()-o2.getNufus());
            }
        };
        System.out.println("nufusa gore");
        Collections.sort(sehirler,nufusaGore);
        sehirler.forEach(System.out::println);
        System.out.println("plaka no ya gore");
        Collections.sort(sehirler,(x,y)-> x.getPlakaNo().compareTo(y.getPlakaNo()));
        sehirler.forEach(System.out::println);
    }


}
