package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double dimension;
    private boolean stamped;

    public Stamp(String name, double dimension, boolean stamped) {
        this.name = name;
        this.dimension = dimension;
        this.stamped = stamped;

    }

    public String getName() {
        return name;

    }

    public double getDimension() {
        return dimension;
    }

    public boolean getStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return getName().equals(stamp.getName()) &&
                getDimension() == stamp.getDimension() &&
                Objects.equals(getStamped(), stamp.getStamped());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDimension(), getStamped());
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name=" + name +
                ", dimension=" + dimension +
                ", stamped='" + stamped + '\'' +
                '}';
    }
}
