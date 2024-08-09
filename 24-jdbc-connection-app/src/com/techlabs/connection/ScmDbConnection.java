package com.techlabs.connection;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ScmDbConnection {

	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;
	private Scanner scanner = new Scanner(System.in);
	private SuppliersTable suppliers;
	private ProductsTable products;
	private OrdersTable orders;
	private OrderDetailsTable orderDetails;
	private Inventory inventory;
	
	public void getConnection() {
		
		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scm", "root", "root");
            System.out.println("Welcome to SCM Schema");
            scmCrudSystem();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void scmCrudSystem() {
		boolean isExit = false;
		while(!isExit ) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to change System choose Table for Changes : ");
		System.out.println("1) Supplier \n 2) Product \n 3) Orders \n 4) OrdersDetails \n 5) Inventory \n 6) Exit");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1: 
			supplierCrud();
			break;
		case 2 :
			productsCrud();
			break;
		case 3 :
			ordersCrud();
			break;
		case 4: 
			orderDetailsCrud();
			break;
		case 5:
			inventoryCrud();
			break;
		case 6:
			System.out.println("Thank you for using our system");
			isExit = true;
			break;
		case 7:
			System.out.println("Sahi Input de bacha !!!");
		}
	}
}

	public void inventoryCrud() {
		 Inventory inventory = new Inventory(connection);
		// TODO Auto-generated method stub
		System.out.println("Choose What you want to do for inventory : \n 1) Add inventory \n 2) Update inventory \n 3) Delete invemtory");
		int orderChoice= scanner.nextInt();
		switch(orderChoice) {
		case 1 :
			inventory.addInventory();
			inventory.getData();
			break;
		case 2:
			inventory.updateInventory();
			inventory.getData();
			break;
		case 3: 
			inventory.deleteInventory();
			inventory.getData();
			break;
		default : 
			System.out.println("Enter valid Choice!!!");
			break;
		}
	}

	public void orderDetailsCrud() {
		OrderDetailsTable orderDetails = new OrderDetailsTable(connection);
		// TODO Auto-generated method stub
		System.out.println("Choose What you want to do for OrdersDeatils : \n 1) Add OrderDetails \n 2) Update OrderDeatils \n 3) Delete OrderDetails");
		int orderChoice= scanner.nextInt();
		switch(orderChoice) {
		case 1 :
			orderDetails.addOrderDetail();
			orderDetails.getData();
			break;
		case 2:
			orderDetails.updateOrderDetail();
			orderDetails.getData();
			break;
		case 3: 
			orderDetails.deleteOrderDetail();;
			orderDetails.getData();
			break;
		default : 
			System.out.println("Enter valid Choice!!!");
			break;
		}
		
	}

	public void ordersCrud() {
		OrdersTable orders = new OrdersTable(connection);
		// TODO Auto-generated method stub
		System.out.println("Choose What you want to do for Product : \n 1) Add Product \n 2) Update Product \n 3) Delete Product");
		int orderChoice= scanner.nextInt();
		switch(orderChoice) {
		case 1 :
			orders.addOrder();
			products.getData();
			break;
		case 2:
			orders.getData();
			products.getData();
			break;
		case 3: 
			products.deleteProduct();
			products.getData();
			break;
		default : 
			System.out.println("Enter valid Choice!!!");
		}
	}

	private void productsCrud() {
		 ProductsTable products = new ProductsTable(connection);
		// TODO Auto-generated method stub
		System.out.println("Choose What you want to do for Product : \n 1) Add Product \n 2) Update Product \n 3) Delete Product");
		int productChoice= scanner.nextInt();
		switch(productChoice) {
		case 1 :
			products.addProducts();
			products.getData();
			break;
		case 2:
			products.UpdateProducts();
			products.getData();
			break;
		case 3: 
			products.deleteProduct();
			products.getData();
			break;
		default : 
			System.out.println("Enter valid Choice!!!");
		}
	}

	private void supplierCrud() {
		// TODO Auto-generated method stub
		SuppliersTable suppliers = new SuppliersTable(connection);
		System.out.println("Choose What you want to do for Supplier : \n 1) Add Supplier \n 2) Update Supplier \n 3) Delete Supplier");
		int supplierChoice = scanner.nextInt();
		switch(supplierChoice) {
		case 1 :
			suppliers.addSupplier();
			suppliers.getData();
			break;
		case 2 :
			suppliers.updateSupplier();
			suppliers.getData();
			break;
		case 3: 
			suppliers.deleteSupplier();
			suppliers.getData();
			break;
		default :
			System.out.println("Enter valid Choice!!!");
		}
	}

	
}
