package com.kodilla.inheritance.homework;

public class WindowsMe extends OperatingSystem {

    @Override
    public void turnOn() {
        System.out.println("WindowsMe is Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("WindowsMe is Turn Off");
    }

    public WindowsMe(int year) {
        super(year);

    }
}


