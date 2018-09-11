
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User
{
    // instance variables - replace the example below with your own
    private String username;
    private String password;
    private String fName;
    private String lName;
    private String dob;
    private String phoneNum;
    private String email;

    /**
     * Constructor for objects of class User
     */
    public User(String username, String password, String fName, String lName, String dob, String phoneNum, String email)
    {
        // initialise instance variables
        this.username = username;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getUsername()
    {
        // put your code here
        return username;
    }
    
    public void setUsername(String username)
    {
        // put your code here
        this.username = username;
    }
    
    public String getPassword()
    {
        // put your code here
        return password;
    }
    
    public void setPassword(String password)
    {
        // put your code here
        this.password = password;
    }
}
