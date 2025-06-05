package com.example.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class LoginServlet extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");

        try (Connection conn = DatabaseUtil.getConnection())
        {
            // Consulta para verificar credenciales
            String sql = "SELECT * FROM usuarios WHERE email = ? AND contrasena = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, correo);
            statement.setString(2, contrasena);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) 
            {
                //Credenciales válidas
                HttpSession session = request.getSession();
                session.setAttribute("usuario", correo); // Guarda el correo en sesión
                response.sendRedirect("paginaPrincipalSesion.html"); // Redirige a página privada
            } 
            else
            {
                //Credenciales inválidas
                response.sendRedirect("login.html?error=1"); // Redirige con parámetro de error
            }
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
            response.sendRedirect("login.html?error=2"); // Error de base de datos
        }
    }
}