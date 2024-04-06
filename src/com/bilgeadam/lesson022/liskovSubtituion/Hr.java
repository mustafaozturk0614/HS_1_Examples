package com.bilgeadam.lesson022.liskovSubtituion;

public class Hr extends Employee {
    public Hr(String name) {
        super(name, "Hr");
    }

    @Override
    public void setGrossSalary() {
        setSalary(50000);
    }
}
