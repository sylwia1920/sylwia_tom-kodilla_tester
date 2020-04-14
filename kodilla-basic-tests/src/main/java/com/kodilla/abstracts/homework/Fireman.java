package com.kodilla.abstracts.homework;

public class Fireman extends Job {

    public Fireman(int salary, String firstName, int age, String job) {
        super(salary = 3000, firstName, age, job);
    }

    @Override
    public void showResponsibilites() {
        System.out.println("- Put out the fire.");
        System.out.println("- Take off the cats");
        System.out.println("- Help people");
        System.out.println("- Save the world");
    }
    public void displayIntro(){
        System.out.println(getFirstName() + " is " + getAge() + " and he is a " + getJob() + ". He earns " + getSalary());
        System.out.println("His responsibilities are:");
    }
}
