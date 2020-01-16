/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receipt;

import java.util.Date;

/**
 *
 * @author SHA
 */
public class Receipt {
    private int RecNo;

   

    public int getRecNo() {
        return RecNo;
    }

    public void setRecNo(int RecNo) {
        this.RecNo = RecNo;
    }
    private String ResID;
    private double Total;
    private int StayedDates;
    private int TableReservations;
    private Date date;

    public int getTableReservations() {
        return TableReservations;
    }

    public void setTableReservations(int TableReservations) {
        this.TableReservations = TableReservations;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Receipt(String ResID, double Total, int StayedDates, int TableReservations, Date date) {
        this.ResID = ResID;
        this.Total = Total;
        this.StayedDates = StayedDates;
        this.TableReservations = TableReservations;
        this.date = date;
    }
    

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
    
     public Receipt(int RecNo, String ResID, double Total, int StayedDates, int TableReservations, Date date) {
        this.RecNo = RecNo;
        this.ResID = ResID;
        this.Total = Total;
        this.StayedDates = StayedDates;
        this.TableReservations = TableReservations;
        this.date = date;
    }
}
