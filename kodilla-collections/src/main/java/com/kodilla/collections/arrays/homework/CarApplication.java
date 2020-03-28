package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Jaguar;
import com.kodilla.collections.interfaces.homework.Porshe;

import java.util.Random;

public class CarApplication {


        public static void main(String[] args) {
            Random random = new Random();
            int tableLength = random.nextInt(15)+1;
            Car[] carArray = new Car[tableLength];
            for (int i = 0; i < tableLength; i++){
                carArray[i] = drawCar();
            }

            for (int i =0; i < tableLength; i++){
                CarUtils.describeCar(carArray[i]);
            }
        }

        public static Car drawCar(){
            Random random = new Random();
            int drawCar = random.nextInt(3);
            int drawSpeedIncrease = random.nextInt(51);

            if (drawCar == 0)
                return new Jaguar(drawSpeedIncrease);
            else if (drawCar == 1)
                return new Porshe(drawSpeedIncrease);
            else
                return new Bmw(drawSpeedIncrease);
        }
    }
