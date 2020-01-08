/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bookings;

import java.util.Date;

/**
 *
 * @author SHA
 */
public class Bookings {
    private String CustomerID;
    private String ResID;
    private Date BookedDate;

    public Bookings(String CustomerID, String ResID, Date BookedDate) {
        this.CustomerID = CustomerID;
        this.ResID = ResID;
        this.BookedDate = BookedDate;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public void setResID(String ResID) {
        this.ResID = ResID;
    }

    public void setBookedDate(Date BookedDate) {
        this.BookedDate = BookedDate;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getResID() {
        return ResID;
    }

    public Date getBookedDate() {
        return BookedDate;
    }
    
    
}
