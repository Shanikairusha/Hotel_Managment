/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author SHA
 */
public class roomId {
    
    public static Boolean validateRm(String RoomId){
        
        Pattern pattID = Pattern.compile("([R][m][-][0-9]{3})");
        Matcher matchID = pattID.matcher(RoomId);
        if(!(matchID.matches()))
        {
            JOptionPane.showMessageDialog(null, "Entered ID number is not valid please enter valid number");
        }
       
        return matchID.matches();
    }
}
