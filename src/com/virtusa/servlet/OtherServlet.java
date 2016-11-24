package com.virtusa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.dao.Imethods;
import com.virtusa.dao.methodsImpl;
import com.virtusa.dto.*;

/**
 * Servlet implementation class OtherServlet
 */
public class OtherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Medicine> m = new ArrayList<Medicine>();
		response.setContentType("text/html");
		try {
			System.out.println("hieeeeee");
			Imethods p = new methodsImpl();
			PrintWriter out = response.getWriter();
			m = p.Medicinelist();
			
			
			out.println("<form action='cost.do' method='get'><table> "
+"<tr>"
+"   <th>Products</th>"
+"  <th>Price</th>"
+"  <th>Quantity</th>"
+"  <th>Order</th>"
+"</tr>");
			String size = null;//sending array to get size
			HttpSession session = request.getSession();
			session.setAttribute("size",m );
			
			for (int i = 0; i<m.size(); i++)
			{
				
				Medicine med = m.get(i);
				//out.println("<h1>"+med.getMedicineName()+"</h1>");
			
				out.println("<tr>"
   +" <td>"+ med.getMedicineName()+"</td>"
   +" <td>"+ med.getCost()+"INR</td>"
   +" <td><input type='text' name='q+"+i+"' value='1'></td>"
   

   +" <td><input type='checkbox' name='ch+"+i+"' value='1'></td>"
 
+"</tr>");
				

	
			}
			out.println("</table>"+"<input type='submit' name='Login' value='Submit'>"+" </form>");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
