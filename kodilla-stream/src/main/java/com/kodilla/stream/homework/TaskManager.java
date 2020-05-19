package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadlines = TaskRepository.getTasks()
                .stream()
                .map(u -> u.getDeadline())
                .filter(u -> u.isAfter(LocalDate.now()))
                .collect(Collectors.toList());
        System.out.println(deadlines);
    }
}
