package com.bilgeadam.lesson022.singleResponsiblity;

/*

    calculateSalaryAndNotifyBankAndSaveDatabase()
    maaş hesaplama metodu
    position a gore maaş hesaplayacak
    Manager ise 70 000
    Developer ise 60 000
    intern ise  20 000
    daha sonra bir string banka ismi olusturp sonra birtande strin bildirm olusturalım
    bidlirm==> name -positon salary ==> bankaya bildirldi
    birde string bir databse ismi olusturp bu bildirmi databse kayıt ettik diye bir cıktı vereceğiz

 */
public class Employee {
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

    /*
    1- bu metot single responsibility prensibine uymuyor bu metodu parçalar boleceğiz
     */
    public void calculateSalaryAndNotifyBankAndSaveDatabase() {
        String bankName = "My Bank";
        String database = "postgre sql";
        if (position.equals("Manager")) {
            salary = 70000;
        } else if (position.equals("Developer")) {
            salary = 60000;
        } else if (position.equals("Intern")) {
            salary = 20000;
        }
        String notify = name + "==>" + position + "==>" + salary + "======>" + bankName + " bildirim gonderildi";
        System.out.println(notify);
        System.out.println(database + " databse'ine loglandı");
    }

    // dogru cözüm
    // metotlar uzerinden cozum
    public void calculateSalary() {
        if (position.equals("Manager")) {
            salary = 70000;
        } else if (position.equals("Developer")) {
            salary = 60000;
        } else if (position.equals("Intern")) {
            salary = 20000;
        }
    }

    public void notifyBank() {
        String bankName = "My Bank";
        String notify = name + "==>" + position + "==>" + salary + "======>" + bankName + " bildirim gonderildi";
        System.out.println(notify);
    }

    public void saveDatabase() {
        String database = "postgre sql";
        System.out.println(database + " databse'ine loglandı");
    }
}
