package com.kodilla.abstracts.homework;

public class Cook extends Job {

    public Cook(int salary, String firstName, int age, String job) {
        super(salary = 5000, firstName, age, job);
    }

    @Override
    public void showResponsibilites() {
        System.out.println("- Cooks.");
        System.out.println("- Bakes cakes");
        System.out.println("- Snack");
    }
    public void displayIntro(){
        System.out.println(getFirstName() + " is " + getAge() + " and he is a " + getJob() + ". He earns " + getSalary());
        System.out.println("His responsibilities are:");
    }
}


