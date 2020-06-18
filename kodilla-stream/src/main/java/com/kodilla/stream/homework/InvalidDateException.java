package com.kodilla.stream.homework;

public class InvalidDateException extends Exception {
    public InvalidDateException() {
        super ("Date later than the opening date.");
    }
}
