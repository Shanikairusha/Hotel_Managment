package Database;

import Person.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.Vector;
import javax.swing.JOptionPane;

public class Query_Person {

    private DBConnManager dbConnManager = null; 
    
    public void SetPerson(String IdNo, String Name,String Address,int PhoneNo,String Email){
        
        String rslt = null;
        dbConnManager = new DBConnManager();  
        Connection dbConn = null;
        
        try{
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "INSERT INTO Person VALUES ('"+IdNo+"','"+Name+"','"+Address+"','"+PhoneNo+"','"+Email+"')";
            
            int rs = stmt.executeUpdate(query);
            if(rs > 0){
                rslt = "Person's Values Inserted";
                JOptionPane.showMessageDialog(null,rslt," INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                rslt = "Person's Values Insertion Failed! ";
                JOptionPane.showMessageDialog(null,rslt," ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex," ERROR", JOptionPane.ERROR_MESSAGE);
            
        } 
          
    }
    
    public void UpdatePerson(String IdNo, String Name,String Address,int PhoneNo,String Email){
        
        String rslt = null;
        dbConnManager = new DBConnManager();  
        Connection dbConn = null;
        
        try{
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "Update Person Set Name='"+Name+"',Address = '"+Address+"',PhnNm = '"+PhoneNo+"',Email = '"+Email+"' where IDNo = '"+IdNo+"'";
            
            int rs = stmt.executeUpdate(query);
            if(rs > 0){
                rslt = "Value Updated";
                JOptionPane.showMessageDialog(null,rslt," INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                rslt = "Value Update Failed! ";
                JOptionPane.showMessageDialog(null,rslt," ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException ex)
        {  
            JOptionPane.showMessageDialog(null,ex," ERROR", JOptionPane.ERROR_MESSAGE);
            
        } 
         
    
    }
    
    public void DeletePerson(String IdNo){
        
        String rslt = null;
        dbConnManager = new DBConnManager();  
        Connection dbConn = null;
        
        try{
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            String query = "DELETE FROM person where IDNo = '"+IdNo+"'";
            
            int rs = stmt.executeUpdate(query);
            if(rs > 0){
                rslt = "Value Deleted";
                JOptionPane.showMessageDialog(null,rslt," INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                rslt = "Value Deletion Failed! ";
                JOptionPane.showMessageDialog(null,rslt," ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex," ERROR", JOptionPane.ERROR_MESSAGE);
        } 
          
    }
    
    
    public  ArrayList<User> getuserDetails(){
        ArrayList<User> usr = new ArrayList<>();
         String rslt = null;
        dbConnManager = new DBConnManager();  
        Connection dbConn = null;
        
        try{
        
            dbConn = dbConnManager.connect();
            Statement stmt = dbConn.createStatement();
            
            String query = "SELECT person.Name ,person.IDNo ,person.Address,person.PhnNm,person.Email, user.UserID, user.Role FROM user , person   WHERE person.IDNo = user.IDNo";
            
            ResultSet rs = stmt.executeQuery(query);
            //JOptionPane.showMessageDialog(null, "2");
            while(rs.next()){
                User user = new User();
                user.setName(rs.getString(1));
                user.setIdNo(rs.getString(2));
                user.setAddress(rs.getString(3));
                user.setPhnNm(rs.getInt(4));
                user.setEmail(rs.getString(5));
                user.setUserId(rs.getString(6));
                user.setRole(rs.getString(7));
                usr.add(user);                
            }
        }
        catch(Exception ex){        
            JOptionPane.showMessageDialog(null, ex);
        }
        finally{        
            dbConnManager.connectionClose(dbConn);
        }
        
        return usr;
        
        
        
        
    }
    
    private String AutoGenUserId;

    public String getAutoGenUserId() {
        return AutoGenUserId;
    }

    public void setAutoGenUserId(String AutoGenUserId) {
        this.AutoGenUserId = AutoGenUserId;
    }
    
    public void ID()
    {
      DBConnManager dbConnManager = null; 
        dbConnManager = new DBConnManager();  
        Connection dbConn = null;
        dbConn = dbConnManager.connect();
      try{
          ResultSet rest = null;
          Statement stm = dbConn.createStatement();
            try{
                rest= stm.executeQuery("select MAX(SUBSTRING_INDEX(UserID,'-',-1)) AS ExtractString FROM user");      
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog( null, ex.getMessage() );
            }
     
            int x=0;
            while (rest.next())
                {
                x= rest.getInt(1);
                }
            setAutoGenUserId((++x)+"");
     
      }
       catch(SQLException exx){
           JOptionPane.showMessageDialog( null, exx.getMessage() );
       }
    }
}
