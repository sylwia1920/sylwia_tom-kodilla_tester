package com.kodilla.inheritance.homework;

public class SystemO {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2000);
        operatingSystem.turnOn();
        operatingSystem.yearPublishment();

        WindowsMe windowsMe = new WindowsMe(2000);
        windowsMe.turnOff();
        windowsMe.yearPublishment();

        WindowsXp windowsXp = new WindowsXp(2001);
        windowsXp.turnOn();
        windowsXp.yearPublishment();
    }
}
