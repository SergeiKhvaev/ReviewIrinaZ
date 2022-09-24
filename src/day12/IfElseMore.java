package day12;

import java.util.Scanner;

public class IfElseMore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pin = input.nextInt();
        int ssn = input.nextInt();

        if( pin == 1234 && ssn == 1111) {
            System.out.printf("All good");
        }

        else {
            if(pin != 1234 && ssn == 1111) {
                System.out.println("pin is incorrect");}

            if (pin == 1234 && ssn != 1111){
                System.out.println("SSN is incorrect");
            }
            else {
                System.out.println("Pin and SSN are incorrect");
            }


        }




    }
}
