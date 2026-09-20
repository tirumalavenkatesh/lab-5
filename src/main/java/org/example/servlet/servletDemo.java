package org.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class servletDemo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<h1>Welcome " + username + "</h1>");
        out.println("<p>Password: " + password + "</p>");

        out.println("</body>");
        out.println("</html>");
    }
}