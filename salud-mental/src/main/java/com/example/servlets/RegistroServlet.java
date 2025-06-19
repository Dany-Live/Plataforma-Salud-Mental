package com.example.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class RegistroServlet extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        // Recupera todos los parámetros del formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String fechaNacimiento = request.getParameter("fechanacimiento");
        String numeroMovil = request.getParameter("numeromovil");
        String instituto = request.getParameter("instituto");
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena"); //¡Ojo con la ñ!
        String sexo = request.getParameter("opcion"); // Directamente obtendrás "Hombre" o "Mujer"

        try (Connection conn = DatabaseUtil.getConnection())
        {
            String sql = "INSERT INTO usuarios (nombre, apellido, fecha_nacimiento, telefono, institucion, email, contrasena, sexo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, apellido);
            statement.setString(3, fechaNacimiento);
            statement.setString(4, numeroMovil);
            statement.setString(5, instituto);
            statement.setString(6, correo);
            statement.setString(7, contrasena);
            statement.setString(8, sexo);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) 
            {
                //response.getWriter().println("¡Registro exitoso!");

                // Redirige a una página de sesión
                response.sendRedirect("paginaCarga.html?next=paginaPrincipalSesion.html");
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