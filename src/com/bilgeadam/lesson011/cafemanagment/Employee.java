package com.bilgeadam.lesson011.cafemanagment;

public abstract class Employee extends Person implements IEmployee {
    private String address;
    private double salary;

    public Employee(int id, String name) {
        super(id, name);
    }

    public Employee(int id, String name, String address, double salary) {
        super(id, name);
        this.address = address;
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("address='").append(address).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", id=").append(getId());
        sb.append(", name='").append(getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void requestSalaryIncrease() {

    }

    @Override
    public void requestVacation() {

    }

    @Override
    public void leaveWork() {

    }


}
