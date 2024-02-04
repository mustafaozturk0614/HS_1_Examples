package com.bilgeadam.lesson010.staticOrnek;

public class Test {


    public static void main(String[] args) {
            // static değişkenleri kullanmak için nesne olusturmaya ihtiyac yoktur
        //  Çünkü static değişkenler sınıf değişkenidir
            System.out.println(StaticOrnek.numara2);

            // static olmayan bir değişkene baska bir yerden ulaşmak için nesne yaratma
           //ihtiyacı duyulur
          // Çünkü static olmayan değişkenler nesne değişkenidir.
             StaticOrnek ornek=new StaticOrnek();
            StaticOrnek ornek2=new StaticOrnek();
            System.out.println(ornek2.numara1);
             System.out.println( ornek.numara1);
             ornek.numara1=5;
             ornek2.numara1=20;
             StaticOrnek.numara2=10;

        System.out.println(ornek.numara1);//5
        System.out.println(ornek.numara2);//10
        System.out.println("///////////////////////");
        System.out.println(ornek2.numara1);//20
        System.out.println(ornek2.numara2);//10

        /////////////////////////////////////////////////////
        ornek.numaraVer();
        System.out.println(ornek.numara1);//6
        System.out.println(ornek2.numara1);//20
        System.out.println(ornek.numara2);//11
        System.out.println(ornek2.numara2);//11
        ///////////////////////////////////
        System.out.println("/////////////////");
        ornek2.numaraVer();
        StaticOrnek.numaraVer2();//13
        System.out.println(ornek.numara1);//6
        System.out.println(ornek2.numara1);//21
        System.out.println(ornek2.numara2);//13
        System.out.println(ornek.numara2);//13

    }
}
