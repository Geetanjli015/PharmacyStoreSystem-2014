package com.virtusa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.dto.*;
/**
 * Servlet implementation class DynamicCost
 */
public class DynamicCost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Medicine> arr = new ArrayList<Medicine>();
		HttpSession s = request.getSession();
//		arr = (List<Medicine>) request.getAttribute("size");
		arr = (List<Medicine>) s.getAttribute("size");
		
		int size = arr.size();
		System.out.println(size);
		Integer q1,c1,p1;
		Integer b = 0;
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		for (int i = 0; i<size; i++)
		{ 
			q1 =  Integer.parseInt(request.getParameter("q+"+i+""));
			if(request.getParameter("ch+"+i+"") == null ) {  c1 = 0;} else 
			{  c1 =  Integer.parseInt(request.getParameter("ch+"+i+""));}
			
			p1 = arr.get(i).getCost();
			System.out.println("q1"+q1);
			System.out.println("c1"+c1);
			System.out.println("p1"+p1);
			 b = q1*c1*p1 + b;
			
	    }
		out.println("<h1 style='color:green'>Your Final bills is "+b+"</h1>");
   }
}