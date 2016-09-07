package test;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

/**
 * Created by jlab13 on 06.09.2016.
 */
public class testi {
    private static final String URL = "jdbc:mysql://localhost:3306/sakila";
    private static final String USERNAME = "root";
    private static final String PASS = "andros";

    public static void main(String[] args) {

        Connection connection;
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASS);

           connection.close();

        } catch (SQLException e) {
            System.out.println("ERROR");
        }
        try {
            Connection connection1 = DriverManager.getConnection(URL, USERNAME, PASS);
            Statement statement =  connection1.createStatement();
            System.out.println(connection1.isClosed());
//            statement.executeQuery("SELECT city_id FROM city WHERE city_id = 3333");
    statement.addBatch("INSERT INTO city(city_id, city, country_id) VALUES('6666','IPTomsk','22');");
    statement.addBatch("INSERT INTO city(city_id, city, country_id) VALUES('6661','IPTomsk','22');");
    statement.addBatch("INSERT INTO city(city_id, city, country_id) VALUES('6662','IPTomsk','22');");
            statement.executeBatch();
//                ResultSet resultSet = statement.executeQuery("SELECT city_id FROM city WHERE city_id = 3333;");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
