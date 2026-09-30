package JavaCodes;

//Encapsulation
public class Security {
    private String userName;
    private String password;

    public static void main(String[] args) {
        Security security = new Security();
        security.setDetails("harsha", "12345");
        System.out.println(security.getDetails());
    }

    public void setDetails(String uName, String pwd) {
        this.userName = uName;
        this.password = pwd;
    }

    public String getDetails() {
        return userName;

    }
}
