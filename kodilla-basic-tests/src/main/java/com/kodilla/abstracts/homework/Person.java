package com.kodilla.abstracts.homework;

public class Person {

    public static void main(String[] args) {
        Fireman bill = new Fireman(0, "Bill", 40, "Fireman");
        Plumber michael = new Plumber(0, "Michael", 45, "Plumber");
        Cook chris = new Cook(0, "Chris", 35, "Cook");
        Gardener jan = new Gardener(0, "Jan", 55, "Gardener");
        bill.displayIntro();
        bill.showResponsibilites();
        chris.displayIntro();
        chris.showResponsibilites();
    }
}
