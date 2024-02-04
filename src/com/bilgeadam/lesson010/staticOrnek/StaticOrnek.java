package com.bilgeadam.lesson010.staticOrnek;

public class StaticOrnek {

   public int numara1;
    public  static int numara2;


    /*
        bu metot uygulama ayaga kalktıgında olusmayacak!!!!
        bu metodu kullanmak için bir nesne olusturma işlemine ihtiyacımzı var
        bu yuzden stataic olmayan metodlarda static ve static olmayan değişkenler kullanabiliriz.
     */
    public void  numaraVer(){
        System.out.println("1.metot");
        numara1++;
        numara2++;
        System.out.println("numara1==>"+numara1);
        System.out.println("numara2==>"+numara2);

    }
    /*
        Static değişkenler ve metotlar uygulama aya kalktıgında olusrlar
        uygulama ayaga kalktıgında nesne olusmadan bu metot olusacak
        ben bu metodda satatic olmayan bir değişken kullanamam çünkü static olmayan değişkenler nesnelere bağlıdır
        yani stataic olmayan değişkenlere erişmek için newleme işlemi yapmak gerekiyor

     */
    public static void numaraVer2(){
        System.out.println("2.metot");
      //  numara1++;
        numara2++;
     //   System.out.println("numara1==>"+numara1);
        System.out.println("numara2==>"+numara2);

    }
}
