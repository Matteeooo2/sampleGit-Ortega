package configuration;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class connection {

    public static java.sql.PreparedStatement prepareStatement(String delete_from_tbl_student_WHERE_st_id__) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection con;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;

 
    public Connection getConnection(){  
            try{
                    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/book_tracker", "root", "");
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    }
                        return con;
                }
}
