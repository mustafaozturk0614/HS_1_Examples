package com.bilgeadam.lesson022;

import com.bilgeadam.lesson022.openClosed.Developer;
import com.bilgeadam.lesson022.openClosed.Employee;
import com.bilgeadam.lesson022.openClosed.Manager;
import com.bilgeadam.lesson022.openClosed.SalaryCalculator;


/*
    S => Single Responsibity==> Bir sınıf veya bir metotun tek bir gorevi olması lazım
    O => Open Closed ==> Kodlarımız geliştirmry acık olmalıdr fakat değiştirmiye kapalı olmalıdır
    L => Liskov Substituion => Bir sınıf inherit(kalıtım aldığı) edildiğ sınıf gibi davranmaldır
    I => İnterface Segregation=> Sorumlulukların hepsini tek bir interface'e yuklemeyelim
    D => Dependency Inversıon=> Sınıflar arası bagımlılık en alt duzeyde tutulmalıdr .
    özellikle ust seviye bir sınıf alt seviyedeki bir sınıfa bağımlı olmamalıdır.

 */
public class SolidTest {


    public static void main(String[] args) {
        Employee employee1 = new Developer("Mustafa");
        Employee employee2 = new Manager("Özge");

//        employee1.calculateSalaryAndNotifyBankAndSaveDatabase();
//        employee2.calculateSalaryAndNotifyBankAndSaveDatabase();
//        employee1.calculateSalary();
        SalaryCalculator.calculateSalary(employee1);
        SalaryCalculator.calculateSalary(employee2);
        employee1.notifyBank();
        employee1.saveDatabase();
        System.out.println("=================================");
        //  employee2.calculateSalary();
        employee2.notifyBank();
        employee2.saveDatabase();
        System.out.println("=================================");
        System.out.println(employee1);
        System.out.println(employee2);


    }
}
