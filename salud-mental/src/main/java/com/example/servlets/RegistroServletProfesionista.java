package com.example.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class RegistroServletProfesionista extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // Recupera todos los parámetros del formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String fechaNacimiento = request.getParameter("fechanacimiento");
        String numeroMovil = request.getParameter("numeromovil");
        String cedula = request.getParameter("cedula");
        String correo = request.getParameter("correo");
        String instituto = request.getParameter("instituto");
        String contrasena = request.getParameter("contrasena");
        String sexo = request.getParameter("opcion");

        try (Connection conn = DatabaseUtil.getConnection())
        {
            String sql = "INSERT INTO profesionistas (nombre, apellido, fecha_nacimiento, telefono, cedula, email, institucion, contrasena, sexo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, apellido);
            statement.setString(3, fechaNacimiento);
            statement.setString(4, numeroMovil);
            statement.setString(5, cedula);
            statement.setString(6, correo);
            statement.setString(7, instituto);
            statement.setString(8, contrasena);
            statement.setString(9, sexo);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) 
            {
                // Redirige a una página de sesión
                response.sendRedirect("paginaPrincipalSesion.html");
                return; // Termina la ejecución del servlet
            }
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}