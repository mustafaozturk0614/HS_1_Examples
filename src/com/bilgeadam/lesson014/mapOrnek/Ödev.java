package com.bilgeadam.lesson014.mapOrnek;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*

    dışarıdan girilen kelimdeli turkce karakteri ingilizce karaktere cevirceğiz

    bunu yaparken arraylerden bir map olusturp o mapi kullanlım

 */
public class Ödev {

  static   char[] turkishWords = { 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' };
  static   char[] englishWords = { 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O' };

  static   Map<Character,Character > characterMap=new TreeMap<>();


     public static  void  mapOlustur(){
        for (int i = 0; i <turkishWords.length ; i++) {
            characterMap.put(turkishWords[i],englishWords[i]);
        }
    }

   // Çarşı
    public static  String harDegistir(String kelime){

        for (int i = 0; i <kelime.length() ; i++) {
            Character key=kelime.charAt(i);
            if (characterMap.containsKey(key)  ){
                Character value=characterMap.get(key);
                kelime=kelime.replace(key,value);
            }
        }

        return  kelime;
    }



    public static void main(String[] args) {

    mapOlustur();

        System.out.println(harDegistir("Çarşı"));



    }


}
