package com.bilgeadam.lesson022.openClosed;

/*

1- ben uygulamayı bu sekilde olusturp çalışır hale getirdim daha sonra
baska bir pozisyon içinde orneğin hr için de salary değerimiz 50000 olsun


 */
public abstract class Employee {
    private String name;
    private String position;
    private double salary;


    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
        sb.append("name='").append(name).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

//    public void calculateSalary() {
//        if (position.equals("Manager")) {
//            salary = 70000;
//        } else if (position.equals("Developer")) {
//            salary = 60000;
//        } else if (position.equals("Intern")) {
//            salary = 20000;
//        } else {
//            salary = 40000;
//        }
//    }


    public void notifyBank() {
        String bankName = "My Bank";
        String notify = name + "==>" + position + "==>" + salary + "======>" + bankName + " bildirim gonderildi";
        System.out.println(notify);
    }

    public void saveDatabase() {
        String database = "postgre sql";
        System.out.println(database + " databse'ine loglandı");
    }

    // brut maaş
    public abstract void setGrossSalary();
}
