package com.kodilla.inheritance;

public class Convertible extends Car {
    public void otwarcieDachu() {
        System.out.println("Otwieranie dachu...");
    }

    public void zamkniecieDachu() {
        System.out.println("Zamykanie dachu");
    }
    @Override
    public void otworzDrzwi() {
        System.out.println("Otwieranie 2 drzwi");
    }
    public Convertible() {
        System.out.println("Convertible Konstruktor");
    }

}
