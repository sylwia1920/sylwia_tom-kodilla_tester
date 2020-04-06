package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("English postage stamp", 43/31.25, false));
        stamps.add(new Stamp("Polish postage stamp", 39.5/31.25, true));
        stamps.add(new Stamp("Hungarian postage stamp", 43/31.25, false));
        stamps.add(new Stamp("Polish postage stamp", 39.5/31.25, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
