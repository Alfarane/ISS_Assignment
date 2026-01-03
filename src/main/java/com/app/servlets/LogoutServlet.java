package com.app.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

// Logout servlet mapping
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    // Handle GET request
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.getSession().invalidate();
        res.sendRedirect("login.jsp");
    }
}
