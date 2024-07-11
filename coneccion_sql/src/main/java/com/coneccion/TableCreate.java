package com.coneccion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreate {
    public void createTable(){
        String createTableSQL = "CREATE TABLE IF NOT EXISTS empleados ("
                + "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "nombre VARCHAR(50) NOT NULL, "
                + "apellido VARCHAR(50) NOT NULL, "
                + "email VARCHAR(100) NOT NULL"
                + ")";
        try(Connection conex = ConeccionSQL.getConnection();
            Statement Sta = conex.createStatement()){
                Sta.execute(createTableSQL);
                System.out.println("tabla Creada con exito");

            }
        catch (SQLException e) {
                e.printStackTrace();
            }
    }
}
