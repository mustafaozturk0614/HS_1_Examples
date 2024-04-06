package com.bilgeadam.lesson022.InterfaceSegration;


public class Test {


    public static void main(String[] args) {
        Developer employee1 = new Developer("Mustafa");
        Manager employee2 = new Manager("Özge");
        Intern employee3 = new Intern("Serkan");

        employee1.attendMeeting();
        employee1.requestLeave();
        employee1.work();
        employee2.attendMeeting();
        employee2.requestLeave();
        employee2.work();

        employee1.arrangeMeeting();

        // employee2.askMentor();


    }
}
