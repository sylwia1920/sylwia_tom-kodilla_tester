package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    public static List<User> getUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Bill Nowak", 50, 7, "Chemists"));
        users.add(new User("Kate Etna", 25, 4648, "Sales"));
        users.add(new User("Chris Kowalski", 34, 116, "Manager"));
        users.add(new User("Jan Nowicki", 49, 0, "Board"));
        users.add(new User("Michael Male", 44, 2, "Chemists"));
        users.add(new User("Karol Patrzyk", 57, 0, "Secruity"));
        return users;

    }
}
