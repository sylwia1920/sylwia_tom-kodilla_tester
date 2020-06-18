package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Document segregation", LocalDate.of(2020, 6, 15), LocalDate.of(2020, 6, 15)));
        tasks.add(new Task("Finish project", LocalDate.of(2020, 6, 5), LocalDate.of(2020, 6, 8)));
        tasks.add(new Task("Make presentation", LocalDate.of(2020, 6, 10), LocalDate.of(2020, 6, 20)));
        tasks.add(new Task("Make presentation", LocalDate.of(2020, 6, 12), LocalDate.of(2020, 6, 22)));
        return tasks;
    }
    }
