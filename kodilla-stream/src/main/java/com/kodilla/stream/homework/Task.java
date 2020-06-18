package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Task {
    private String name;
    private LocalDate opened;
    private LocalDate deadline;

    public Task(String name, LocalDate opened, LocalDate deadline) {
        this.name = name;
        this.opened = opened;
        this.deadline = deadline;

    }

    public String getName() { return name; }

    public LocalDate getOpened() {
        return opened;
    }

    public LocalDate getDeadline() {
        return deadline;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) &&
                Objects.equals(opened, task.opened) &&
                Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, opened, deadline);
    }

    private static LocalDate validateDate(LocalDate opened, LocalDate deadline) throws InvalidDateException, InvalidInputException {

        Scanner scanner = new Scanner(System.in);
        int doWhile = 1;
        while (doWhile != 2) {
            if (deadline.isBefore(opened)) {
                throw new InvalidDateException();
            } else if (deadline.equals(opened)) {
                System.out.println("Date of Open - Press Type 1 (yes) and or press Type 2 (no)");
                try {
                    int userAnswer = scanner.nextInt();
                    if (userAnswer == 1) {
                        return deadline;
                    } else if (userAnswer == 2) {
                        throw new InvalidDateException();
                    } else {

                        throw new InvalidInputException();
                    }
                } catch (Exception a) {
                    throw new InvalidInputException();
                }
            } else {
                return deadline;
            }
        }
        return deadline;
    }
}
