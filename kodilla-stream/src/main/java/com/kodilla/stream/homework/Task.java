package com.kodilla.stream.homework;

import java.time.LocalDate;

public class Task {
    private String name;
    private LocalDate opened;
    private LocalDate deadline;

    public Task(String name, LocalDate opened, LocalDate deadline) {
        this.name = name;
        this.opened = opened;
        this.deadline = deadline;

    }

    public String getName() {
        return name;
    }

    public LocalDate getOpened() {
        return opened;
    }

    public LocalDate getDeadline() {
        return deadline;
    }


}
