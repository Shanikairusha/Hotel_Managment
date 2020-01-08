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
public class PersonID {
    
    public static Boolean validate(String ID)
    {
        Pattern pattID = Pattern.compile("^(?:19|20)?\\d{2}(?:[01235678]\\d\\d(?<!(?:000|500|36[7-9]|3[7-9]\\d|86[7-9]|8[7-9]\\d)))\\d{4}(?:[vVxX])$");
        Matcher matchID = pattID.matcher(ID);
        if(!(matchID.matches()))
        {
            JOptionPane.showMessageDialog(null, "Entered ID number is not valid please enter valid number");
        }
       
        return matchID.matches();
        
    }
    
}
