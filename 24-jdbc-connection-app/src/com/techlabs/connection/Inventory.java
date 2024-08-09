package com.techlabs.connection;

import java.sql.*;
import java.util.Scanner;

public class Inventory {

    private Connection connection;
	private Statement statement;
	private ResultSet resultset;

    public Inventory(Connection connection) {
        this.connection = connection;
    }

    public void addInventory() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Inventory ID: ");
            int inventoryId = scanner.nextInt();
            System.out.println("Enter Product ID: ");
            int productId = scanner.nextInt();
            System.out.println("Enter Quantity On Hand: ");
            int quantityOnHand = scanner.nextInt();

            String query = "INSERT INTO Inventory (InventoryID, ProductID, QuantityOnHand) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, inventoryId);
                pstmt.setInt(2, productId);
                pstmt.setInt(3, quantityOnHand);
                pstmt.executeUpdate();
                System.out.println("Inventory added successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateInventory() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Inventory ID to update: ");
            int inventoryId = scanner.nextInt();
            System.out.println("Enter new Product ID: ");
            int productId = scanner.nextInt();
            System.out.println("Enter new Quantity On Hand: ");
            int quantityOnHand = scanner.nextInt();

            String query = "UPDATE Inventory SET ProductID = ?, QuantityOnHand = ? WHERE InventoryID = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, productId);
                pstmt.setInt(2, quantityOnHand);
                pstmt.setInt(3, inventoryId);
                pstmt.executeUpdate();
                System.out.println("Inventory updated successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteInventory() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Inventory ID to delete: ");
            int inventoryId = scanner.nextInt();

            String query = "DELETE FROM Inventory WHERE InventoryID = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, inventoryId);
                pstmt.executeUpdate();
                System.out.println("Inventory deleted successfully.");
            }
        } catch (SQLException e) {
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
