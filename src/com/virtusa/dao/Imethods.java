package com.virtusa.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import com.virtusa.dto.*;

public interface Imethods {
	Medicine medicineDetails(String medicineName) throws SQLException; 
	
	public void addMedicine(String medicineID,String MedicineName,
			String Company,int cost, int quantityAvailable, 
			Date expiryDate) throws SQLException;
	
	public void deleteMedicine(String medicineName) throws SQLException;
	public ArrayList<Medicine> Medicinelist() throws SQLException ;
}
