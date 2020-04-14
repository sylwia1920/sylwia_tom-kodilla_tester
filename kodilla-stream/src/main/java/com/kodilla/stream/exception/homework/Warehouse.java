package com.kodilla.stream.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders.stream().filter(objectWithNumber -> objectWithNumber.getNumber().equals(number)).findAny()
                .orElseThrow(OrderDoesntExistException::new);
    }
}
