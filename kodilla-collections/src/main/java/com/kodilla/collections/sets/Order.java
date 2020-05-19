package com.kodilla.collections.sets;

import java.util.Objects;

public class Order {
    private String orderNumber;
    private String productName;
    private double quantity;

    public Order(String orderNumber, String productName, double quantity) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.quantity = quantity;

    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.getQuantity(), getQuantity()) == 0 &&
                Objects.equals(getOrderNumber(), order.getOrderNumber()) &&
                Objects.equals(getProductName(), order.getProductName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderNumber(), getProductName(), getQuantity());
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
