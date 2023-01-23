package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Kostya", "Kormashov", (byte) 28);
        userService.saveUser("Maks", "Dugaev", (byte) 28);
        userService.saveUser("Elon", "Mask", (byte) 51);
        userService.saveUser("Alexander", "Sokolovsky", (byte) 28);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
