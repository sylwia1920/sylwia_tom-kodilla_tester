package com.kodilla.collections.interfaces.homework;

public class Porshe implements Car {

    private int speed;
    private int increase;
    private int decrease;
    private String carName;

    public Porshe(int increase) {
        this.speed = 100;
        this.increase = increase;
        this.decrease = 70;
        this.carName = "Porshe";
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


}