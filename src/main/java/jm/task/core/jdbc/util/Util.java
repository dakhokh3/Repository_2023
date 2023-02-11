package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/test_database";
    private static final String USER = "root";
    private static final String PASSWORD = "root";


    static public Connection getConnection() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;

    }
    // реализуйте настройку соеденения с БД
}