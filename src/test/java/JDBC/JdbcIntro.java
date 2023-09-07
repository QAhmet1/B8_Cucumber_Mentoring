package JDBC;

import org.testng.annotations.Test;

import java.sql.*;

public class JdbcIntro {
    @Test
    public void test1() throws SQLException {
        String url="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username="root";
        String password="'\"-LhCB'.%k[4S]z";


        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statement= connection.createStatement();
        String query=("select * from actor");
        ResultSet resultSet= statement.executeQuery(query);
        resultSet.next();
        String firstName=resultSet.getString("first_name");
        System.out.println("firstName = " + firstName);
    }

}
