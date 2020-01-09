/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import Interface.Home;
import Tables.Tables;
import javax.swing.JOptionPane;

/**
 *
 * @author SHA
 */
public class Home_Receipt_Control {

    public Home_Receipt_Control() {
    }
    
  public static long getDateDiff(Date date1, Date date2) {
    long diffInMillies = date2.getTime() - date1.getTime();
    return TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);
}
  
  public static double roomTotal(int days,double total)
  {
      return(days*total);
  }
  public static double tableTotal(int count)
  {
      double rate = Tables.getRates();
      double total= rate*count;
      //JOptionPane.showMessageDialog(null, "table total");
      return total;
      
  }
  
    
}
