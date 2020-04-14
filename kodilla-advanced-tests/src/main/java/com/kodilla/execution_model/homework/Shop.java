package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) throws NullOrder {
        if (order == null) {
            throw new NullOrder();
        } else {
            orders.add(order);
        }
    }

    public List<Order> getRangeOfDates(LocalDate min, LocalDate max)
            throws NoRange {
        List<Order> list = orders
                .stream()
                .filter(u->u.getDate().compareTo(min) >= 0)
                .filter(u->u.getDate().compareTo(max) <= 0)
                .sorted(Comparator.comparing(Order::getDate))
                .collect(Collectors.toList());
        if (list.size() == 0)
            throw new NoRange();
        return list;
    }

    public List<Order> getRangeOfValues(double min, double max)
            throws NoRange {
        List<Order> list = orders.stream()
                .filter(u->u.getPrice()>=min)
                .filter(u->u.getPrice()<=max)
                .sorted(Comparator.comparing(Order::getPrice))
                .collect(Collectors.toList());
        if (list.size() == 0)
            throw new NoRange();
        return list;
    }

    public int getNumbersOfOrders(){
        return orders.size();
    }

    public double sumPricesOfAllOrders() {
        return orders.stream().map(u->u.getPrice()).mapToDouble(u->u).sum();
    }



}
