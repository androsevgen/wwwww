package conectFB;

import org.firebirdsql.jdbc.FBDriver;

import java.sql.*;

/**
 * Created by jlab13 on 07.09.2016.
 */
public class conect_fb {
    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    private final String url = "jdbc:firebirdsql:192.168.20.13/3050:alter_curent?lc_ctype=WIN1251;sql_dialect=3";
    private final String user = "sysdba";
    private final String pass = "sysadmin";
    private Connection connection;
    public conect_fb() {
//        Connection connection;
        Driver driver = new FBDriver();
        try {
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

