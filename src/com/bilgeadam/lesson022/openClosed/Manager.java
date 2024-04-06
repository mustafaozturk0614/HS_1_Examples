package com.bilgeadam.lesson022.openClosed;


public class Manager extends Employee {
    public Manager(String name) {
        super(name, "Manager");
    }

    @Override
    public void setGrossSalary() {
        setSalary(70000);
    }
}
