package com.virtusa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Admin1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uname");
		String password = request.getParameter("upass");
		response.setContentType("text/html");
PrintWriter out = response.getWriter();
		
	   if((username.equalsIgnoreCase("Geet")) && (password.equalsIgnoreCase("Geet#123")))
			   {
	 out.println("<h1>Hello Admin</h1> <br> Click <a href='add.jsp'> Here </a> to add new medicines in stock or Browse all the available one's.<br> " +
	 		"Click<a href='delete.jsp'> here  </a>to delete out of stock medicines<br>" +
	 		"Click<a href='browse.jsp'> here  </a>to browse all the available medicines<br>");
	  
	   }
	   else 
		   out.println("<h1 style='color:red'>Invalid Credentials</h1><br><a href='admin.jsp'>Back</a></h1>");
		
		
	}
	}


