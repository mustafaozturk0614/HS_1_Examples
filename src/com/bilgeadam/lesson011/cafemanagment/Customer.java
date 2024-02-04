package com.bilgeadam.lesson011.cafemanagment;

public class Customer extends Person implements ICustomer {


    public Customer(int id, String name) {
        super(id, name);
    }

    @Override
    public void giveOrder() {

    }
}
