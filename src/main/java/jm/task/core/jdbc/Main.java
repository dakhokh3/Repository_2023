package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Morozov", (byte) 26);
        userService.saveUser("Elena", "Smirnova", (byte) 25);
        userService.saveUser("Oleg", "Sidorov", (byte) 34);
        userService.saveUser("Kirill", "Petrov", (byte) 56);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

