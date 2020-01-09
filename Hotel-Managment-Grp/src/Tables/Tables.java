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
    
    private static double Rates;

    public Tables() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
