package com.techlabs.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductsTable {

	private Connection connection;
	private Scanner scanner = new Scanner(System.in);
	private Statement statement;
	private ResultSet resultset;
	
	public ProductsTable(Connection connection) {
		this.connection = connection;
	}
	
	public void addProducts() {
		 System.out.println("Enter Product Id ID: ");
         int ProductId = scanner.nextInt();
         System.out.println("Enter Product Name: ");
         String Name = scanner.next();
         System.out.println("Enter Description of Product: ");
         String Description = scanner.next();
         System.out.println("Enter Supplier same as Existing : ");
         int supplierId = scanner.nextInt();
         
         String query = "INSERT INTO PRODUCTS(ProductID, Name, Description, SupplierID) VALUES(?, ?, ?, ? )";
         try {
			PreparedStatement pstm = connection.prepareStatement(query);
			pstm.setInt(1, ProductId);
			pstm.setString(2, Name);
			pstm.setString(3, Description);
			pstm.setInt(4, supplierId);
			pstm.executeUpdate();
			System.out.println("Added New Data");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void UpdateProducts() {
		System.out.println("Enter Product Id to Update: ");
        int ProductId = scanner.nextInt();
        System.out.println("Enter New Product Name: ");
        String Name = scanner.next();
        System.out.println("Enter New Description of Product: ");
        String Description = scanner.next();
        System.out.println("Enter New Supplier same as Existing : ");
        int supplierId = scanner.nextInt();
        
        String query = "UPDATE Products SET Name = ?, Description = ?, SupplierID= ? Where ProductID = ?";
        try {
        	PreparedStatement stmt = connection.prepareStatement(query);
        	stmt.setString(1, Name);
        	stmt.setString(2, Description);
        	stmt.setInt(3,  supplierId);
        	stmt.setInt(4, ProductId);
        	stmt.executeUpdate();
        }catch(SQLException e) {
        	e.printStackTrace();
        }
	}
	
	public void deleteProduct() {
		int productId = scanner.nextInt();
		
		String query = "DELETE from products where productId= ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1, productId);
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getData() {
		// TODO Auto-generated method stub 
		try {
			statement = connection.createStatement();
			resultset = statement.executeQuery("select * from products");
			
			while(resultset.next()) {
				System.out.println(resultset.getInt("ProductID")+"\t"+resultset.getString("Name")+"\t"+resultset.getString("Description")+"\t"+resultset.getString("SupplierID")) ;
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
