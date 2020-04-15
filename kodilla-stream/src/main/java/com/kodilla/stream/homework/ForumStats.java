package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.NoSuchElementException;

public class ForumStats {
    public static void main(String[] args) {
        List<User> usersList = UsersRepository.getUsersList();
        try {
            double avg1 = usersList
                    .stream()
                    .filter(u -> u.getAge() >= 40)
                    .map(u -> u.getNumberOfPosts())
                    .mapToInt(u -> u)
                    .average()
                    .getAsDouble();
            System.out.println(avg1);
        } catch (NoSuchElementException e){
            System.out.println("There are no people over age of 40");
        }

        try {
            double avg2 = usersList
                    .stream()
                    .filter(u -> u.getAge() < 40)
                    .map(u -> u.getNumberOfPosts())
                    .mapToInt(u -> u)
                    .average()
                    .getAsDouble();
            System.out.println(avg2);
        } catch (NoSuchElementException e) {
            System.out.println("There are no people under age of 40");
        }
    }


    }







