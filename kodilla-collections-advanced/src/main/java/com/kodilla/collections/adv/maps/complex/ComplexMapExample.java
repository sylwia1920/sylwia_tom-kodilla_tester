package com.kodilla.collections.adv.maps.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();
        Student john = new Student("John", "Kowalski");
        Student bill = new Student("Bill", "Nowak");
        Student kate = new Student("Kate", "Dona");

        Grades johnGrades = new Grades(5.0, 4.0, 4.5, 5.0, 5.0);
        Grades billGrades = new Grades(2.5, 3.0, 2.0);
        Grades kateGrades = new Grades(4.0, 4.0, 4.0, 4.0, 5.0);

        school.put(john, johnGrades);
        school.put(bill, billGrades);
        school.put(kate, kateGrades);

        System.out.println(school.get(john));
        System.out.println(school.get(bill));
        //System.out.println(school.get(kate));

        for(Map.Entry<Student, Grades> studentEntry : school.entrySet())
            System.out.println(studentEntry.getKey().getFirstname() + ", average: " + studentEntry.getValue().getAverage());


    }
}
