package com.virtusa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.dao.Imethods;
import com.virtusa.dao.methodsImpl;

/**
 * Servlet implementation class AdminDelete
 */
public class AdminDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			Imethods p = new methodsImpl();
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			p.deleteMedicine(request.getParameter("medicinename"));
		    out.println("<h3>Deletion Successfull</h3>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}



}
