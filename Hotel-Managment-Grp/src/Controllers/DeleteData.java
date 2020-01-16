/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Database.Connect_DB;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Darkness
 */
public class DeleteData {
    
    public boolean delete(String id){
        java.sql.Connection conn1 = Connect_DB.getConnection();
        boolean result = false;
       
            try{   
                
                String query1 = "DELETE FROM person WHERE IDNo='"+id+"' ";
                
                PreparedStatement ps = conn1.prepareStatement(query1);
                 //ps.setString(1, x);
//                 ps.setString(2, y); 
//                 ps.setString(3, z);
                     
               int val1 = ps.executeUpdate(query1);
              
                
                if(val1 == 1){
                    result = true;
                    
                }else{
                    result = false;
                }
            }catch(SQLException sQLException){
                System.out.println(sQLException + "....Insert Query Failed");
            }finally{
            // Connect_DB.conn_close(conn);
            }
        return result;
    }
    
    
}
