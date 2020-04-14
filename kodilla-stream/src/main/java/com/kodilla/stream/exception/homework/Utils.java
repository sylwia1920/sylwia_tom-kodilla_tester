package com.kodilla.stream.exception.homework;

import java.util.Random;

public class Utils {
    public int getRandomInt(int bound, int extra) {
        return new Random().nextInt(bound)+extra;
    }
}
