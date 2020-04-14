package com.kodilla.stream.exception.homework;

import java.util.Set;

public class WarehouseApp {
    private static Warehouse warehouse = new Warehouse();
    private static Utils utils = new Utils();

    public static void main(String[] args) {
        generateOrders();
        String orderString = Integer.toString(utils.getRandomInt(100, 1));
        try {
            warehouse.getOrder(orderString);
            System.out.println("Order number selected: " + orderString);
        } catch (OrderDoesntExistException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Thanks");
        }
    }

    private static Set<Order> generateOrders() {
        for (int i = 0; i < utils.getRandomInt(100, 1); i++) {
            warehouse.addOrder(new Order(Integer.toString(utils.getRandomInt(100, 1))));
        }
        return warehouse.getOrders();
    }
}
