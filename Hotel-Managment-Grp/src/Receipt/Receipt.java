/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receipt;

/**
 *
 * @author SHA
 */
public class Receipt {
    private String ResID;
    private double Total;
    private int StayedDates;

    public String getResID() {
        return ResID;
    }

    public void setResID(String ResID) {
        this.ResID = ResID;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public int getStayedDates() {
        return StayedDates;
    }

    public void setStayedDates(int StayedDates) {
        this.StayedDates = StayedDates;
    }

    public Receipt(String ResID, double Total, int StayedDates) {
        this.ResID = ResID;
        this.Total = Total;
        this.StayedDates = StayedDates;
    }
    
    
}
