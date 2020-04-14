package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);
        this.teacher = optionalTeacher.orElse(new Teacher("No Teacher"));
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher(){
        return teacher;
    }
}
