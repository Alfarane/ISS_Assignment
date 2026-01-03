package com.app.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

// Register servlet mapping
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    // Handle POST request
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.sendRedirect("login.jsp");
    }
}
