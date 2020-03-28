package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Jaguar implements Car {

    private int speed;
    private int increase;
    private int decrease;
    private String carName;

    public Jaguar(int increase) {
        this.speed = 100;
        this.increase = increase;
        this.decrease = 50;
        this.carName = "Jaguar";
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getIncrease() { return increase; }

    @Override
    public int increaseSpeed() {
        return this.speed = this.speed + this.increase;
    }

    @Override
    public int decreaseSpeed() {
        return this.speed = this.speed - this.decrease;
    }

    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jaguar jaguar = (Jaguar) o;
        return speed == jaguar.speed &&
                increase == jaguar.increase &&
                decrease == jaguar.decrease &&
                Objects.equals(carName, jaguar.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, increase, decrease, carName);
    }
}