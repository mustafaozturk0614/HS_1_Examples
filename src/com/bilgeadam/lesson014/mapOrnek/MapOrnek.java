package com.bilgeadam.lesson014.mapOrnek;
/*

"Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya"

bu sehirleri  plaka kodlarına ile mapleyecegiz

plaka kodunu girdiğim zaman bana sehir isimin donmesini istiyorum

1- 06 plakalı sehirin ismini yazdıralım

2- 06 plaka mapımızde  bulunyor mu

3- "Ankara" mapımızde bulunyor mu

 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapOrnek {


    public static void main(String[] args) {

        Map<String,String>  sehirler=new HashMap<>();
        sehirler.put("01","Adana");
        sehirler.put("02","Adıyaman");
        sehirler.put("03","Afyon");
        sehirler.put("04","Ağrı");
        sehirler.put("05","Amasya");
        sehirler.put("06","Ankara");
        sehirler.put("07","Antalya");

        // 1-
        String sehir=sehirler.get("06");
        System.out.println(sehir);

        //2- 06 plaka mapımızde  bulunyor mu
        System.out.println(sehirler.containsKey("06"));

    //3- "Ankara" mapımızde bulunyor mu
        System.out.println(sehirler.containsValue("Ankara"));

        sehirler.put("06","ankara");
        System.out.println(sehirler.get("06"));
        sehirler.replace("06","Ankara");
        System.out.println(sehirler.get("06"));

        sehirler.forEach((k,v)-> System.out.println(k+"-"+v));

        System.out.println("///////////////////////////////////");
        for (Map.Entry<String,String> x :sehirler.entrySet()){
            System.out.println(x.getKey()+"-"+x.getValue());
        }
        System.out.println("///////////////////////////////////");

        Set<String> keySet=sehirler.keySet();
        for (String x :keySet){
            // sehirler.get("06");
            System.out.println(x+"-"+sehirler.get(x));
        }




    }




}
