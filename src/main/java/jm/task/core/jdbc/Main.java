package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.createUsersTable();
        userServiceImpl.saveUser("Kostya", "Kormashov", (byte) 28);
        userServiceImpl.saveUser("Maks", "Dugaev", (byte) 28);
        userServiceImpl.saveUser("Elon", "Mask", (byte) 51);
        userServiceImpl.saveUser("Alexander", "Sokolovsky", (byte) 28);
        userServiceImpl.getAllUsers();
        userServiceImpl.cleanUsersTable();
        userServiceImpl.dropUsersTable();

    }
}
