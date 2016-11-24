package com.virtusa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class User1
 */
public class User1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String username = request.getParameter("uname");
		String password = request.getParameter("upass");
		response.setContentType("text/html");
PrintWriter out = response.getWriter();
		session.setAttribute("username",username );
	   session.setAttribute("password", password);
	   if((username.equalsIgnoreCase("Geet")) && (password.equalsIgnoreCase("Geet#123")))
			   {
	   RequestDispatcher rd = request.getRequestDispatcher("user2.html");
	   rd.forward(request, response);
	  
	   }
	   else 
		   out.println("<h1 style='color:red'>Invalid Credentials</h1><br><a href='CustomerRegistration.jsp'>Go to registration page if new user</a><br><a href='CustomerLogin.jsp'>For relogin</a>");
		
		
	}

}
