package com.xworkz.jdbcapp.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Hotel {
    public static void main(String[] args) {

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded sucessfully");

            String url = "jdbc:mysql://127.0.0.1:3306/Hotel";
            String userName = "root";
            String password = "2002";
            connection=DriverManager.getConnection(url, userName, password);
            System.out.println("connection established sucessfully");

            String insert1 = "insert into hotel_info values(1,'nakshathra','ballari')";
            String insert2= "insert into hotel_info values(2,'rock garden','ballari')";
            String insert3 = "insert into hotel_info values(3,'bala recedency','ballari')";
            String insert4 = "insert into hotel_info values(4,'polas','ballari')";
            String insert5 = "insert into hotel_info values(5,'akshara','raichur')";
            String insert6 = "insert into hotel_info values(6,'radisson','bengaluru')";
            String insert7 = "insert into hotel_info values(7,'taj','mumbai')";
            String insert8 = "insert into hotel_info values(8,'oberoi','mumbai')";
            String insert9 = "insert into hotel_info values(9,'roots','ballari')";
            String insert10 = "insert into hotel_info values(10,'bagecha','ballari')";


            Statement statement = connection.createStatement();
            statement.addBatch(insert1);
            statement.addBatch(insert2);
            statement.addBatch(insert3);
            statement.addBatch(insert4);
            statement.addBatch(insert5);
            statement.addBatch(insert6);
            statement.addBatch(insert7);
            statement.addBatch(insert8);
            statement.addBatch(insert9);
            statement.addBatch(insert10);

            int[] row = statement.executeBatch();
            System.out.println("no of row inserted"+row.length);

        } catch (ClassNotFoundException | SQLException classNotFoundException) {
            System.out.println("JDBC driver not found" + classNotFoundException);
        }finally {
            try{
                if(connection!=null)
                connection.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
