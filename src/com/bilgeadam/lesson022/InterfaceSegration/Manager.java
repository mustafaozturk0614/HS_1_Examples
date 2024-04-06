package com.bilgeadam.lesson022.InterfaceSegration;


public class Manager extends Employee implements MeetingArrangeable, IManager {
    public Manager(String name) {
        super(name, "Manager");
    }

    @Override
    public void setGrossSalary() {
        setSalary(70000);
    }

    @Override
    public void arrangeMeeting() {
        System.out.println("toplantı duzenlendi");
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
