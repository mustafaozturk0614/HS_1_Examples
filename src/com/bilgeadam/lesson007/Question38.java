package com.bilgeadam.lesson007;

import java.util.Scanner;

/*

Türkçe karakterleri inglizce karakterler çevirme
 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö'
dışarıdan bir kelime gireceğiz bu kelime içerisinde geçen türkçe karakterleri ing karakterlere
dönüştüreceğiz(array kullanabilirsiniz)
 */
public class Question38 {

    public static void main(String[] args) {
      //  translate();
        //Çanakkale
        char [] turkceKarakterler={ 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö'};
        char [] ingilizceKarakterler={ 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O'};

        cevirme(turkceKarakterler,ingilizceKarakterler,"ŞİİR");
        cevirme2(turkceKarakterler,ingilizceKarakterler,"ŞİİR");

//        String kelime="abc";
//        kelime=kelime.replace("x","y");
//        kelime=kelime.replace("a","A");
//        System.out.println(kelime);

    }

    public  static  void cevirme(char [] turkce,char [] ingilizce,String kelime){
        for (int i = 0; i < kelime.length() ; i++) {
            for (int j = 0; j < turkce.length ; j++) {
                //Çanakkale
                if (kelime.charAt(i)==turkce[j]){
                    kelime=kelime.replace(kelime.charAt(i),ingilizce[j]);
                    break;
                }
            }
        }
        System.out.println("yeni hali==>"+kelime);
    }

    public  static  void cevirme2(char [] turkce,char [] ingilizce,String kelime){
        for (int i = 0; i <turkce.length ; i++) {
            kelime=kelime.replace(turkce[i],ingilizce[i]);
        }
        System.out.println("yeni kelime==>"+kelime);
    };
    public static void translate(){
        System.out.println("Bir kelime giriniz");
        String kelime=new Scanner(System.in).nextLine();
        System.out.println(kelime
                .replace('İ','I')
                .replace('ı','i')
                .replace('Ş','S')
                .replace('ş','s')
                .replace('Ç','C')
                .replace('ç','c')
                .replace('Ğ','G')
                .replace('ğ','g')

        );
    }
}
