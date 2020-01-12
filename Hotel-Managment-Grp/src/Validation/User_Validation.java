package Validation;

import Database.DBConnManager;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class User_Validation {

    private DBConnManager dbConnManager = null; 

    public User_Validation() {
        
    }
    
    public void CheckIsNum(KeyEvent evt){
         char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }
    private String IdNo;

    public String getIdNo() {
        return IdNo;
    }

    public void setIdNo(String IdNo) {
        this.IdNo = IdNo;
    }
    
    public int CheckIsId(){
        int i = 1;
        if(!(this.IdNo.trim().matches("^[0-9]{9}[vVxX]$")))
        {
            i = 0;
        }
        return i;
    }

    public User_Validation(String IdNo) {
        this.IdNo = IdNo;
    }
}
