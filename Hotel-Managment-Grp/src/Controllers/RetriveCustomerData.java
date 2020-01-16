/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Database.Connect_DB;
import Model.Reservation_Interace;
import Model.Table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Darkness
 */
public class RetriveCustomerData {
    
    public static ArrayList<String> retriveResID(){
        
       String quaery = "Select * FROM customer";
       Connection conn = Connect_DB.getConnection();
       ArrayList<String> TableDataList = new ArrayList<String>();
       
              
       
        try{
           
           PreparedStatement ps=conn.prepareStatement(quaery);
           //ps.setInt(1,ResID);
           ResultSet rs =ps.executeQuery();
           while(rs.next())
           {              
              String cus = new String();
              cus =rs.getString(1);
               
               TableDataList.add(cus);              
           }         
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            
       }
        return TableDataList;
    }
    
    public static Reservation_Interace retriveRID(String x ){
        
        String y = re(x);
        String quaery = "Select * FROM person WHERE IDNo=? ";
        String queary1 = "SELECT * FROM Reservation WHERE CustomerID=?";
       Connection conn = Connect_DB.getConnection();
       Reservation_Interace res = new Reservation_Interace();
        
       
        try{
           PreparedStatement ps1 = conn.prepareStatement(queary1);
           ps1.setString(1, x);
           ResultSet rs2 = ps1.executeQuery();
           
           PreparedStatement ps=conn.prepareStatement(quaery);
           ps.setString(1,y);       
           ResultSet rs =ps.executeQuery();
   
           while(rs.next() && rs2.next())
           {              
              
              res.setG_name(rs.getString(2));
              res.setG_address(rs.getString(3));
              res.setG_mobileNum(rs.getInt(4));
              res.setG_nic(rs.getString(1));
              res.setG_email(rs.getString(5));
              
              res.setR_id(rs2.getString(1));
              res.setBooked_date(rs2.getString(3));
               
                             
           }         
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            
       }
        
        
        return res;
    }
        
    public static String re(String cuid){
        String q1 = "SELECT * FROM Customer WHERE CustomerID=?";
        String ID="";
          Connection conn = Connect_DB.getConnection();
             
       
        try{
           
           PreparedStatement ps=conn.prepareStatement(q1);
           ps.setString(1,cuid);
           ResultSet rs =ps.executeQuery();
           while(rs.next())
           {              
              ID = rs.getString(2);
              
           }         
           
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            
       }
        return ID;
    }
}
