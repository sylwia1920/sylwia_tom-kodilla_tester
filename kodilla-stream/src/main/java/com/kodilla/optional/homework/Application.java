package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Bill", new Teacher("Nowak")));
        students.add(new Student("Michael", null));
        students.add(new Student("Chris", new Teacher("Kowalski")));
        students.add(new Student("Kate", null));

        for(Student student : students){
            System.out.println("Student: " + student.getTeacher().getName() + "; Teacher: " + student.getTeacher().getName());

            System.out.println();
        }
    }
}
