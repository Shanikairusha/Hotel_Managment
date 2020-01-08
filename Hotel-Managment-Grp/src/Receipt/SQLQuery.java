/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receipt;

import Database.Connect_DB;
import Reservation.Reservation;
import Rooms.RoomMap;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author SHA
 */
public class SQLQuery {
     
      String ResDetailsQ;
    
    
    
   public  static String Cstretrieve(String ID){
       
       String CustDetailsQ="Select CustomerID FROM  Customer where  IDno= ? ";
       Connection conn = Connect_DB.getConnection(); 
       
       try{
           
           PreparedStatement ps=conn.prepareStatement(CustDetailsQ);
           ps.setString(1,ID);
           ResultSet rs =ps.executeQuery();
           while(rs.next())
           {
               JOptionPane.showMessageDialog(null, "ok" );
               return(rs.getString(1));
           }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            return null;
       }
         
        return null;
   }
   
   public static String ResDataRet(String Cust)
   {
       String ResDetailsQ="Select * from reservation  where CustomerID= ? ";
       Connection conn = Connect_DB.getConnection(); 
          
         try{
           
           PreparedStatement ps=conn.prepareStatement(ResDetailsQ);
           ps.setString(1,Cust);
           ResultSet rs =ps.executeQuery();
           while(rs.next())
           {
               
               JOptionPane.showMessageDialog(null, "ok" );
               return(rs.getString(1));
           }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            return null;
       }
         return null;
   }
   public static int RecordCount(String CID){
       String RecordCount ="SELECT COUNT(ResID) FROM reservation where CustomerID=?";
       Connection conn = Connect_DB.getConnection();
       
        try{
           
           PreparedStatement ps=conn.prepareStatement(RecordCount);
           ps.setString(1,CID);
           ResultSet rs =ps.executeQuery();
           while(rs.next())
           {
               //JOptionPane.showMessageDialog(null, "record count" );
               return(rs.getInt(1));
           }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            return 0;
       }
        return 0;
    
   }
   
   public static ArrayList<Reservation> TableInser(String CID)  {
       ArrayList<Reservation> recordList = new ArrayList<>();
      
//Reservation record[] = new Reservation[n];
       String RecordCount ="SELECT * FROM reservation where CustomerID=?";
       Connection conn = Connect_DB.getConnection();
       
       
        try{
           
           PreparedStatement ps=conn.prepareStatement(RecordCount);
           ps.setString(1,CID);
           ResultSet rs =ps.executeQuery();
           while(rs.next())
           {
               Reservation record = new Reservation(rs.getString(1),rs.getString(2), rs.getDate(3), rs.getDate(4), rs.getDate(5),rs.getString(6),rs.getInt(7),rs.getInt(8));
               recordList.add(record);
           }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            return null;
       }
        System.out.println(recordList.size());
        return recordList;
    
   }
   
   public static ArrayList<RoomMap> RoomInser(String ResID)  {
       ArrayList<RoomMap> roomList = new ArrayList<>();
      
//Reservation record[] = new Reservation[n];
       String RecordCount ="SELECT * FROM roommap where RoomNo in (select RoomNo From Room where ResID=?)";
       Connection conn = Connect_DB.getConnection();
       
       
        try{
           
           PreparedStatement ps=conn.prepareStatement(RecordCount);
           ps.setString(1,ResID);
           ResultSet rs =ps.executeQuery();
           while(rs.next())
           {
               RoomMap room = new RoomMap(rs.getString(1), rs.getString(2), rs.getDouble(3));
               roomList.add(room);
           }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            return null;
       }
        System.out.println(roomList.size());
        return roomList;
    
   }
   
}
   
