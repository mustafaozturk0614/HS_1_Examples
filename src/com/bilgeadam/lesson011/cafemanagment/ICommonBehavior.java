package com.bilgeadam.lesson011.cafemanagment;
/*
    Genel davranışlar interface'i
    1- interfaclerde genelde govdesiz metodlar kullanılır
    istisna olarak default ve static govdeli metotlar yazılabilir.
    2-interfaclerde tanımladıgmız metolar default olarak public erisim belirtecine sahiptir
    3- interfacler newlenemez( nesne olusturulamaz)
    4-Java coklu kalıtıma izin vermdiği icin coklu kalıtım interfaclerle sağlanır
    5- interfaclerde genelde değişken tanımlanmaz  static değiskenler haric

 */
public interface ICommonBehavior {
    void enter();
    void  exit();

//    default  void  deneme(){
//        System.out.println("Merhaba");
//    }

}
