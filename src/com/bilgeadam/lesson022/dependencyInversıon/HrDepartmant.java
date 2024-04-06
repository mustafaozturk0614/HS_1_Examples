package com.bilgeadam.lesson022.dependencyInversıon;

import com.bilgeadam.lesson022.InterfaceSegration.Employee;

public class HrDepartmant {

    private INotification notification;


    public HrDepartmant(INotification notification) {
        this.notification = notification;
    }

    public void processEmployee(Employee employee) {
        String message = "Hoşgeldiniz " + employee.getName();
        notification.sendNotification(message);

    }
}
