/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author SHA
 */
public class Connect_DB {
    
    
    static Connection conn = null;
    public static Connection getConnection()
    {
        if(conn!=null) return conn;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagment","root","");
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
        System.out.println("Hai");
            return conn;
    }

    
}
