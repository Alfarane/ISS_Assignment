package com.app.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

// Login servlet mapping
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    // Handle POST request
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String user = req.getParameter("user");
        String pass = req.getParameter("pass");

        if (user != null && pass != null && !user.isEmpty() && !pass.isEmpty()) {


            HttpSession session = req.getSession();
            session.setAttribute("user", user);

            res.sendRedirect("welcome.jsp");

        } else {
            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            res.getWriter().println("Invalid username or password");
        }
    }
}
