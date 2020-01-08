package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Query_Person {

    private DBConnManager dbConnManager = null; 
    
    public String SetPerson(String IdNo, String Name,String Address,int PhoneNo,String Email){
        
        String rslt = null;
        dbConnManager = new DBConnManager();  
        Connection dbConn = null;
        
        try{
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "INSERT INTO Person VALUES ('"+IdNo+"','"+Name+"','"+Address+"','"+PhoneNo+"','"+Email+"')";
            
            int rs = stmt.executeUpdate(query);
            if(rs > 0){
                rslt = "Value Inserted";
            }
            else
            {
                rslt = "Value Insertion Failed! ";
            }
        }
        catch(SQLException ex)
        {
            rslt = ex.getMessage();  
            
        } 
        
        return rslt;
    
    }
}
