package com.bilgeadam.lesson003;

import java.util.Locale;
import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {

        String value1="Merhaba Dünya";
        String value2=" Merhaba Dünya ";
        String value3="Merhaba Dünya";
        String value4=new String("Merhaba Dünya");
        String value5="  ";
        String value6="";

        System.out.println(value1.concat(value2));// 2 string degeri birleştirmeye yarar
        System.out.println(value2);
        System.out.println(value2.trim());// sondaki ve bastaki boslukları kaldırır
        System.out.println(value1.contains("M")); // metin icersindeki bir degerin geçip geçmediğini kontrol eder
        System.out.println(value1.contains("m"));
        System.out.println(value1.contains("Dü"));
        System.out.println(value1.contains(" Dü"));
        System.out.println(value1.contains("a Dü"));
        System.out.println(value1.charAt(0));// girilen indexdeki degeri char olarak dondurur
        System.out.println(value1.charAt(3));
        char deger=value1.charAt(2);
        System.out.println(deger);
        System.out.println(value1.indexOf("a")); /// girilen harfin string degerinde ilk kacıncı indexde gectiğini bulur
        System.out.println(value1.lastIndexOf("a"));/// girilen harfin string degerinde en son kacıncı indexde gectiğini bulur
        System.out.println(value1.indexOf("x"));
        System.out.println(value1.startsWith("Mer"));
        System.out.println(value1.startsWith("M"));
        System.out.println(value1.startsWith("Merr"));
        System.out.println(value1.endsWith(("ya")));
        System.out.println(value1.endsWith(("y")));
        System.out.println(value1.length());
        System.out.println(value1.replace("a","A"));
        System.out.println(value1);
        System.out.println(value1.replace("x","A"));
        System.out.println(value1.substring(5));
        System.out.println(value1.substring(0,5));
        System.out.println(value1.substring(5,7));
        System.out.println(value1.substring(2,value1.length()));
        System.out.println(value1.toLowerCase());
        System.out.println(value1.toUpperCase());
        System.out.println(value1);
        System.out.println(value5.isEmpty());
        System.out.println(value6.isEmpty());
        System.out.println(value5.isBlank());
        System.out.println(value6.isBlank());
        System.out.println(value5.trim().isEmpty());
        String value7="ILK";
        String value8="DÜNYA";
        System.out.println(value7.toLowerCase(Locale.ENGLISH));
        System.out.println(value7.toLowerCase());
        System.out.println(value8.toLowerCase(Locale.ENGLISH));
        String [] dizi =value1.split(" ");
        // Merhaba Dünya
        System.out.println(dizi[0]);
        System.out.println(dizi[1]);
        value1+="x";
        String [] dizi2 =value1.split("a");
        System.out.println(dizi2[0]);//Merh
        System.out.println(dizi2[1]);//b
        System.out.println(dizi2[2]);// Düny
        System.out.println(dizi2[3]);// x
        value1="Merhaba Dünya";
        /*
          String value1="Merhaba Dünya";
        String value2=" Merhaba Dünya ";
        String value3="Merhaba Dünya";
        String value4=new String("Merhaba Dünya");
        String value5="  ";
        String value6="";
         */
//       Scanner scanner=new Scanner(System.in);
//        String value9=scanner.nextLine();
//       System.out.println(value9);
        System.out.println(value1.equals(value2));
        System.out.println(value1.equals(value2.trim()));
        System.out.println(value1.equals(value3));
        System.out.println(value1.equals(value4));
      //  System.out.println(value1.equals(value9));
        System.out.println(value1==value3);
        System.out.println(value1==value2);
        System.out.println(value1==value4);
     //   System.out.println(value1==value9);
        System.out.println(value1.equals(value4.toUpperCase()));
        System.out.println(value1.equalsIgnoreCase(value4.toUpperCase()));

        // donusumler
        int sayi=5;
        String value10=String.valueOf(sayi);
        String value12=Integer.toString(sayi);
        // bir stringi sayıya cevirme
        // Wrapper
        int sayı2=Integer.parseInt(value10);
        long sayi3=Long.parseLong(value12);
        double sayi4=Double.parseDouble(value12);
        System.out.println(sayi3+10);
        System.out.println(sayi4+20);
        int sayi5=Integer.parseInt(value1);

        System.out.println("sayı2==>"+sayı2);
        System.out.println(value10);
        System.out.println(value10.equalsIgnoreCase("5"));
        boolean karar=false;
        String value11=String.valueOf(karar);
        System.out.println(value11.toUpperCase());



    }
}
