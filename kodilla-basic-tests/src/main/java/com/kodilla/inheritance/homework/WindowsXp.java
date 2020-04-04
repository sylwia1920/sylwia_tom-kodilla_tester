package com.kodilla.inheritance.homework;

public class WindowsXp extends OperatingSystem {
    @Override
    public void turnOn() {
        System.out.println("Windows Xp Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows Xp Turn Off");
    }

    public WindowsXp(int year) {
        super(year);
    }
}
