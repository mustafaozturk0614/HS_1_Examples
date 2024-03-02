package com.bilgeadam.lesson014.mapOrnek;

import java.util.HashMap;
import java.util.Map;

/*

    dışardıan bir kelime alacagız
    her bir harfin frekansını(kelime içinde kac defe geçtiğini bulacagız) ve bunu bir map yapısında tutacagız
    merhaba

    m=1
    e=1
    r=1
    h=1
    a=2
    b=1



 */
public class HarfFrekansBulmaMap {


    public  static void  kelimeKontrol(String kelime){
        Map<Character,Integer> harfFrekansMap=new HashMap<>();

        for (int i = 0; i <kelime.length() ; i++) {
            if (!harfFrekansMap.containsKey(kelime.charAt(i))){
                harfFrekansMap.put(kelime.charAt(i),1);
            }else {
                int sayac=harfFrekansMap.get(kelime.charAt(i));
              //  harfFrekansMap.put(kelime.charAt(i),sayac+1);
                harfFrekansMap.replace(kelime.charAt(i),sayac+1);
            }
        }

        System.out.println(harfFrekansMap);
    }
    public  static void  kelimeKontrol2(String kelime){
        Map<Character,Integer> harfFrekansMap=new HashMap<>();

        for (int i = 0; i <kelime.length() ; i++) {
                harfFrekansMap.computeIfAbsent(kelime.charAt(i),key-> 0);
                harfFrekansMap.computeIfPresent(kelime.charAt(i),(x,y)->y+1);
        }
        System.out.println(harfFrekansMap);
    }
    public static void main(String[] args) {
        kelimeKontrol2("merhaba");


    }

}
