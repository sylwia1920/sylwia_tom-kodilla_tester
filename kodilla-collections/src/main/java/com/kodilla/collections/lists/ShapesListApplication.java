package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();
        shapes.add(new Square(10));
        shapes.add(new Square(5));
        shapes.add(new Square(1));
        //Square sq1 = new Square(10);
        //Square sq2 = new Square(5);
        //Square sq3 = new Square(1);
        //shapes.add(sq1);
        //shapes.add(sq2);
        //shapes.add(sq3);
        for (int s = 0; s < shapes.size(); s++) {
            Square square = shapes.get(s);
            //System.out.println(shapes.get(s));
        if (square.getArea() > 20)
            System.out.println(square + ", area: " + square.getArea());
        }
    }
}
