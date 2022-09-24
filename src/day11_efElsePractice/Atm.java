package day11_efElsePractice;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int validPass = 7021;
        System.out.println("Welcome to the ATM");

        int userPasscode = input.nextInt();

        if(userPasscode == validPass) {

            System.out.println("Logged in!\nSelect a number\n\t1) Check Ballance\n\t2)Withdraw\n\t3)Deposit");

            int selection = input.nextInt();

            if(selection == 1) {
                System.out.println("Your balance is: 100_000_000");
            } else if (selection == 2){
                System.out.println(" How much do you want withdraw");
                System.out.println("Witthdrow $ " + input.nextInt());
            } else if (selection == 3){
                System.out.println(" Enter the amount you want to deposit");
                System.out.printf("Deposit & " + input.nextInt());


            }
        }
        else {
            System.out.println(("Invalid passcode")); // this else belong to if on line 16
        }


    }

}
