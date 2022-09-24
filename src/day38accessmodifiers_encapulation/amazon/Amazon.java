package day38accessmodifiers_encapulation.amazon;

public class Amazon {
    /*
    reate a class AmazonAccount
    instance variables:
        - userName (String)
        - email (String)
     - hasPrime (boolean)
    constructor:
        - initialize the fields
    encapsulate AmazonAccount
    methods: toString()
Create a class UseAmazon
    create an object of the AmazonAccount and verify the constructor,
getters and setters and toString are working properly
     */

    private String userName;
    private String email;
    private boolean isPrime;


    public Amazon(String userName, String email, boolean isPrime) {
        this.userName = userName;
        this.email = email;
        this.isPrime = isPrime;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }


    public String toString() {
        return "Amazon{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", isPrime=" + isPrime +
                '}';
    }
}


