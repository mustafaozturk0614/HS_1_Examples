package com.bilgeadam.lesson022.InterfaceSegration;


public class Developer extends Employee implements MeetingArrangeable {


    public Developer(String name) {
        super(name, "Developer");
    }


    @Override
    public void setGrossSalary() {
        setSalary(60000);
    }

    @Override
    public void arrangeMeeting() {
        System.out.println("toplantı duzenlendi");
    }


    @Override
    public void requestBonus() {

    }


}
