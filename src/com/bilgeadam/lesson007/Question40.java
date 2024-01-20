package com.bilgeadam.lesson007;

public class Question40 {

    public static void main(String[] args) {
        int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
                { 189, 35, 56, 89, 8 } };
//        metot veya metotlar yazarak bu araydeki tek sayıları baska bir tek boyutlu arrayde toplamanızı
//        istiyorum
//tekSayilarArrayi(matris);

        diziYazdir2(tekSayilarArrayi2(matris));

    }
    public static int tekSayiAdetiBul(int [] [] array){
        int sayac=0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j]%2!=0){
                    sayac++;
                }
            }
        }
        return  sayac;
    }
    public  static int [] tekSayilarArrayi2(int [] [] array){
        int boyut=tekSayiAdetiBul(array);
        int [] yeniDizi=new int[boyut];
        int sayac=0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j]%2!=0){
                    yeniDizi[sayac]=array[i][j];
                    sayac++;
                }
            }
        }
        return yeniDizi;
    }

    public  static int [] tekSayilarArrayi(int [] [] array){
        int [] yeniDizi=new int[array.length*array[0].length];
        int sayac=0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j]%2!=0){
                    yeniDizi[sayac]=array[i][j];
                    sayac++;
                }
            }
        }
        diziYazdir(yeniDizi,sayac);
        return yeniDizi;
    }

    public  static void  diziYazdir(int [] array,int sayac){
        for (int i = 0; i < sayac ; i++) {
            System.out.println(array[i]);
        }
    }
    public  static void  diziYazdir2(int [] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }

}
