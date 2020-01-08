/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.managment;

import Database.Connect_DB;
import java.sql.Connection;
import javax.xml.stream.events.Comment;
import java.sql.*;

/**
 *
 * @author SHA
 */
public class test {
    public static void main(String [] args){
         
     Connection conn=Connect_DB.getConnection();
    
    try{
        String s ="Select CustomerID from Customer where IDno='971000848v'";
       Statement st=conn.createStatement();
       ResultSet rs= st.executeQuery(s);
       
       while(rs.next())
       {
           System.out.println(rs.getString(1));
       }
       
    }
    catch(Exception e){
        
    }
        
                 
         
   
    
    }
    
}
