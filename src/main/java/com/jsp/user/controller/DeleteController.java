package com.jsp.user.controller;

import java.io.IOException;

import javax.persistence.Id;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.user.dao.EmployeeDao;
import com.jsp.user.dto.Employee;
import com.jsp.user.service.EmployeeService;

@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String id = req.getParameter("id");
		int e_id = Integer.parseInt(id);
		
		
		EmployeeService employeeService = new EmployeeService();
		boolean res = employeeService.deleteEmployee(e_id);
		
		if(res == true) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("delete.jsp");
			requestDispatcher.forward(req, resp);
		}
			
	}
		
	}
	
	


