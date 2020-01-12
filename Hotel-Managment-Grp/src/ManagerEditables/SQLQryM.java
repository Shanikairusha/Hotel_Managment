/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagerEditables;

import Database.Connect_DB;
import Rooms.RoomMap;
import Rooms.RoomType;
import com.sun.jndi.ldap.Connection;
import java.util.ArrayList;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
import Tables.Tables;

/**
 *
 * @author SHA
 */
public class SQLQryM {
    
    
    public static ArrayList<RoomMap> InsertRoomTb(){
        
        //creating a roommap object array list
        
        ArrayList<RoomMap> RoomMapTB = new ArrayList<>();
        //create DB connection
         java.sql.Connection conn = Connect_DB.getConnection();
        //create sql statments
        String query= "SELECT * FROM RoomMap";
        
        //try catch for retrieving data
        try{
            Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(query);
             
             while(rs.next()){
                 RoomMap rmMpTB = new RoomMap(rs.getString(1), rs.getString(2), rs.getDouble(3));
                 RoomMapTB.add(rmMpTB);
             }
        }
        
        catch(Exception e){
            
             JOptionPane.showMessageDialog(null, e );
            return null;
        }
         
         
        return RoomMapTB;
        
    }
    
    
    public static int UpdateDB(String RoomNo,String RoomType,Double rate){
        String Upqry="UPDATE RoomMap SET RoomNo=?,RoomType=?  ,Rates=? where RoomNo=?";
        java.sql.Connection conn = Connect_DB.getConnection();
        
         try{
           
           PreparedStatement ps=conn.prepareStatement(Upqry);
           ps.setString(1,RoomNo);
           ps.setString(2,RoomType);
           ps.setDouble(3,rate);
           ps.setString(4,RoomNo);
           
           int rs =ps.executeUpdate();
          
           return 1;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            return 0;
       }
        
        
    }
    
     public static ArrayList<RoomType> RoomTypeTb(){
        
        //creating a roommap object array list
        
        ArrayList<RoomType> RoomTypeTBIn = new ArrayList<>();
        //create DB connection
         java.sql.Connection conn = Connect_DB.getConnection();
        //create sql statments
        String query= "SELECT * FROM RoomType";
        
        //try catch for retrieving data
        try{
            Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(query);
             
             while(rs.next()){
                 RoomType rmTpTb = new RoomType(rs.getString(1), rs.getString(2));
                 RoomTypeTBIn.add(rmTpTb);
             }
        }
        
        catch(Exception e){
            
             JOptionPane.showMessageDialog(null, e );
            return null;
        }
         
         
        return RoomTypeTBIn;
        
    }
     
     public static int UpdateType(String type,String Details){
         
          String Typpqry="UPDATE RoomType SET RoomType=?,Details=? where RoomType=?";
        java.sql.Connection conn = Connect_DB.getConnection();
        
         try{
           
           PreparedStatement ps=conn.prepareStatement(Typpqry);
           ps.setString(1,type);
           ps.setString(2,Details);
           ps.setString(3,type);
           
           
           int rs =ps.executeUpdate();
          
           return 1;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            return 0;
       }
        
         
     }
     
     public static int InsrtRMType(String Tp,String Dt){
         String qry = "Insert Into RoomType (RoomType,Details) VALUES (?,?)";
          java.sql.Connection conn = Connect_DB.getConnection();
          
          
            try{
           
           PreparedStatement ps=conn.prepareStatement(qry);
           ps.setString(1,Tp);
           ps.setString(2,Dt);

           int rs =ps.executeUpdate();
          
           return 1;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            return 0;
       }
        
          
     }
     
     public static int InsrtRMMP(String RmNo,String RmTp,Double rate){
         String qry="INSERT INTO RoomMap (RoomNo,RoomType,Rates) Values (?,?,?)";
         java.sql.Connection conn = Connect_DB.getConnection();
         
          try{
           
           PreparedStatement ps=conn.prepareStatement(qry);
           ps.setString(1,RmNo);
           ps.setString(2,RmTp);
           ps.setDouble(3, rate);

           int rs =ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Inserted succesfully" );
           return 1;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            return 0;
       }
     }
     
}
