package com.example.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil 
{
    private static final String URL = "jdbc:mysql://localhost:3306/salud_mental";
    private static final String USER = "root";       // Cambia por tu usuario
    private static final String PASSWORD = "1234";  // Cambia por tu contraseña

    static 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); // ¡Carga explícita del driver!
        }
        catch (ClassNotFoundException e) 
        {
            throw new RuntimeException("Error al cargar el driver de MySQL", e);
        }
    }

    public static Connection getConnection() throws SQLException 
    {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}