
package proj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Dbconnection {
    public static Connection getConn()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
		return con;
        } catch (Exception e) {
        } 
        return null;
     
    }
    
    
}
