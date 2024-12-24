package com.xworkz.jdbcapp.runner;
import java.sql.*;
public class Runner {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://127.0.0.1:3306/hotel";
            String userName = "root";
            String password = "2002";
            connection= DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            String findBy = "select * from hotel_info where hotel_id=6";
            //String query = "select * from hotel_info";

            ResultSet resultSet = statement.executeQuery(findBy);
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String countryName = resultSet.getString(2);
                String countryCapital = resultSet.getString(3);
                System.out.println(id+ "  "+ countryName +"  "+countryCapital);
            }
        }catch (ClassNotFoundException | SQLException  e) {
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

