package com.bilgeadam.lesson022.openClosed;

public class SalaryCalculator {


    public static void calculateSalary(Employee employee) {
        if (employee.getPosition().equals("Manager")) {
            employee.setSalary(70000);
        } else if ((employee.getPosition().equals("Developer"))) {
            employee.setSalary(60000);
        } else if (employee.getPosition().equals("Intern")) {
            employee.setSalary(20000);
        } else {
            employee.setSalary(40000);
        }
    }

    public static void calculateSalary2(Employee employee) {
        employee.setGrossSalary();
    }
}
