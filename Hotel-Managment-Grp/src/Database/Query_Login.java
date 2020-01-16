package Database;

import Interface.Home;
import Interface.Login;
import Person.Person;
import Person.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Query_Login {

    private String userID;
    private String Role;
    private String Name;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
            
    private DBConnManager dbConnManager = null; 
    
    public boolean login(String userID, String Password){
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
                return true;
               
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
            JOptionPane.showMessageDialog(null, result, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        return false;
    }
    
    public  void getUserInfo(String UserID)
    {
        dbConnManager = new DBConnManager();  
        Connection dbConn = null;
        dbConn = dbConnManager.connect();
      try{
          ResultSet rs = null;
          Statement stm = dbConn.createStatement();
            
          rs= stm.executeQuery("SELECT user.UserID, user.Role, person.Name FROM user,person where user.IDNo = person.IDNo AND user.UserID = '"+UserID+"'");     
          
          while (rs.next()) {
              setUserID(rs.getString(1));
              setRole(rs.getString(2));
              setName(rs.getString(3));
              
          }
      }
      catch(SQLException ex){
        JOptionPane.showMessageDialog( null, ex.getMessage() );
      }

    }
}
