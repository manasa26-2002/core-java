package com.xworkz.jdbcapp.runner;

import java.sql.*;

public class BookRunner {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://127.0.0.1:3306/book";
            String userName = "root";
            String password = "2002";
            connection= DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            //String findBy = "select * from book_info where book_id=3";
            String query = "select * from book_info";

            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String bookName = resultSet.getString(2);
                String bookPrice = resultSet.getString(3);
                System.out.println(id+ "  "+ bookName +"  "+bookPrice);
            }
        }catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            try{
                if(connection!=null){
                    connection.close();
                }
                if(statement!=null){
                    statement.close();
                }
            }catch (SQLException  e){
                System.out.println(e.getMessage());
            }
        }
    }
}
