package test;

import org.firebirdsql.jdbc.FBDriver;

import java.sql.*;

public class fire {
    private static final String URL = "jdbc:firebirdsql:192.168.20.13/3050:alter_curent?lc_ctype=WIN1251;sql_dialect=3";
    private static final String USER = "sysdba";
    private static final String PASS = "sysadmin";

    public static void main(String[] args) /*throws Exception*/ {

        {
/*            Class.forName("org.firebirdsql.jdbc.FBDriver");
            Properties props = new Properties();
            props.setProperty("user", "SYSDBA");
            props.setProperty("password", "sysadmin");
            //props.setProperty("encoding", "UNICODE_FSS");
            Connection connection = DriverManager.getConnection("jdbc:firebirdsql:192.168.20.13/3050:alter_curent?lc_ctype=WIN1251;sql_dialect=3", props);*/


        Connection connection;
                try {
            Driver driver = new FBDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USER, PASS);
            if (!connection.isClosed()) {
                System.out.println("OK");
            }
            connection.close();
        } catch (SQLException e) {
                    System.out.println(e);

        }
            try {
                Connection connection1 = DriverManager.getConnection(URL, USER,  PASS);
                Statement statement = connection1.createStatement();
              ResultSet res =  statement.executeQuery("SELECT * FROM sysset");
                ResultSet ff = res;
                System.out.println(ff);

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}