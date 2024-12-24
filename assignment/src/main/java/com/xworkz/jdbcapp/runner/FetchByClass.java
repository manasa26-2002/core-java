package com.xworkz.jdbcapp.runner;

import java.sql.*;

public class FetchByClass {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://127.0.0.1:3306/country";
            String userName = "root";
            String password = "2002";
            connection= DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            String findById = "select * from country_info where country_id = 5";
            ResultSet resultSet = statement.executeQuery(findById);
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String countryName = resultSet.getString(2);
                String countryCapital = resultSet.getString(3);
                System.out.println(id+ "  "+ countryName +"  "+countryCapital);
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
