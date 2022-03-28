package ProjectThree;


public class Task4 {
    /*Create Registration Class in which you would have variables as email, userName and password that
      have an access scope only within its own class. After creating an object of the class user should be able to
      call methods and in each method separately pass values to set users email, username and password.
      Requirements: A.Valid email consider to be only yahoo B.Valid userName and password cannot be empty and
      should be of length larger than 6 characters. Also valid password cannot contain userName*/
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("67didi@yahoo.com");
        registration.setUserName("didi123");
        registration.setPassword("Tester123");
    }
}
class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
            System.out.println(email);
        } else { System.out.println("enter valid email address");}}

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
            System.out.println(userName);
        } else {System.out.println("Username cannot be empty or less than 6 characters");}}

    public void setPassword(String password){
        if (!password.isEmpty() && password.length()>6 && !password.equals(userName)){
            this.password=password;
            System.out.println(password);
        }else {System.out.println("Password cannot be empty or less than 6 characters or cannot contain username");}}
}
