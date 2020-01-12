/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FILE;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author SHA
 */
public class write_read {
    
    
    
    
    public static int write(Double d) throws IOException{
        String path = "logs/file.txt";
      try{  
        FileWriter writer = new FileWriter(path);
        writer.write(Double.toString(d));
        writer.close();
        
          return 1; 
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, e);
          return 0;
      }
     
    }
    
    public static String read(){
        String path = "logs/file.txt";
        String rate;
        try{
            FileInputStream read = new FileInputStream(path);
            BufferedReader rd = new BufferedReader(new InputStreamReader(read));
            if((rate=rd.readLine())!=null){
                return rate;
            }
            else{
                return null;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
             return null;
        }
    }
    
    
}
