package com.kodilla.abstracts.homework;

public class Gardener extends Job {

    public Gardener(int salary, String firstName, int age, String job) {
        super(salary = 1500, firstName, age, job);
    }

    @Override
    public void showResponsibilites() {
        System.out.println("- Cuts the lawn.");
        System.out.println("- Cuts branches.");
        System.out.println("- Water the plants.");
    }
    public void displayIntro(){
        System.out.println(getFirstName() + " is " + getAge() + " and he is a " + getJob() + ". He earns " + getSalary());
        System.out.println("His responsibilities are:");
    }
}


