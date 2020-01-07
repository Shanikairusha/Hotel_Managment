package Person;

public class User extends Person{

    private String userId;
    private String password;
    private String role;

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
        this.userId = userId;
        this.password = password;
        this.role = role;
    }
    
    public User(String userId, String password){
        this.userId = userId;
        this.password = password;
    }
    
    public User(){
    
    }
    
    

}
