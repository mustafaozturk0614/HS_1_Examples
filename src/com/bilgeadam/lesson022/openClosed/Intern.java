package com.bilgeadam.lesson022.openClosed;


public class Intern extends Employee {

    public Intern(String name) {
        super(name, "Intern");
    }

    @Override
    public void setGrossSalary() {
        setSalary(20000);
    }
}
