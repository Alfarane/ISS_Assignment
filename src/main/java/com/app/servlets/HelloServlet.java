package com.app.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

// Servlet mapping
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    // Handle GET request
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // Set response type
        res.setContentType("text/html");

        // Send response
        res.getWriter().println("<h1>Hello World</h1>");
    }
}
