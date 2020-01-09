package Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Query_User {

    private DBConnManager dbConnManager = null; 
    
    public String setUser(String userId, String IdNo, String Password, String Role){
        
        String rslt = null;
        dbConnManager = new DBConnManager();  
        Connection dbConn = null;
        
        try{
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "INSERT INTO user VALUES ('"+"USER-"+userId+"','"+IdNo+"','"+Role+"','"+Password+"')";
            
            int rs = stmt.executeUpdate(query);
            if(rs > 0){
                rslt = "User Values Inserted";
            }
            else
            {
                rslt = "User Values Insertion Failed! ";
            }
        }
        catch(SQLException ex)
        {
            rslt = (String)ex.getMessage();
            
        } 
        
        return rslt;

    }
}
