package com.virtusa.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.virtusa.dto.Medicine;
import com.virtusa.factory.DBConnectionFactory;

public class methodsImpl implements Imethods {
	private Connection connection = null;
	@Override
	public Medicine medicineDetails(String medicineName) throws SQLException {
		
		connection = DBConnectionFactory.getConnection();
		
		String query = "select * from medicine ";
		Statement stmt = connection.createStatement();
		
	
		ResultSet resultSet = stmt.executeQuery(query);
		Medicine medicine = new Medicine();
		while (resultSet.next()) {
			
			
			
			String name = resultSet.getString("medicineName");
			if(name.equalsIgnoreCase(medicineName)){
			
				medicine.setMedicineName(name);
				medicine.setMedicineID(resultSet.getString("medicineId"));
				medicine.setCompany(resultSet.getString("company"));
				medicine.setCost(resultSet.getInt("Price"));
				medicine.setQuantityAvailable(resultSet.getInt("quantityAvailable"));
				medicine.setExpiryDate(resultSet.getDate("expiryDate"));
				
			}
		}
		
		return medicine;
	}

	@Override
	public void addMedicine(String medicineID, String MedicineName,
			String Company, int cost, int quantityAvailable, Date expiryDate)
			throws SQLException {
		connection = DBConnectionFactory.getConnection();
		String query = "insert into medicine values (?,?,?,?,?,?)";
		
		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setString(1, medicineID);
		pstmt.setString(2, MedicineName);
		pstmt.setString(3, Company);
		pstmt.setInt(4, cost);
		pstmt.setInt(5, quantityAvailable);
		pstmt.setDate(6, expiryDate);
		int Update = pstmt.executeUpdate();
		System.out.println("Rows updates"+Update);

	}

	@Override
	public void deleteMedicine(String medicineName) throws SQLException {
		connection = DBConnectionFactory.getConnection();
		String query = "delete from medicine where medicinename = ?";

		PreparedStatement pstmt = connection.prepareStatement(query);
		pstmt.setString(1, medicineName);
		int Update = pstmt.executeUpdate();
		System.out.println("Rows Deleted"+Update);

	}

	@Override
	public ArrayList<Medicine> Medicinelist() throws SQLException {
	    
connection = DBConnectionFactory.getConnection();
		
		String query = "select * from medicine ";
		Statement stmt = connection.createStatement();
		
	
		ResultSet resultSet = stmt.executeQuery(query);
		List<Medicine> l = new ArrayList<Medicine>();
		while (resultSet.next()) {
			Medicine medicine = new Medicine();
			medicine.setMedicineName(resultSet.getString("medicineName"));
			medicine.setMedicineID(resultSet.getString("medicineId"));
			medicine.setCompany(resultSet.getString("company"));
			medicine.setCost(resultSet.getInt("Price"));
			medicine.setQuantityAvailable(resultSet.getInt("quantityAvailable"));
			medicine.setExpiryDate(resultSet.getDate("expiryDate"));
			l.add(medicine);
		}
		
		return (ArrayList<Medicine>) l;
		
		
	}

}
