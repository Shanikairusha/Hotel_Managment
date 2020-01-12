/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Reservation_Interace;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import Database.Connect_DB;

/**
 *
 * @author Darkness
 */
public class Addreservationtodb {
    //quary and rest
    
    public boolean adddata(Reservation_Interace x){
       
     java.sql.Connection conn = Connect_DB.getConnection();
        boolean result = false;
            try{
               
                Statement stmt = conn.createStatement();
                String query = "INSERT INTO reservation VALUES ('"+x.getBooked_date()+"','"+x.getCheck_in()+"','"+x.getCheck_out()+"','"+x.getR_id()+"','"+x.getU_id()+"','"+x.getR_adults()+"','"+x.getR_children()+"')";
                
                int val = stmt.executeUpdate(query);
                if(val==1){
                    result = true;
                    
                }else{
                    result = false;
                }
            }catch(SQLException sQLException){
                System.out.println(sQLException + "....Insert Query Failed");
            }finally{
               Connect_DB.conn_close(conn);
            }
        
        
        return result;
    }
    public boolean add(Reservation_Interace y){
        
         java.sql.Connection conn = Connect_DB.getConnection();
        boolean result = false;
            try{
                
               
                Statement stmt = conn.createStatement();
                String query1 = "INSERT INTO person VALUES ('"+y.getG_nic()+"','"+y.getG_name()+"','"+y.getG_address()+"','"+y.getG_mobileNum()+"','"+y.getG_email()+"')";
                String query2 = "INSERT INTO resturant_table VALUES ('Res001','"+y.getR_numofpeople()+"','"+y.getR_numoftable()+"')";
                
                int val = stmt.executeUpdate(query1);
                int val2 = stmt.executeUpdate(query2);
                
                if(val==1||val2 == 1){
                    result = true;
                    
                }else{
                    result = false;
                }
            }catch(SQLException sQLException){
                System.out.println(sQLException + "....Insert Query Failed");
            }finally{
             Connect_DB.conn_close(conn);
            }
        
        
        return result;
    }
    
}
