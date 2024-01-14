package com.bilgeadam.lesson006;

import java.util.Arrays;

public class MultiArrayTest {

    public static void main(String[] args) {


        int [][] array=new int [2][3];

        array[0][0]=5;
        array[0][1]=15;
        array[0][2]=25;
        array[1][0]=35;
        array[1][1]=45;
        array[1][2]=55;

        System.out.println(array[0][0]);
        System.out.println(array[1][1]);

        System.out.println("uzunluk==>"+array.length);
        int [][] array2={
                {5,15,25},
                {35,45,55}
        };

        System.out.println(Arrays.toString(array2[0]) );
        System.out.println(Arrays.toString(array2[1]));
        System.out.println(array2[1].length);

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.println(array[i][j]);
            }
        }

    }
}
