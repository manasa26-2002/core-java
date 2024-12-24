package com.xworkz.jdbcapp.runner;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Cycle {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("sql loaded sucessfully");

            String url = "jdbc:mysql://127.0.0.1:3306/cycle";
            String userName = "root";
            String password = "2002";
            DriverManager.getConnection(url, userName, password);
            System.out.println("connecton established");

        }catch(ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("JDBC  driver not found"+classNotFoundException);
        }
    }
}
