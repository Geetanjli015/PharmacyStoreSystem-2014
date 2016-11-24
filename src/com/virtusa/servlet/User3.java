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
 * Servlet implementation class User3
 */
public class User3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    Integer q1,q2,q3,q4,c1,c2,c3,c4;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 q1 =  Integer.parseInt(request.getParameter("q1"));
	  q2 = Integer .parseInt(request.getParameter("q2"));
	  q3 = Integer .parseInt(request.getParameter("q3"));
	  q4 =  Integer.parseInt(request.getParameter("q4"));
		
	if(request.getParameter("ch1") == null ) {  c1 = 0;} else 
	{  c1 =  Integer.parseInt(request.getParameter("ch1"));}
	if(request.getParameter("ch2") == null ) {  c2 = 0;} else 
	{  c2 = Integer .parseInt(request.getParameter("ch2"));}
	if(request.getParameter("ch3") == null ) {  c3 = 0;} else 
	{  c3 = Integer .parseInt(request.getParameter("ch3"));}
	if(request.getParameter("ch4") == null ) {  c4 = 0;} else 
	{  c4 = Integer .parseInt(request.getParameter("ch4"));}
	
	Integer p1 = 100;
	Integer  p2 = 20;
	Integer  p3 = 25;
	Integer p4 = 40;
	
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	Integer bill = q1*c1*p1 + q2*c2*p2 + q3*c3*p3 + q4*c4*p4;
	out.println("<h1 style='color:green'>Your Final bills is "+bill+"</h1>");
	HttpSession hs = request.getSession();
	hs.setAttribute("Bill", bill);
	
	}

}






