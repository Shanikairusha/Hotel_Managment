/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Database.Connect_DB;
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
public class RetriveTable {
    public static ArrayList<Table> ResTableIns()
   {
       String TableData = "Select * FROM reservation";
       Connection conn = Connect_DB.getConnection();
       ArrayList<Table> TableDataList = new ArrayList<Table>();
              
        try{
           
           PreparedStatement ps=conn.prepareStatement(TableData);
           //ps.setInt(1,ResID);
           ResultSet rs =ps.executeQuery();
           while(rs.next())
           {
               Table table = new Table(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));

               TableDataList.add(table);
           }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e );
            return null;
       }
       // System.out.println(TableDataList.size());
        
          return TableDataList;
   }
    
    
}
