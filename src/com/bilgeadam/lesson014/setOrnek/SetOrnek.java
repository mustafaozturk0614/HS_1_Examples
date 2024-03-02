package com.bilgeadam.lesson014.setOrnek;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*

    bir set yapısı olusturalım bu setim ize film kategorileri ekleyelim

    1- kategori ekle diye metot yazalım
    bu metoda gelen veriyi sete eklemeye calısalım
    eğer ekelyebiliş isek basarlı bir şekilde eklendi
    eğer ekleyememiş isek daha once eklenmiştir cıktısı verelim



 */
public class SetOrnek {

    Set<String> kategoriList=new HashSet<>();

    public  String kategoriEkle(String kategori){
        if ( kategoriList.add(kategori)){
            return  kategori+" ==>Ekleme Başarılı";
        }else{
            return kategori+" ==>Kategori mevcut";
        }

    }


    public static void main(String[] args) {
        SetOrnek setOrnek=new SetOrnek();
        System.out.println(setOrnek.kategoriEkle("Drama"));
        System.out.println(setOrnek.kategoriEkle("Drama"));
        System.out.println(setOrnek.kategoriEkle("Komedi"));
        System.out.println(setOrnek.kategoriEkle("Aksiyon"));
        setOrnek.kategoriList.forEach(System.out::println);


    }
}
