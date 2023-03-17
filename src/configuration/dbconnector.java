package configuration;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class dbconnector {
    
    private Connection connection;
    
    public dbconnector(){
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/book_tracker", "root", "");
            }catch(SQLException e){
                System.err.println("Cannot connect to database: " + e.getMessage());
            }
        
        
    }
    
    public ResultSet getData(String sql) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }
    
    public void insertData(String sql){
//    String sql = "INSERT INTO customers (name, email) VALUES ('John Smith', 'john@example.com')";
            try{
            PreparedStatement pstmt = connection.prepareStatement(sql);
            
            pstmt.executeUpdate();
            System.out.println("Inserted Successfully!");
            pstmt.close();
            }catch(SQLException e){
                System.out.println("Connection Error: "+e);
            }
    }

}

