package com.bilgeadam.lesson007;

public class ReferansTypeVsPrimitiveType {


    public static void main(String[] args) {
        //primitive ==> int,cher,byte,long,boolean...
        //Referans ==> String,Array,Object,Scanner Wrapper=> Integer,Double....
        int a=5;
        int b=4;
        System.out.println(a);
        System.out.println(b);
        a=b;
        b=12;
        System.out.println("///////////");
        System.out.println(a);
        System.out.println(b);

        String [] sehirler1={"Ankara","İstanbul","İzmir"};
        String [] sehirler2={"Bursa","Konya","Mersin"};
        System.out.println(sehirler1[0]);//Ankara
        System.out.println(sehirler2[0]);//Bursa
        System.out.println("///////////");
        sehirler2=sehirler1;
        System.out.println(sehirler2[0]);//Ankara
        sehirler1[0]="Bolu";
        System.out.println(sehirler2[0]);//Bolu
        System.out.println(sehirler1[0]);//Bolu
        sehirler2[1]="Edirne";
        System.out.println("///////////");
        System.out.println(sehirler1[1]);//istanbul,Edirne
        System.out.println(sehirler2[1]);//Edirne

        boolean kontrol=true;
        System.out.println(kontrol);
        System.out.println(!kontrol);


    }
}
