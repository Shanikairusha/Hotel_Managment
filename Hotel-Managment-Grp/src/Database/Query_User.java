package Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Query_User {

    private DBConnManager dbConnManager = null; 
    
    public void setUser(String userId, String IdNo, String Password, String Role){
        
        String rslt = null;
        dbConnManager = new DBConnManager();  
        Connection dbConn = null;
        
        try{
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "INSERT INTO user VALUES ('"+userId+"','"+IdNo+"','"+Role+"','"+Password+"')";
            
            int rs = stmt.executeUpdate(query);
            if(rs > 0){
                rslt = "User Values Inserted";
                JOptionPane.showMessageDialog(null,rslt," INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                rslt = "User Values Insertion Failed! ";
                JOptionPane.showMessageDialog(null,rslt," ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex," ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        
    }
    
    public void UpdateUser(String userId, String IdNo, String Role){
        
        String rslt = null;
        dbConnManager = new DBConnManager();  
        Connection dbConn = null;
        
        try{
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            JOptionPane.showMessageDialog(null,userId);
            String query = "Update user Set UserID='"+userId+"',IDNo='"+IdNo+"',Role='"+Role+"' where UserID='"+userId+"'";
            
            int rs = stmt.executeUpdate(query);
            if(rs > 0){
                rslt = "User Values Updated";
                JOptionPane.showMessageDialog(null,rslt," INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                rslt = "User Values Update Failed! ";
                JOptionPane.showMessageDialog(null,rslt," INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                
                
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex," ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        
    }
}
