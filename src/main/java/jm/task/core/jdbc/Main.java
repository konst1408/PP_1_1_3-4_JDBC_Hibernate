package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("Kostya", "Kormashov", (byte) 28);
        userDaoJDBC.saveUser("Maks", "Dugaev", (byte) 28);
        userDaoJDBC.saveUser("Elon", "Mask", (byte) 51);
        userDaoJDBC.saveUser("Alexander", "Sokolovsky", (byte) 28);
        userDaoJDBC.getAllUsers();
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();

    }
}
