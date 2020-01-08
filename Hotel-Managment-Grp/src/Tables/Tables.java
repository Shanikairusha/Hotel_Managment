/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

/**
 *
 * @author SHA
 */
public class Tables {
    private String TableID;
    private String ResID;
    private static int NofSeats;
    private static double Rates;

    public String getTableID() {
        return TableID;
    }

    public void setTableID(String TableID) {
        this.TableID = TableID;
    }

    public String getResID() {
        return ResID;
    }

    public void setResID(String ResID) {
        this.ResID = ResID;
    }

    public static int getNofSeats() {
        return NofSeats;
    }

    public static void setNofSeats(int NofSeats) {
        Tables.NofSeats = NofSeats;
    }

    public static double getRates() {
        return Rates;
    }

    public static void setRates(double Rates) {
        Tables.Rates = Rates;
    }

    public Tables(String TableID, String ResID) {
        this.TableID = TableID;
        this.ResID = ResID;
    }
    
    
}
