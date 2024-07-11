package com.coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConeccionSQL {
    // clases del paquete java.sql que se utilizan para coneccion a la base de
    // datos.

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/monda";
    private static final String USER = "root";
    private static final String PASSWORD = "juandavidgomez15@";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
