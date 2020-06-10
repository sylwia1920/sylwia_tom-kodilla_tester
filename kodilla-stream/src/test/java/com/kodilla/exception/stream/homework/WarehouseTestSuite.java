package com.kodilla.exception.stream.homework;

import com.kodilla.stream.exception.homework.Order;
import com.kodilla.stream.exception.homework.OrderDoesntExistException;
import com.kodilla.stream.exception.homework.Warehouse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class WarehouseTestSuite {

    Warehouse warehouse = new Warehouse();

    @Test
    public void ShouldReturnOrderWhenItExists() throws OrderDoesntExistException {
        warehouse.addOrder(new Order("1"));
        Order result = warehouse.getOrder("1");
        assertEquals("1", result.getNumber());
    }

    @Test (expected = OrderDoesntExistException.class)
    public void ShouldReturnExceptionWhenOrderDoesNotExist() throws OrderDoesntExistException {
        warehouse.addOrder(new Order("1"));
        Order result = warehouse.getOrder("2");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void ShouldReturnExceptionWhenOrderDoesNotExistSecondAttempt() throws OrderDoesntExistException {
        thrown.expect(OrderDoesntExistException.class);
        thrown.expectMessage("Non-existing order");
        warehouse.addOrder(new Order("10"));
        Order result = warehouse.getOrder("20");
    }
}
