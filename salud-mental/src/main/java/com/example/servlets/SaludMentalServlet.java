package com.example.servlets;

import com.google.gson.Gson;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class SaludMentalServlet extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String tipoEspecialista = request.getParameter("especialista");
        
        List<Map<String, String>> especialistas = new ArrayList<>();
        try 
        {
            Connection conn = DatabaseUtil.getConnection();
            String sql = "SELECT nombre, apellido, telefono, email, especialista FROM profesionistas WHERE especialista = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, tipoEspecialista);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) 
            {
                Map<String, String> e = new HashMap<>();
                e.put("nombre", rs.getString("nombre"));
                e.put("apellido", rs.getString("apellido"));
                e.put("telefono", rs.getString("telefono"));
                e.put("email", rs.getString("email"));
                especialistas.add(e);
            }
            conn.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        String json = new Gson().toJson(especialistas);
        response.getWriter().write(json);
    }
}