package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

        public static List<Flight> getFlightTable() {
            List<Flight> flights = new ArrayList<>();
            flights.add(new Flight("Warsaw", "Paris"));
            flights.add(new Flight("Lodz", "Ankara"));
            flights.add(new Flight("Wroclaw", "Rome"));
            flights.add(new Flight("Warsaw", "Oslo"));
            flights.add(new Flight("Sopot", "London"));
            flights.add(new Flight("Warsaw", "Praha"));
            flights.add(new Flight("Poznan", "Madryt"));
            flights.add(new Flight("Warsaw", "New York"));
            flights.add(new Flight("Lodz", "Tokyo"));
            flights.add(new Flight("Pila", "Kair"));
            flights.add(new Flight("Gdansk", "Berlin"));
            return flights;
        }
    }
