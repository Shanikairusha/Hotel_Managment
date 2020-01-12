package Person;

import Database.Query_ChangePass;
import Database.Query_Login;
import Database.Query_User;
import javax.swing.JOptionPane;

public class User extends Person{

    private String userId;
    private String password;
    private String role;
    private String newpass;
    private String conpass;

    public String getNewpass() {
        return newpass;
    }

    public void setNewpass(String newpass) {
        this.newpass = newpass;
    }

    public String getConpass() {
        return conpass;
    }

    public void setConpass(String conpass) {
        this.conpass = conpass;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public User(String userId, String password, String role, String IdNo, String Name, String Address, int PhnNm, String Email) {
        super(IdNo, Name, Address, PhnNm, Email);
    }
    
    
    public User (String UserId, String Password, String Newpass, String Conpass){
        this.userId = UserId;
        this.password = Password;
        this.newpass = Newpass;
        this.conpass = Conpass;
    }
    
    public User(String userId, String password){
        this.userId = userId;
        this.password = password;
    }
    
    public User(){
    
    }
    
    public String SetUDetails(){
        Query_User qu = new Query_User();
        return qu.setUser(getUserId(),getIdNo(),getPassword(),getRole());
        
    }
    
    public void userlogin(){
        Query_Login ql = new Query_Login();
        ql.login(getUserId(),getPassword());
    }
    
    public void changePass(){
        //JOptionPane.showMessageDialog(null,this.getUserId());
        Query_ChangePass qcp = new Query_ChangePass();
        qcp.validation(getUserId(),getPassword(),getNewpass(),getConpass());
    }

    
    

}
