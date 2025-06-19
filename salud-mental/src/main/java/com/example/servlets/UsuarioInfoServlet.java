package com.example.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class UsuarioInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false); // No crear si no existe
        response.setContentType("application/json");

        if (session != null && session.getAttribute("nombreUsuario") != null) {
            String nombre = (String) session.getAttribute("nombreUsuario");

            // Devolver como JSON
            response.getWriter().write("{\"nombre\": \"" + nombre + "\"}");
        } else {
            response.getWriter().write("{\"nombre\": \"Invitado\"}");
        }
    }
}