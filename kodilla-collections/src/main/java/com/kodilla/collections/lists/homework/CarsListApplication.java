package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Jaguar;
import com.kodilla.collections.interfaces.homework.Porshe;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Porshe(100));
        cars.add(new Jaguar(100));
        cars.add(new Bmw(100));

        Car porshe = new Porshe(70);
        cars.add(porshe);
        System.out.println(cars.size());
        cars.remove(porshe);
        cars.remove(0);
        System.out.println(cars.size());

        for (Car car: cars) {
            CarUtils.describeCar(car);
        }
    }
}
