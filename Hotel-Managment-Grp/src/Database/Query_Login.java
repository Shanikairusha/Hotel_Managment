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
    
    public String login(String userID, String Password){
        dbConnManager = new DBConnManager();  
        Connection dbConn;
        String result; 
        
        try{
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            //JOptionPane.showMessageDialog(null,userID);
            String query = "SELECT * FROM user WHERE UserID = '" +"USER-"+ userID + "' and Password = '" + Password +"' ";
            
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                result = "Access Granted !";
            }
            else
            {
                result = "Access Denied!";
            }
        }
        catch(SQLException ex)
        {
            result = ex + "  The entered student ID cannot be found.";  
            
        }
        
        return result;
    }
}
