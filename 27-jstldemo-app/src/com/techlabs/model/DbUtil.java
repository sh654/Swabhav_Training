package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {

    private Connection connection = null;
    private Statement statement = null;
    private static DbUtil dbutil = null;

    private DbUtil() {
    }

    public static DbUtil getDbUtil() {
        if (dbutil == null)
            dbutil = new DbUtil();
        return dbutil;
    }

    public void connectToDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
            System.out.println("Connection Success");
            statement = connection.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getAllUsers() {
        if (statement == null) {
            System.out.println("Statement is null. Did you forget to connect to the database?");
            return null;
        }
        
        ResultSet dbUsers = null;
        try {
            dbUsers = statement.executeQuery("SELECT * FROM user.users");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dbUsers;
    }
//
//    public boolean validateCredentials(String username, String password) {
//        ResultSet dbUsers = getAllUsers();
//        if (dbUsers == null) {
//            System.out.println("No users found. Returning false.");
//            return false;
//        }
//        
//        try {
//            while (dbUsers.next()) {
//                if (dbUsers.getString("usersname").equals(username)) {
//                    if (dbUsers.getString("password").equals(password))
//                        return true;
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
}

