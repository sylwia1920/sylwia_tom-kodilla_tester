package com.kodilla.stream.exception.homework;

public class OrderDoesntExistException extends Exception {
    public OrderDoesntExistException() {
        super("Non-existing order");
    }
}
