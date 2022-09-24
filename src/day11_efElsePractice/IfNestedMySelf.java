package day11_efElsePractice;
import java.util.Scanner;


public class IfNestedMySelf {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        int pincode = 1234;
        int ssn = 1111;

        System.out.println("Enter two numbers");
        System.out.println("Enter pincode");
       int num1 = input.nextInt();

        System.out.println("Enter ssn");
       int num2 = input.nextInt();

        if(num1 == pincode && num2 == ssn){
            System.out.println("authentication successful");
        }
        else {
            if(num1 != pincode && num2 != ssn){
                System.out.println("Incorrect passcode and ssn");
            }
            else if (num1 != pincode){
                System.out.println("Incorrect passcode");
            }
            else if (num2 != ssn) {
                System.out.println("Incorrect ssn");
            }
        }



    }
}
