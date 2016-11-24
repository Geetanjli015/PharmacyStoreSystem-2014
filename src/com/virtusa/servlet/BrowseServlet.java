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
import com.virtusa.dto.Medicine;

/**
 * Servlet implementation class BrowseServlet
 */
public class BrowseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 {
				Imethods p = new methodsImpl();
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				try {
				Medicine med =	p.medicineDetails(request.getParameter("medicinename"));
				out.println("<h1><Medicine Details</h1>" +
					"<table border='1'>	" +
					"<tr><td>Medicine Name </td> <td>"+med.getMedicineName()+
							"<tr><td>Medicine ID </td> <td>"+med.getMedicineID() +
									"<tr><td>Company </td> <td> "+med.getCompany()+
							"<tr><td>Cost </td> <td> "+med.getCost()+
					"<tr><td>Quantity in stock </td> <td> "+med.getQuantityAvailable()+
					"<tr><td>Expiry Date </td> <td>"+med.getExpiryDate()+"</table>"+"<br><a href='home.jsp'>Home </a>");
											
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

	}

}
