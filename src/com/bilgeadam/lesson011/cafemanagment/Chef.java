package com.bilgeadam.lesson011.cafemanagment;

public class Chef  extends Employee implements IChef{

    public Chef(int id, String name) {
        super(id, name);
    }

    public Chef(int id, String name, String address, double salary) {
        super(id, name, address, salary);
    }

    @Override
    public void cooking() {

    }

    @Override
    public void checkMaterial() {

    }
}
