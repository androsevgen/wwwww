package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conect_to_sakila {
        private  String url = "jdbc:mysql://localhost:3306/sakila";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    private  String user = "root";
        private  String pass = "andros";
    private Connection connection;
    public conect_to_sakila(){
        try {
            connection = DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
