package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> students = new HashMap<>();


                Principal bill = new Principal("Bill", "Nowak");
                Principal chris = new Principal("Chris", "Kowalski");
                Principal michael = new Principal("Michael", "Nowicki");

                School billSchool = new School("School of Bill", 23,12,30,15,18);
                School chrisSchool = new School("School of Chris", 34,12,17,18,27);
                School michaelSchool = new School("School of Michael", 8,17,26,25,29);

                students.put(bill, billSchool);
                students.put(chris, chrisSchool);
                students.put(michael, michaelSchool);

                for(Map.Entry<Principal,School> schoolEntry: students.entrySet())
                    System.out.println("Principal " + schoolEntry.getKey().getFirstName() + " " +
                            schoolEntry.getKey().getLastName() + " has " +
                            schoolEntry.getValue().toString());
            }
        }
