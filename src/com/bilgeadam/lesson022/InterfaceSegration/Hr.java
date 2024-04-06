package com.bilgeadam.lesson022.InterfaceSegration;

public class Hr extends Employee implements IManager {
    public Hr(String name) {
        super(name, "Hr");
    }

    @Override
    public void setGrossSalary() {
        setSalary(50000);
    }

    @Override
    public void requestBonus() {

    }

    @Override
    public void givePermission() {

    }

    @Override
    public void giveSalaryIncrease() {

    }

    @Override
    public void hireEmployee() {

    }
}
