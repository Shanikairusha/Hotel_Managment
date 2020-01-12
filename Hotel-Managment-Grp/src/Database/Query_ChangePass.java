package Database;

import Person.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Query_ChangePass {

    private DBConnManager dbConnManager = null; 
    
    public void validation(String userId, String password, String newpass, String conpass){
        String result = null;
        if(userId.equals("") || password.equals("") || newpass.equals("") || conpass.equals(""))
        {
            result = "Empty Value!";  
            JOptionPane.showMessageDialog(null, result, "WARNNING", JOptionPane.WARNING_MESSAGE);
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
                        PassChange(userId,conpass);
                    }
                    else{
                        result = "Confirm Password not matchs";
                        JOptionPane.showMessageDialog(null, result, "WARNNING", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else
                {
                    result = "Invalid Password!";
                    JOptionPane.showMessageDialog(null, result, "WARNNING", JOptionPane.WARNING_MESSAGE);
                }
            }
            catch(SQLException ex)
            {
                result = ex.getMessage();
                
            }finally {
                dbConnManager.connectionClose(dbConn);
            }
            
        }
  
    }
    
    public void PassChange(String userId, String conpass){
        
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
                JOptionPane.showMessageDialog(null, rslt, "INFO", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                rslt = "Password Change Failed! ";
                JOptionPane.showMessageDialog(null, rslt, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException ex)
        {
            rslt = ex.getMessage();  
            JOptionPane.showMessageDialog(null, rslt, "ERROR", JOptionPane.ERROR_MESSAGE);
            
        } 
    }
}
