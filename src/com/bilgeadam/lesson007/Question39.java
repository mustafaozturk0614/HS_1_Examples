package com.bilgeadam.lesson007;
/*
)1 ile 10 arasındaki sayıların çarpım tablosunu çift boyutlu bir arrayde toplayalım
Her bir elamanı aşağıdaki gibi olacak;
[0] [0] =1x1=1 [1] [0] =2x1=2
 [0] [1]=1x2=2 [1] [1] =2x2=4
 */
public class Question39 {

    public static void main(String[] args) {

        String [] [] tablo=new String[10][10];
        tabloOlustur(tablo);



    }

    public static String [] [] tabloOlustur(String[][] tablo) {
        for (int i = 0; i <tablo.length ; i++) {
            for (int j = 0; j <tablo[i].length ; j++) {
                int carpim=(i+1)*(j+1);
                tablo[i][j]=(i+1)+"X"+(j+1)+"="+carpim;
                System.out.println(tablo[i][j]);
            }
        }
        return  tablo;
    }


}
