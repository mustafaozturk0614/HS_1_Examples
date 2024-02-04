package com.bilgeadam.lesson011.cafemanagment;

public class Waiter extends Employee implements IWaiter{

    public Waiter(int id, String name) {
        super(id, name);
    }

    public Waiter(int id, String name, String address, double salary) {
        super(id, name, address, salary);
    }

    @Override
    public void takeOrder() {

    }

    @Override
    public void serveFood() {

    }
}
