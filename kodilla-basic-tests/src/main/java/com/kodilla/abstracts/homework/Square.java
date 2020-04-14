package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private int sideLength;

    public Square (int sideLength){
        this.sideLength = sideLength;
    }

    public double surfaceArea() {
        return this.sideLength * this.sideLength;
    }

    public double circuit(){
        return this.sideLength * 7;
    }
}


