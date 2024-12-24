package com.xworkz.japp.runner;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Amazon {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded sucessfully");

            String url = "jdbc:mysql://127.0.0.1:3306/amazon";
            String userName = "root";
            String password = "2002";
            DriverManager.getConnection(url, userName, password);
            System.out.println("connected successfully");
        }catch(ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("jdbc driver not found" +classNotFoundException);
        }
    }
}
