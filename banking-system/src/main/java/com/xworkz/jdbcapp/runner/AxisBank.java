package com.xworkz.jdbcapp.runner;

import java.sql.DriverManager;
import java.sql.SQLException;

public class AxisBank {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("drive loaded sucessfully");

            String url = "jdbc:mysql://127.0.0.1:3306/axisBank";
            String userName = "root";
            String password = "2002";
            DriverManager.getConnection(url, userName, password);
            System.out.println("connected sucessfully");
        }catch(ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("JDBC drive not found" +classNotFoundException);
        }
    }
}
