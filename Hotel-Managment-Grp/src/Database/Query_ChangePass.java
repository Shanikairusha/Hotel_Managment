package Database;

import Person.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Query_ChangePass {

    private DBConnManager dbConnManager = null; 
    
    public String validation(String userId, String password, String newpass, String conpass){
        String result = null;
        if(userId.equals("") || password.equals("") || newpass.equals("") || conpass.equals(""))
        {
            result = "Empty Value!";  
        }
        else
        {
            dbConnManager = new DBConnManager();
            Connection dbConn = null;
            

            try{
                dbConn = dbConnManager.connect();
                Statement stmt = dbConn.createStatement();
                
                String query = "SELECT * FROM user WHERE UserID = '"+userId+"' and Password = '"+password+"' ";

                ResultSet rs = stmt.executeQuery(query);
                if(rs.next()){
                    if(String.valueOf(newpass).equals(String.valueOf(conpass))){
                        result = PassChange(userId,conpass);
                    }
                    else{
                        result = "Confirm Password not matchs";
                    }
                }
                else
                {
                    result = "Access Den00ied!";
                }
            }
            catch(SQLException ex)
            {
                result = ex.getMessage();
                
            }finally {
                dbConnManager.connectionClose(dbConn);
            }
            
        }
        return result;
    }
    
    public String PassChange(String userId, String conpass){
        
        String rslt = null;
        dbConnManager = new DBConnManager();  
        Connection dbConn = null;
        
        try{
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "UPDATE user SET Password = '"+conpass+"' WHERE UserID='"+userId+"'";
            
            int rs = stmt.executeUpdate(query);
           // JOptionPane.showMessageDialog(null,rs);
            if(rs == 1){
                rslt = "Password Changed.";
            }
            else
            {
                rslt = "Password Change Failed! ";
            }
        }
        catch(SQLException ex)
        {
            rslt = ex.getMessage();  
            
        } 
        
        return rslt;
    
    }
}
