package com.bilgeadam.lesson002;
/*
- 1 den başlayarak sırayla sayıları toplayalım toplamımız 50den buyuk olana kadar programımız
çalışşın program sonunda toplamı ve programın kaç kere çalıştıgını yazdıralım.
 */
public class Question9 {

    public static void main(String[] args) {
        int toplam=0;
        int i=0;
        while (toplam<50){
            i++;
            toplam+=i;
            System.out.println(toplam);
        }
        System.out.println("calışma sayısı==>"+i);
        System.out.println("toplam==>"+toplam);

    }
}
