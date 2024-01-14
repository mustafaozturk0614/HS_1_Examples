package com.bilgeadam.lesson006;
/*

    dizi içerisinde 1 ve 4 un adetini bulalım 1 sayısının adeti 4 sayısının adetinden buyuk ise bize true değil ise false donsun


 */
public class Question33 {

    public static void main(String[] args) {

        int [] sayilar={1,4,4,1,5,6,4,4,1,8 };

        adetBul(sayilar);
        int [] array  =adetBul2(sayilar);
        System.out.println(kontrol(array[0],array[1]));  ;
      //  System.out.println(kontrol(adetBul2(sayilar)[0],adetBul2(sayilar)[1]));  ;

        System.out.println(kontrol(sayiAdetiBul(sayilar,1),sayiAdetiBul(sayilar,4)));  ;

        int sayac1=sayiAdetiBul(sayilar,1);
        int sayac4=sayiAdetiBul(sayilar,4);
        System.out.println(kontrol(sayac1,sayac4));


    }

    public static void adetBul(int[] sayilar) {
        int s1=0;
        int s2=0;
        for (int i = 0; i < sayilar.length ; i++) {
            if (sayilar[i]==1){
                s1++;
            } else if (sayilar [i]==4) {
                s2++;
            }
        }
        System.out.println("1 lerin adeti==>"+s1);
        System.out.println("4 lerin adeti==>"+s2);
        System.out.println(kontrol(s1,s2));

    }

    public  static  int sayiAdetiBul(int [] sayilar,int sayi){
        int s1=0;
        for (int i = 0; i < sayilar.length ; i++) {
            if (sayilar[i]==sayi){
                s1++;
            }
        }
        return  s1;
    }


    public static int [] adetBul2(int[] sayilar) {
        int s1=0;
        int s2=0;
        for (int i = 0; i < sayilar.length ; i++) {
            if (sayilar[i]==1){
                s1++;
            } else if (sayilar [i]==4) {
                s2++;
            }

        }
        System.out.println("1 lerin adeti==>"+s1);
        System.out.println("4 lerin adeti==>"+s2);
        int [] dizi={s1,s2};
        return  dizi;
    }

    public static  boolean kontrol(int sayac1,int sayac4){
        if (sayac1>sayac4){
            return  true;
        }else {
            return  false;
        }
    }


}
