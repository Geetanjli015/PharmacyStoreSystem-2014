package com.virtusa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class User2
 */
public class User2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession();
		String name = (String) s.getAttribute("username");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("hello "+name +" Welcome to online Pharmacy Store");
		
		RequestDispatcher rd1 = request.getRequestDispatcher("ShoppingPage.html");
		rd1.include(request, response);
		
		
	}

	

}
