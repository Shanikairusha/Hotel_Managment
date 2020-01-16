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
//    
//    public boolean adddata(Reservation_Interace x){
//       
//     java.sql.Connection conn = Connect_DB.getConnection();
//        boolean result = false;
//            try{
//               
//                Statement stmt = conn.createStatement();
//                String query = "INSERT INTO reservation VALUES ('"+x.getBooked_date()+"','"+x.getCheck_in()+"','"+x.getCheck_out()+"','"+x.getR_id()+"','"+x.getU_id()+"','"+x.getR_adults()+"','"+x.getR_children()+"')";
//                
//                int val = stmt.executeUpdate(query);
//                if(val==1){
//                    result = true;
//                    
//                }else{
//                    result = false;
//                }
//            }catch(SQLException sQLException){
//                System.out.println(sQLException + "....Insert Query Failed");
//            }finally{
//               Connect_DB.conn_close(conn);
//            }
//        
//        
//        return result;
//    }
    public boolean add(Reservation_Interace y){
        
         java.sql.Connection conn = Connect_DB.getConnection();
        boolean result = false;
            try{
                
               
                Statement stmt = conn.createStatement();
                String query1 = "INSERT INTO person VALUES ('"+y.getG_nic()+"','"+y.getG_name()+"','"+y.getG_address()+"','"+y.getG_mobileNum()+"','"+y.getG_email()+"')";
                String query2 = "INSERT INTO customer VALUES ('"+y.getCustomer_id()+"','"+y.getG_nic()+"')";
                String query3 = "INSERT INTO reservation VALUES ('"+y.getR_id()+"','"+y.getCustomer_id()+"','"+y.getBooked_date()+"','"+y.getCheck_in()+"','"+y.getCheck_out()+"','"+y.getU_id()+"','"+y.getR_adults()+"','"+y.getR_children()+"')";
                
              //  System.out.println(y.getG_nic()+"last class");
               int val1 = stmt.executeUpdate(query1);
               int val2 = stmt.executeUpdate(query2);
               int val3 = stmt.executeUpdate(query3);
                
                if(val1 == 1&&val2==1&& val3 == 1){
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
    public boolean insertTable(String x,String y,String z){
        
         java.sql.Connection conn1 = Connect_DB.getConnection();
        boolean result = false;
       // System.out.println(x,y,z);
            try{   
                
                String query1 = "INSERT INTO resturant_table VALUES('"+x+"','"+y+"','"+z+"')";
                
                PreparedStatement ps = conn1.prepareStatement(query1);
//                 ps.setString(1, x);
//                 ps.setString(2, y); 
//                 ps.setString(3, z);
                 
              //  System.out.println(y.getG_nic()+"last class");
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
    
    public boolean InsertRoom(String RoomNo) {
        boolean result=false;
        java.sql.Connection conn1 = Connect_DB.getConnection();
            String query1 = "UPDATE roommap SET 'Availability'=? WHERE RoomNo = ? ";
        try{  
                    PreparedStatement ps = conn1.prepareStatement(query1);
                    ps.setInt(1, 1);
                    ps.setString(2, RoomNo); 
//                 ps.setString(3, z);
                 
              //  System.out.println(y.getG_nic()+"last class");
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
