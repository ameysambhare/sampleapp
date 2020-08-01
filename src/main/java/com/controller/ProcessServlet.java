package com.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/processRequest")
public class ProcessServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("inside process servlet "+request.getParameter("username"));
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("inside process servlet do Post "+request.getParameter("username"));

        if("admin".equalsIgnoreCase(request.getParameter("username")) && "admin".equalsIgnoreCase(request.getParameter("password"))){
            HttpSession session = request.getSession();
            session.setAttribute("username",request.getParameter("username"));
            RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
            dispatcher.forward(request,response);
        }else{
            response.sendRedirect("error.html");
        }
    }
}
