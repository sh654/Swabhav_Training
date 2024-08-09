package com.techlabs.connection;

import java.sql.*;
import java.util.Scanner;

public class SuppliersTable {

    private Connection connection;
    private Statement statement;
    private ResultSet resultset;
    private Scanner scanner = new Scanner(System.in);;

    public SuppliersTable(Connection connection) {
        this.connection = connection;
    }

    public void addSupplier() {
        try {
        	
            System.out.println("Enter Supplier ID: ");
            int supplierId = scanner.nextInt();
            System.out.println("Enter Supplier Name: ");
            String name = scanner.next();
            System.out.println("Enter Contact Info: ");
            String contactInfo = scanner.next();
            System.out.println("Enter Address: ");
            String address = scanner.next();

            String query = "INSERT INTO Suppliers (SupplierID, Name, ContactInfo, Address) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, supplierId);
                pstmt.setString(2, name);
                pstmt.setString(3, contactInfo);
                pstmt.setString(4, address);
                pstmt.executeUpdate();
                System.out.println("Supplier added successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateSupplier() {
        try {
            System.out.println("Enter Supplier ID to update: ");
            int supplierId = scanner.nextInt();
            System.out.println("Enter new Supplier Name: ");
            String name = scanner.next();
            System.out.println("Enter new Contact Info: ");
            String contactInfo = scanner.next();
            System.out.println("Enter new Address: ");
            String address = scanner.next();

            String query = "UPDATE Suppliers SET Name = ?, ContactInfo = ?, Address = ? WHERE SupplierID = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setString(1, name);
                pstmt.setString(2, contactInfo);
                pstmt.setString(3, address);
                pstmt.setInt(4, supplierId);
                pstmt.executeUpdate();
                System.out.println("Supplier updated successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteSupplier() {
        try {
            System.out.println("Enter Supplier ID to delete: ");
            int supplierId = scanner.nextInt();

            String query = "DELETE FROM Suppliers WHERE SupplierID = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, supplierId);
                pstmt.executeUpdate();
                System.out.println("Supplier deleted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void getData() {
		// TODO Auto-generated method stub 
		try {
			statement = connection.createStatement();
			resultset = statement.executeQuery("select * from suppliers");
			
			while(resultset.next()) {
				System.out.println(resultset.getInt("SupplierID")+"\t"+resultset.getString("Name")+"\t"+resultset.getString("ContactInfo")+"\t"+resultset.getString("Address")) ;
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
