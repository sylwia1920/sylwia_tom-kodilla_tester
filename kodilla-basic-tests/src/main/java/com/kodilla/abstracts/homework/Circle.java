package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    private int radius;

    public Circle (int radius){
        this.radius = radius;
    }

    public double surfaceArea() {
        return this.radius*this.radius*3.14;
    }

    public double circuit() {
        return this.radius*2*3.14;
    }
}


