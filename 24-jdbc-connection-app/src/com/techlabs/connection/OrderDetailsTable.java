package com.techlabs.connection;

import java.sql.*;
import java.util.Scanner;

public class OrderDetailsTable {

    private Connection connection;
	private Statement statement;
	private ResultSet resultset;

    public OrderDetailsTable(Connection connection) {
        this.connection = connection;
    }

    public void addOrderDetail() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Order Detail ID: ");
            int orderDetailId = scanner.nextInt();
            System.out.println("Enter Order ID: ");
            int orderId = scanner.nextInt();
            System.out.println("Enter Product ID: ");
            int productId = scanner.nextInt();
            System.out.println("Enter Quantity: ");
            int quantity = scanner.nextInt();
            System.out.println("Enter Price: ");
            double price = scanner.nextDouble();

            String query = "INSERT INTO OrderDetails (OrderDetailID, OrderID, ProductID, Quantity, Price) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, orderDetailId);
                pstmt.setInt(2, orderId);
                pstmt.setInt(3, productId);
                pstmt.setInt(4, quantity);
                pstmt.setDouble(5, price);
                pstmt.executeUpdate();
                System.out.println("Order detail added successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateOrderDetail() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Order Detail ID to update: ");
            int orderDetailId = scanner.nextInt();
            System.out.println("Enter new Order ID: ");
            int orderId = scanner.nextInt();
            System.out.println("Enter new Product ID: ");
            int productId = scanner.nextInt();
            System.out.println("Enter new Quantity: ");
            int quantity = scanner.nextInt();
            System.out.println("Enter new Price: ");
            double price = scanner.nextDouble();

            String query = "UPDATE OrderDetails SET OrderID = ?, ProductID = ?, Quantity = ?, Price = ? WHERE OrderDetailID = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, orderId);
                pstmt.setInt(2, productId);
                pstmt.setInt(3, quantity);
                pstmt.setDouble(4, price);
                pstmt.setInt(5, orderDetailId);
                pstmt.executeUpdate();
                System.out.println("Order detail updated successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteOrderDetail() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Order Detail ID to delete: ");
            int orderDetailId = scanner.nextInt();

            String query = "DELETE FROM OrderDetails WHERE OrderDetailID = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, orderDetailId);
                pstmt.executeUpdate();
                System.out.println("Order detail deleted successfully.");
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
