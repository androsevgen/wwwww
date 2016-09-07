package conectFB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jlab13 on 07.09.2016.
 */
public class select_sysset {
        public String selecti(){
            conect_fb cene = new conect_fb();
            String res = "SELECT\n" +
                    "  ITEMCOLVO,\n" +
                    "  ITEMSUM,\n" +
                    "  ITEMVES,\n" +
                    "  AGENT,\n" +
                    "  DOCDATE,\n" +
                    "  UDFUMONTH(DOCDATE)||'.'||UDFUYEAR(DOCDATE) DATEMONTH,\n" +
                    "  GoodsGType,\n" +
                    "  CLIENTSNAME,\n" +
                    "  GOODSSNAME,\n" +
                    "  GOODSGROUPSNAME,\n" +
                    "  ADDRESSLOCATION\n" +
                    "from SPR_SELL2 (\n" +
                    "'01.08.2016',\n" +
                    "'06.08.2016',\n" +
                    "'*',\n" +
                    "'2008,2025,3030,4010,4011,5047,5048,560,2060,800,5060,5037,5046,5042,5061,5062,5065,5066,5067,5068,5069,5070,5072,801') order by DOCMONTH;";


            try {
                Statement statement = cene.getConnection().createStatement();
                ResultSet resultSet = statement.executeQuery(res);
                while (resultSet.next()){
                    double a = resultSet.getDouble("ITEMCOLVO");
                    double b = resultSet.getDouble("ITEMSUM");
                    double c = resultSet.getDouble("ITEMVES");
                    String d = resultSet.getString("AGENT");
                    System.out.println(a +" " + b + " " + c + " "+ d);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return res;
        }
}
