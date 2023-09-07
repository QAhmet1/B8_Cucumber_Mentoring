package JDBC;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        String url="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username="root";
        String password="'\"-LhCB'.%k[4S]z";

        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            String query=("select * from actor");
            ResultSet resultSet=statement.executeQuery(query);
            while (resultSet.next()){
                int id=resultSet.getInt("actor_id");
                String firstName=resultSet.getString("first_name");
                String lastName=resultSet.getString("last_name");
                System.out.println("ID: "+id+", First Name: "+firstName+", Last Name: "+lastName);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
