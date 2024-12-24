package com.xworkz.jdbcapp.runner;
import java.sql.*;
public class RetriveRunner {
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
            String query = "select * from country_info";

            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            System.out.println("country id:"+resultSet.getInt(1)+ "country name:"+resultSet.getString(2)+" country capital:"+resultSet.getString(3));
           resultSet.next();
            System.out.println(resultSet.getInt(1));
            resultSet.next();
            System.out.println(resultSet.getInt(1));
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
