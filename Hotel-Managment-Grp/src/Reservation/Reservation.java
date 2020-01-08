/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservation;

import java.util.Date;

/**
 *
 * @author SHA
 */
public class Reservation {
    private String ResID;
    private String CustomerID;
    private Date Date;
    private Date Check_In;
    private Date Check_Out;
    private String UserID;
    private int Adult;
    private int Children;

    public String getResID() {
        return ResID;
    }

    public void setResID(String ResID) {
        this.ResID = ResID;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public Date getCheck_In() {
        return Check_In;
    }

    public void setCheck_In(Date Check_In) {
        this.Check_In = Check_In;
    }

    public Date getCheck_Out() {
        return Check_Out;
    }

    public void setCheck_Out(Date Check_Out) {
        this.Check_Out = Check_Out;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public int getAdult() {
        return Adult;
    }

    public void setAdult(int Adult) {
        this.Adult = Adult;
    }

    public int getChildren() {
        return Children;
    }

    public void setChildren(int Children) {
        this.Children = Children;
    }

    public Reservation(String ResID, String CustomerID, Date Date, Date Check_In, Date Check_Out, String UserID, int Adult, int Children) {
        this.ResID = ResID;
        this.CustomerID = CustomerID;
        this.Date = Date;
        this.Check_In = Check_In;
        this.Check_Out = Check_Out;
        this.UserID = UserID;
        this.Adult = Adult;
        this.Children = Children;
    }
    
    
    
}
