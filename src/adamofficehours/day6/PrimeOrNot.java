package adamofficehours.day6;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeOrNot {

    /*
   Task 1 :   Write a method that can check if a number is prime or not

               Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1

    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int num = input.nextInt();
        System.out.println(isPrime(9));
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    // print all prime num in range



    }



