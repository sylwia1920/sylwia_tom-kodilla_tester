package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

        private String schoolName;
        private List<Integer> students = new ArrayList<>();

        public School( String schoolName, int... students){
            for(int student : students)
                this.students.add(student);
            this.schoolName = schoolName;
        }

        public int getSumOfPupils() {
            int sum =0;
            for (int student : students)
                sum += student;
            return sum;

        }

        @Override
        public String toString() {
            return "school: \"" + schoolName + "\" with " + getSumOfPupils()+ " students.";
        }
    }
