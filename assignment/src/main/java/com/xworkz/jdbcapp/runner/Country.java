package com.xworkz.jdbcapp.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Country {
    public static void main(String[] args) {

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("drive loaded sucessfully");

            String url = "jdbc:mysql://127.0.0.1:3306/Country";
            String userName = "root";
            String password = "2002";
           connection= DriverManager.getConnection(url, userName, password);
            System.out.println("connected sucessfully");

            String insert = "insert into country_info values(1,'india','new delhi')";
            String insert1 = "insert into country_info values(2,'japan','tokyo')";
            String insert2 = "insert into country_info values(3,'america','washingtonDC')";
            String insert3="insert into country_info values(4,'italy','rome')";
            String insert5 = "insert into country_info values(5,'russia','moscow')";

          Statement statement = connection.createStatement();
          statement.addBatch(insert);
          statement.addBatch(insert1);
          statement.addBatch(insert2);
          statement.addBatch(insert3);
          statement.addBatch(insert5);

          int[] row = statement.executeBatch();
            System.out.println("no of rows inserted"+row.length);

        }catch(ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("JDBC not found"+classNotFoundException);

        }finally {
            try{
                connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
