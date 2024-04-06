package com.bilgeadam.lesson022.openClosed;

public class Test {

    public static void main(String[] args) {

        Employee employee1 = new Developer("Mustafa");
        Employee employee2 = new Manager("Özge");
        Employee employee3 = new Hr("Serkan");

        SalaryCalculator.calculateSalary2(employee1);
        SalaryCalculator.calculateSalary2(employee2);
        SalaryCalculator.calculateSalary2(employee3);
        employee1.notifyBank();
        employee1.saveDatabase();
        employee2.notifyBank();
        employee2.saveDatabase();
        employee3.notifyBank();
        employee3.saveDatabase();

    }
}
