package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

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
            //txt_euserid.setText();
     
      }
       catch(SQLException exx){
           JOptionPane.showMessageDialog( null, exx.getMessage() );
       }
    }
}
