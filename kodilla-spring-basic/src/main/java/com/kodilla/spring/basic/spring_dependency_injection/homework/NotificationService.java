package com.kodilla.spring.basic.spring_dependency_injection.homework;

public class NotificationService {

    public String success(String address) {
        return "Package delivered to: " + address;
    }

    public String fail(String address) {
        return "Package not delivered to: " + address;
    }
}
