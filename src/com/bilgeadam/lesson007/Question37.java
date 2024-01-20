package com.bilgeadam.lesson007;

public class Question37 {

    public static void main(String[] args) {

       int [] sayilar={-100,120,4520,85,3120,-82,-96,236,63};

        System.out.println("max==> "+enBuyukSayiyiBul(sayilar));
        System.out.println("min==> "+enKucukSayiyiBul(sayilar));
        System.out.println("max2==> "+enBuyukIkinciSayiyiBul(sayilar));

    }

    public static int enBuyukSayiyiBul(int [] dizi){
        int enBuyukSayi= Integer.MIN_VALUE;
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]>enBuyukSayi){
                enBuyukSayi=dizi[i];
            }
        }
        return  enBuyukSayi;
    };
    public static int enKucukSayiyiBul(int [] dizi){
        int enKucukSayi= Integer.MAX_VALUE;
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]<enKucukSayi){
                enKucukSayi=dizi[i];
            }
        }
        return  enKucukSayi;
    };
    public static int enBuyukIkinciSayiyiBul(int [] dizi){
        int enBuyukSayi=enBuyukSayiyiBul(dizi);
        int enBuyukIkinciSayi= Integer.MIN_VALUE;
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]==enBuyukSayi){
                continue;
            } else if (dizi[i]>enBuyukIkinciSayi) {
                enBuyukIkinciSayi=dizi[i];
            }
        }
        return  enBuyukIkinciSayi;
    };
}
