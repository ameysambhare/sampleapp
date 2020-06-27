package com.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/processRequest")
public class ProcessServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("inside process servlet "+request.getParameter("username"));
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("inside process servlet do Post "+request.getParameter("username"));
    }
}
