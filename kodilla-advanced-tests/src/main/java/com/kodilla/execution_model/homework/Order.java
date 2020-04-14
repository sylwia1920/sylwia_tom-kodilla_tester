package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private String name;
    private double price;
    private LocalDate date;
    private String login;

    public Order(String name, double price, LocalDate date, String login) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.price, price) == 0 &&
                Objects.equals(name, order.name) &&
                Objects.equals(date, order.date) &&
                Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, date, login);
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }


}
