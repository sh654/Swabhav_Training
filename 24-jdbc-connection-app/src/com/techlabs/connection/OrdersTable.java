package com.techlabs.connection;

import java.sql.*;
import java.util.Scanner;

public class OrdersTable {

    private Connection connection;
	private Statement statement;
	private ResultSet resultset;

    public OrdersTable(Connection connection) {
        this.connection = connection;
    }

    public void addOrder() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Order ID: ");
            int orderId = scanner.nextInt();
            System.out.println("Enter Order Date (YYYY-MM-DD): ");
            String orderDate = scanner.next();
            System.out.println("Enter Supplier ID: ");
            int supplierId = scanner.nextInt();

            String query = "INSERT INTO Orders (OrderID, OrderDate, SupplierID) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, orderId);
                pstmt.setDate(2, Date.valueOf(orderDate));
                pstmt.setInt(3, supplierId);
                pstmt.executeUpdate();
                System.out.println("Order added successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateOrder() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Order ID to update: ");
            int orderId = scanner.nextInt();
            System.out.println("Enter new Order Date (YYYY-MM-DD): ");
            String orderDate = scanner.next();
            System.out.println("Enter new Supplier ID: ");
            int supplierId = scanner.nextInt();

            String query = "UPDATE Orders SET OrderDate = ?, SupplierID = ? WHERE OrderID = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setDate(1, Date.valueOf(orderDate));
                pstmt.setInt(2, supplierId);
                pstmt.setInt(3, orderId);
                pstmt.executeUpdate();
                System.out.println("Order updated successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteOrder() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Order ID to delete: ");
            int orderId = scanner.nextInt();

            String query = "DELETE FROM Orders WHERE OrderID = ?";
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, orderId);
                pstmt.executeUpdate();
                System.out.println("Order deleted successfully.");
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

