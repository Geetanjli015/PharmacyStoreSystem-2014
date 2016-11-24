package com.virtusa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.dao.Imethods;
import com.virtusa.dao.methodsImpl;


/**
 * Servlet implementation class Admin2
 */
public class Admin2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * USE THIS QUERY TO CREATE TABLE IN DEVELOPER
create table medicine( medicineId varchar(8),
medicineName varchar(8), 
company varchar(8), 
Price number(4),
quantityAvailable number(4),
expiryDate date);
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Imethods p = new methodsImpl();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String edate=request.getParameter("expiryDate");
		Date fedate=new Date(formatter.parse(edate).getTime());
	
		
				p.addMedicine(request.getParameter("medicineID"), request.getParameter("medicinename"),
						request.getParameter("company"),
						Integer.parseInt(request.getParameter("price")),
						Integer.parseInt(request.getParameter("quantity")),
						fedate);
				
			} catch (NumberFormatException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          
			out.println("" +
					"<br><h3> Click <a href='delete.jsp'>here</a> to delete sold out entry </h3>" +
					"<br> <h3> <a href='home.jsp'>Home Page</a></h3>" +
					"<br><h3><a href='browse.jsp'>Browse all the available medicines</a></h3>" +
					"<br><h3><a href='logout.jsp'>Logout</a></h3>");
	}

}
