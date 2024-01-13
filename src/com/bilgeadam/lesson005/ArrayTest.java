package com.bilgeadam.lesson005;

import java.util.Arrays;

public class ArrayTest {


    public static void main(String[] args) {
        // Array tanımlama yontemleri

        int [] sayilar1=new int[4]; //{0,0,0,0}
        int sayilar2 []={ 5,6,9,12,45,9}  ;
        sayilar1[0]=5;
        sayilar1[1]=15;
        sayilar1[2]=1;
        sayilar1[3]=14;
        // Arrayin boyutları dısında bir index degerine atama yapamam
      //  sayilar1[4]=24;
        System.out.println(sayilar1[3]);
        // Bir arrayi string olraak yazdırma
        String value=Arrays.toString(sayilar1);
        System.out.println(value);
        System.out.println(Arrays.toString(sayilar2));

        String [] array=new String[3];//{null,null,null}
        array[0]="Mustafa";
        array[1]= "Ankara";
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        float[] array2;
        double[] array3;
        long[] array4;
        char[] array5;
        byte[] array6;
        short[] array7;
        boolean[] array8=new boolean[4];// default degeri false {false,false,false,false}
        System.out.println(array8[0]);
        // Wrapper sınıfların  default degeri nulldır
        Integer [] array9=new Integer[3];
        System.out.println(array9[0]);
        Double [] array10=new Double[2];
        System.out.println(array10[0]);
        Object [] array11=new Object[3];
        System.out.println(array11[0]);
        Object [] array12={5,"Mustafa",10.4};

    }
}
