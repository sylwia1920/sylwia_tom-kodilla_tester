package com.kodilla.abstracts.homework;

public class Plumber extends Job {

    public Plumber(int salary, String firstName, int age, String job) {
        super(salary = 3500, firstName, age, job);
    }

    @Override
    public void showResponsibilites() {
        System.out.println("- Repairs pipes.");
        System.out.println("- Seals pipes");
    }
    public void displayIntro(){
        System.out.println(getFirstName() + " is " + getAge() + " and he is a " + getJob() + ". He earns " + getSalary());
        System.out.println("His responsibilities are:");
    }
}
