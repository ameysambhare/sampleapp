package com.controller;

import com.model.Employee;
import com.service.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/findEmployee")
public class EmployeeServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("employeeid");
        EmployeeService service = new EmployeeService();
        Employee returnValue = service.getEmployee(id);
        if(returnValue!=null){
           request.setAttribute("employee",returnValue);
        }else{
           request.setAttribute("error","No Employees Found");
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request,response);

    }
}
