package ru.iroqquois.factories;

import ru.iroqquois.models.User;

public class UserFactory {
    private static int id = 0;

    public static User createUser(String email, String password) {
        User user = new User(id, email, password);
        id++;

        return user;
    }
}
