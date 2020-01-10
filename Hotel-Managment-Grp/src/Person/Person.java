package Person;

import Database.Query_Person;
import Interface.Login;
import javax.swing.JOptionPane;

public class Person implements Person_imp{

    private String IdNo;
    private String Name;
    private String Address;
    private int PhnNm;
    private String Email;
    
    public Person(String IdNo,String Name,String Address,int PhnNm,String Email){
        this.IdNo = IdNo;
        this.Name = Name;
        this.Address = Address;
        this.PhnNm = PhnNm;
        this.Email = Email;
        
    }

    public Person() {
        
    }

    public void setIdNo(String IdNo) {
        this.IdNo = IdNo;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhnNm(int PhnNm) {
        this.PhnNm = PhnNm;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getIdNo() {
        return IdNo;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }
    
    public int getPhnNm() {
        return PhnNm;
    }

    public String getEmail() {
        return Email;
    }

    @Override
    public String setPDetails() {
        //JOptionPane.showMessageDialog(null,this.IdNo);
        Query_Person q = new Query_Person();
        return q.SetPerson(getIdNo(), getName(), getAddress(), getPhnNm(), getEmail());
    }

    @Override
    public void getDetails() {
       System.exit(0);  //To change body of generated methods, choose Tools | Templates.
    }
    
}
