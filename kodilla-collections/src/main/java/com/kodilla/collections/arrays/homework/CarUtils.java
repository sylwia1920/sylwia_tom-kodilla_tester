package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Jaguar;
import com.kodilla.collections.interfaces.homework.Porshe;

public class CarUtils {
    public static void describeCar(Car car){


                System.out.println("---------------------------");
                System.out.println("This is: " + getName(car));
                System.out.println("The initial speed of the car was: " + car.getSpeed());
                System.out.println("The car increased its speed of " + car.getIncrease());
                System.out.println("Now the car's speed reaches: " + car.increaseSpeed());
            }
            public static String getName(Car car) {
                if (car instanceof Jaguar)
                    return "Jaguar";
                else if (car instanceof Porshe)
                    return "Porshe";
                else if (car instanceof Bmw)
                    return "Bmw";
                else
                    return "Unknow shape name";
            }
        }
