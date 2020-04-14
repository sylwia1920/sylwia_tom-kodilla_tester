package com.kodilla.abstracts.homework;

public abstract class Job {

    private int salary;
    private String firstName;
    private int age;
    private String job;

    public Job(int salary, String firstName, int age, String job){
        this.salary = salary;
        this.firstName = firstName;
        this.age = age;
        this.job = job;

    }

    public abstract void showResponsibilites();
    public abstract void displayIntro();

    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getJob() {
        return job;
    }
}
