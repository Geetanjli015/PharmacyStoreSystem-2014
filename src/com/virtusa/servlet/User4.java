package com.virtusa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class User4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = request.getParameter("name");
		String password = request.getParameter("password");
		response.setContentType("text/html");
PrintWriter out = response.getWriter();
		session.setAttribute("username",username );
	   session.setAttribute("password", password);
	  
	   RequestDispatcher rd = request.getRequestDispatcher("user2.html");
	   rd.forward(request, response);
	 
	  
		
		
	}
		
		
		
	}

	

