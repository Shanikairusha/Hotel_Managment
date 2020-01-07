package Person;

import Interface.Login;

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
    public void setDetails() {
        Login log = new Login();
        
    }

    @Override
    public void getDetails() {
       System.exit(0);  //To change body of generated methods, choose Tools | Templates.
    }
    
}
