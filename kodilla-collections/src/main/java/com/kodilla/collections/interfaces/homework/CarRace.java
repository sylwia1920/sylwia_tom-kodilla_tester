package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Jaguar jaguar = new Jaguar(100);
        Porshe porshe = new Porshe(100);
        Bmw bmw = new Bmw(100);

        doRace(jaguar);
        doRace(porshe);
        doRace(bmw);
    }

    private static void doRace (Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("The speed of " + car.getCarName() + " has reached " + car.getSpeed() + " km/h.");
    }
}