package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

        public static List<Flight> getFlightTable() {
            List<Flight> flights = new ArrayList<>();
            flights.add(new Flight("Kraków", "Moskwa"));
            flights.add(new Flight("Kraków", "Warszawa"));
            flights.add(new Flight("Kraków", "Paryż"));
            flights.add(new Flight("Kraków", "Rzym"));
            flights.add(new Flight("Londyn", "Oslo"));
            flights.add(new Flight("Praga", "Berlin"));
            flights.add(new Flight("Katowice", "Madryt"));
            flights.add(new Flight("Warszawa", "Los Angeles"));
            flights.add(new Flight("Pekin", "Ottawa"));
            flights.add(new Flight("Detroit", "Warszawa"));
            flights.add(new Flight("Grańsk", "Kraków"));
            return flights;
        }
    }
