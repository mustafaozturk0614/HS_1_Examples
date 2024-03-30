package com.bilgeadam.lesson021.designPatterns.singleton;

/*
    Singelton==> Bir  sınıftan tek bir nesne tek bir ornek olusturmak için kullanılan tasarım deseni
   1. cost==> private olacak yeni bir nesne olusturmaya izin vermiyor
   2 sınfın içinde kendi referansında private statci bir değişken tutacagız
   3- static bir getInstance metodu yazabiliriz  bu metodda instance değişkeninin null olup olmadıgı kontrol edilir
   eğer null ise bir nesne olusturulur ve instance a eşitlenir metot sonucunda instance geri donulur
   eğer null değilse direk instance degeri geri dondurlur.

 */
public class MyPostgreConnection {

    private static MyPostgreConnection instance;

    private MyPostgreConnection() {
    }

    public static MyPostgreConnection getInstance() {
        if (instance == null) {
            instance = new MyPostgreConnection();
        }
        return instance;
    }
}
