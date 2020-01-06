package Person;

import Interface.Login;

public class Person implements Person_imp{

    private String IdNo;
    private String Name;
    private String Address;
    private int PhnNm;
    private String Email;

    public String getIdNo() {
        return IdNo;
    }

    public void setIdNo(String IdNo) {
        this.IdNo = IdNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPhnNm() {
        return PhnNm;
    }

    public void setPhnNm(int PhnNm) {
        this.PhnNm = PhnNm;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public void setDetails() {
        Login log = new Login();
        
    }

    @Override
    public void getDetails() {
       System.exit(0);  //To change body of generated methods, choose Tools | Templates.
    }
    
}
