package test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jlab13 on 07.09.2016.
 */
public class main {
    public static void main(String[] args) {
        conect_to_sakila cone = new conect_to_sakila();
        String w200 = "select * from city where country_id = 22";
        try {
            Statement statement = cone.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(w200);

            while (resultSet.next()){
                int a = resultSet.getInt("city_id");
                String b = resultSet.getString("city");
                int c = resultSet.getInt("country_id");
                System.out.println( a +" "+ b +" "+ c);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
