package GUI;



import java.sql.*;
import javax.swing.JOptionPane;

public class Connect {
   
      private final static String   url = "jdbc:mysql://localhost:3306/";
      private final static String    driver = "com.mysql.jdbc.Driver";
      private final static String   uname = "root";
      private final static String  pword = "";
      private final static String  dbname = "employee";

    public static Connection Conn() {
     
           
        try {
            Class.forName(driver).newInstance();
            Connection con = DriverManager.getConnection(url + dbname, uname, pword);
         
            
           return con;

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
                    return null;
        }
      
    }
}
