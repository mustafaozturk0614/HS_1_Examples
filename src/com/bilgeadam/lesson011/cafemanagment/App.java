package com.bilgeadam.lesson011.cafemanagment;
/*
    Bir cafe yonetim uygulaması

    cafemizde calısanlarımız ve musterilerimiz olacak

    calısanlar ==> şef garson

    butun calısanlarımız zam isteyebiliri izin isteyebilir ve işten ayrıalabilir

    garsonlar siparişAlabilir ve servis yapabilir

    şefler  yemek pişirebilir malzeme kontrolu yapabilir

    musterilerde şipariş verebilir

     Gerekli sınıflar ve interfaceleri olusturarak bu sınıflar arasında kalıtım ilişkisi varsa kurulacak

     bu interfaceleri gerekli sınıflara implemente etmeniz;

 */
public class App {

    public static void main(String[] args) {
        Waiter waiter=new Waiter(1,"Serkan");
        waiter.leaveWork();
        waiter.takeOrder();
        waiter.serveFood();
        waiter.requestSalaryIncrease();
        waiter.requestVacation();

        Chef chef= new Chef(2,"Mustafa");
        chef.cooking();
        chef.checkMaterial();
        chef.requestSalaryIncrease();
        chef.requestVacation();
        chef.leaveWork();

    }
}
