package com.areteans.Savings.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresManager {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try{
                connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres",
                        "postgres","12334");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                System.out.println("Error connecting to the database");
            }
        }
        return connection;
    }
}