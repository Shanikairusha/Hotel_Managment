/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

import Database.Connect_DB;
import Receipt.Receipt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SHA
 */
public class SQLReport {
    
    public static  ArrayList< Receipt> getTable(){
        ArrayList<Receipt> tbl= new ArrayList<Receipt>();
        String qry="Select * From Receipts";
         Connection conn=Connect_DB.getConnection();
       
       
        try{
           
           PreparedStatement ps=conn.prepareStatement(qry);
          
            ResultSet rs = ps.executeQuery();
          while(rs.next()){
              Receipt rcpt = new Receipt(rs.getInt(1), rs.getString(2),rs.getDouble(6), rs.getInt(3), rs.getInt(4), rs.getDate(5));
              tbl.add(rcpt);
          }
          
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            return null;
       }
        
        
        
        return tbl;
        
    }
    
    public static Double total(){
        Double d=null;
        String total = "Select SUM(Total) From Receipts";
        Connection conn=Connect_DB.getConnection();
        
        
         try{
           
           PreparedStatement ps=conn.prepareStatement(total);
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
               d=rs.getDouble(1);
           }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            return null;
       }
         return d;
    }
    
    
}
