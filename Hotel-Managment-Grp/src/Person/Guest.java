package Person;

import java.sql.Date;

public class Guest extends Customer{

    private Date Date;

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }
}
