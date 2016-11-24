package com.virtusa.dto;

import java.sql.Date;

public class Medicine {
private String medicineID;
private String MedicineName;
private String Company;
private int cost;
private int quantityAvailable;
private Date expiryDate;
public Medicine(String medicineID, String medicineName, String company,
		int cost, int quantityAvailable, Date expiryDate) {
	super();
	this.medicineID = medicineID;
	MedicineName = medicineName;
	Company = company;
	this.cost = cost;
	this.quantityAvailable = quantityAvailable;
	this.expiryDate = expiryDate;
}
public Medicine() {
	super();
}
public String getMedicineID() {
	return medicineID;
}
public void setMedicineID(String medicineID) {
	this.medicineID = medicineID;
}
public String getMedicineName() {
	return MedicineName;
}
public void setMedicineName(String medicineName) {
	MedicineName = medicineName;
}
public String getCompany() {
	return Company;
}
public void setCompany(String company) {
	Company = company;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public int getQuantityAvailable() {
	return quantityAvailable;
}
public void setQuantityAvailable(int quantityAvailable) {
	this.quantityAvailable = quantityAvailable;
}
public Date getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}


}
