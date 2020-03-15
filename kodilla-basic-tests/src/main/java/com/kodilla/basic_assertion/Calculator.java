package com.kodilla.inheritance.basic_assertion;

public class Calculator {
    private static boolean correct;

    public static void main(String[] args) {
        resultChecker(4, 2);


    }

    public static int dodawanie(int a, int b) {
        correct = ResultChecker.assertEquals(6, dodawanie(a, b));
        if (correct) {
            System.out.println("Metoda dodawanie działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda dodawanie nie działa poprawnie dla liczb " + a + " i " + b);
        }
        return a + b;
    }

    public static int odejmowanie(int a, int b) {
        correct = ResultChecker.assertEquals(2, odejmowanie(a, b));
        if (correct) {
            System.out.println("Metoda odejmowanie działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowanie nie działa poprawnie dla liczb " + a + " i " + b);
        }
        return a - b;
    }

    public static int kwadrat(int a, int b) {
        correct = ResultChecker.assertEquals(16, kwadrat(a, b));
        if (correct) {
            System.out.println("Metoda do kwadratu działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda do kwadratu nie działa poprawnie dla liczb " + a + " i " + b);
        }
        return (int) Math.pow(a, b);
    }

    public static void resultChecker(int a, int b) {
        Calculator calculator = new Calculator();
        odejmowanie(a, b);
        dodawanie(a, b);
        kwadrat(a, b);
    }
}
