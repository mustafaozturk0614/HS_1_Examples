package com.bilgeadam.lesson014;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 *    String bir kuyruk olusturcagız bir metot ile 10 tane musteri ekleyeceğiz
 *
 *     daha sonra random 1 - 12  adet arasında bir pide üreteceğiz pide sayımız
 *
 *     daha sonra oluşmuş kuyruğa pideleri dağıtacağız
 */
public class PideKuyrugu {

    Queue<String> pideKuyrugu=new ArrayBlockingQueue<>(10);

    public  void  musteriEkle(){
        for (int i = 1; i <15 ; i++) {
            pideKuyrugu.offer(i+".Musteri" );
        }

    }

    public  int pideSayisiBelirle(){
        Random random=new Random();
        return random.nextInt(1,13);
    }

    public void  pideDagit(){
        int pideSayisi=pideSayisiBelirle();
        System.out.println("Pideler çıkıyor.....");
        System.out.println("Pide sayisi==>"+ pideSayisi);
        for (int i = 0; i < pideSayisi; i++) {
            if (!pideKuyrugu.isEmpty()){
                System.out.println(pideKuyrugu.poll()+" pidesini aldı");
            }else {
                System.out.println("kalan pide sayisi ==>"+ (pideSayisi-i) );
                break;
            }
        }
    }
public  void  pidesiniAlmayanMusteriler(){

        if (pideKuyrugu.isEmpty()){
            System.out.println("Pidesini almayan kalmadı");
        }else{
            System.out.println("Pide bitti pidesini alamayanlar:");
            pideKuyrugu.forEach(System.out::println);
        }

}

    public static void main(String[] args) {

        PideKuyrugu app=new PideKuyrugu();
        app.musteriEkle();
       // app.pideKuyrugu.forEach(System.out::println);
        app.pideDagit();
        app.pidesiniAlmayanMusteriler();
        System.out.println("////////////////////////");
        app.pideDagit();
        app.pidesiniAlmayanMusteriler();

    }

}
