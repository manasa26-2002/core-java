 package com.xworkz.jdbcapplication.runner;
import java.sql.*;
public class University {
    public static void main(String[] args) {
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("drive loaded successfully");

            String url="jdbc:mysql://127.0.0.1:3306/university";
            String userName="root";
            String password="2002";
            connection= DriverManager.getConnection(url,userName,password);
            System.out.println("establish connection succesfull");

            String insert = "insert into university_info values(0,'bangaluru university','bangaluru')";

            String insert1 = "insert into university_info values(0,'cambridge university','cambridge')";

            String insert2 = "insert into university_info values(0,'krishnadevaraya university','gulbarga')";

            Statement statement = connection.createStatement();
            statement.addBatch(insert);
            statement.addBatch(insert1);
            statement.addBatch(insert2);
            int[] row = statement.executeBatch();
            System.out.println("no of row inserted"+row.length);

        }catch (ClassNotFoundException | SQLException classNotFoundException){

            System.out.println("JDBC driver not found"+classNotFoundException);
        }finally {
            try{
                connection.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
