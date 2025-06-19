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
        String tipoUsuario = null;
        String nombreUsuario = null;

        try (Connection conn = DatabaseUtil.getConnection()) 
        {
            // 1. Primero verifica en la tabla usuarios
            String sqlUsuarios = "SELECT * FROM usuarios WHERE email = ? AND contrasena = ?";
            PreparedStatement stmtUsuarios = conn.prepareStatement(sqlUsuarios);
            stmtUsuarios.setString(1, correo);
            stmtUsuarios.setString(2, contrasena);
            ResultSet rsUsuarios = stmtUsuarios.executeQuery();

            if (rsUsuarios.next()) 
            {
                tipoUsuario = "usuario";
                nombreUsuario = rsUsuarios.getString("nombre");  // ← Obtener nombre desde tabla usuarios
            } 
            else 
            {
                // 2. Si no encuentra en usuarios, verifica en profesionistas
                String sqlProfesionistas = "SELECT * FROM profesionistas WHERE email = ? AND contrasena = ?";
                PreparedStatement stmtProfesionistas = conn.prepareStatement(sqlProfesionistas);
                stmtProfesionistas.setString(1, correo);
                stmtProfesionistas.setString(2, contrasena);
                ResultSet rsProfesionistas = stmtProfesionistas.executeQuery();

                if (rsProfesionistas.next()) 
                {
                    tipoUsuario = "profesionista";
                    nombreUsuario = rsProfesionistas.getString("nombre");  // ← Obtener nombre desde profesionistas
                }
            }

            if (tipoUsuario != null) 
            {
                // Credenciales válidas
                HttpSession session = request.getSession();
                session.setAttribute("usuario", correo);
                session.setAttribute("tipoUsuario", tipoUsuario);
                session.setAttribute("nombreUsuario", nombreUsuario);  // ← Guardar nombre en sesión
                
                // Redirige según el tipo de usuario
                response.sendRedirect("paginaCarga.html?next=paginaPrincipalSesion.html");
            } 
            else 
            {
                // Credenciales inválidas
                response.sendRedirect("login.html?error=1");
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            response.sendRedirect("login.html?error=2");
        }
    }
}