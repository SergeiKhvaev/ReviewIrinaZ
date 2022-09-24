package day14string;



public class stringMethodsSelf {

    public static void main(String [] args){


        String password1 = "Sergei1983";

        int passwordLength = password1.length();

        System.out.println(passwordLength);


        if (passwordLength == 11) {
            System.out.println("Valid passvord, thank you");}
        else {
            System.out.println("Sorry, you entered invalid password");
        }







    }
}
