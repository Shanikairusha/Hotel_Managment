/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author SHA
 */
public class Customer extends Person{
    private String CustomerID;

    public Customer(String CustomerID, String IdNo, String Name, String Address, int PhnNm, String Email) {
        super(IdNo, Name, Address, PhnNm, Email);
        this.CustomerID = CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerID() {
        return CustomerID;
    }

   
    
}
