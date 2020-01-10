package Database;

import Interface.Login;
import Person.Person;
import Person.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Query_Login {

    private DBConnManager dbConnManager = null; 
    
    public void login(String userID, String Password){
        dbConnManager = new DBConnManager();  
        Connection dbConn;
        String result; 
        
        try{
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "SELECT * FROM user WHERE UserID = '"+ userID + "' and Password = '" + Password +"' ";
            
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                result = "Login Successful!";
                JOptionPane.showMessageDialog(null, result, "INFO", JOptionPane.INFORMATION_MESSAGE);
               
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
            JOptionPane.showMessageDialog(null, result, "WARNNING", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }
}
