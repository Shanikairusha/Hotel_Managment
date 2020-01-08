/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 *
 * @author SHA
 */
public class Connect_DB {

    
    
    static Connection conn = null;
    //static ResultSet rs = null;
    public static Connection getConnection()
    {
        if(conn!=null) return conn;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel managment","root","");
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
        //System.out.println("Hai");
            return conn;
    }
    public static void conn_close(Connection conn)
    {
        try{
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(  " -- DB connection closing failure"+e); 
        }
    }

}
