package configuration;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class connection {
    Connection con;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;

 
    public Connection getConnection(){  
            try{
                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/libray book tracker", "root", "");
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    }
                        return con;
                }
}
