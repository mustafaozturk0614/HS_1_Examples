package com.bilgeadam.lesson022.dependencyInversıon;

import com.bilgeadam.lesson022.InterfaceSegration.Developer;

public class Test {

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        SmsNotification smsNotification = new SmsNotification();
        HrDepartmant hrDepartmant = new HrDepartmant(emailNotification);
        hrDepartmant.processEmployee(new Developer("Mustafa"));


    }
}
