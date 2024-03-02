package com.bilgeadam.lesson014.bankaKuyrugu;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
3-müşterilerimizin ismi olsun sıra no olsun birde banka müşterisi mi değil mi onu tuttugmuz bir değişken olsun

   daha sonra bankada bir müsteri kuyrugu olusturalım ve banka musterisi olanlara öncelik verelim

 */
public class Banka {

    private Queue<Musteri>  musteriler=new PriorityQueue<>();





    private Queue<Musteri>  musteriler2=new PriorityQueue<>(new Comparator<Musteri>() {
        @Override
        public int compare(Musteri musteri1, Musteri musteri2) {
            if (musteri1.isMusteriMi()&&musteri2.isMusteriMi()){
                return  musteri2.getSiraNo()-musteri1.getSiraNo();
            }else if (musteri1.isMusteriMi()){
                return -1;
            }  else if (!musteri1.isMusteriMi()&&!musteri2.isMusteriMi()){
                return  musteri1.getSiraNo()-musteri2.getSiraNo();
              }else{
                return 1;
            }
        }
    }

    );




    public  void  musteriEkle(){
        musteriler.offer(new Musteri("Mustafa",5,false));
        musteriler.offer(new Musteri("Kemal",1,true));
        musteriler.offer(new Musteri("Merve",4,true));
        musteriler.offer(new Musteri("Okan",2,false));
        musteriler.offer(new Musteri("Zeliha",3,true));

    }

    public  void  musteriEkle2(){
        musteriler2.offer(new Musteri("Mustafa",5,false));
        musteriler2.offer(new Musteri("Kemal",1,true));
        musteriler2.offer(new Musteri("Merve",4,true));
        musteriler2.offer(new Musteri("Okan",2,false));
        musteriler2.offer(new Musteri("Zeliha",3,true));
        musteriler2.offer(new Musteri("x",8,false));
        musteriler2.offer(new Musteri("y",7,false));
        musteriler2.offer(new Musteri("z",9,false));
        musteriler2.offer(new Musteri("t",10,false));

    }
    public static void main(String[] args) {
            Banka banka=new Banka();
            banka.musteriEkle2();
            while (!banka.musteriler2.isEmpty()){
                System.out.println(banka.musteriler2.poll());
            }


    }
}
