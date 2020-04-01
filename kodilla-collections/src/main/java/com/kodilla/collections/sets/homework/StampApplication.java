package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("English postage stamp", 43/31.25, "No"));
        stamps.add(new Stamp("Polish postage stamp", 39.5/31.25, "Yes"));
        stamps.add(new Stamp("Hungarian postage stamp", 43/31.25, "No"));
        stamps.add(new Stamp("Polish postage stamp", 39.5/31.25, "Yes"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps);
        System.out.println(stamps);


    }
}
