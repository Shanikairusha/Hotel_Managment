/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.util.Date;

/**
 *
 * @author SHA
 */
public class Guest extends Customer{
    private Date VisitedDate;

    public Date getVisitedDate() {
        return VisitedDate;
    }
    public Guest(String CustomerID, String IdNo, String Name, String Address, int PhnNm, String Email) {
        super(CustomerID, IdNo, Name, Address, PhnNm, Email);
    }

    public void setVisitedDate(Date VisitedDate) {
        this.VisitedDate = VisitedDate;
    }
    
    
}
