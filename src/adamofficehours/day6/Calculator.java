package adamofficehours.day6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first num");
        int num1 = input.nextInt();
        System.out.println("Enter second num");
        int num2 = input.nextInt();

        add(num1, num2);
        substraction(num1, num2);
        multiply(num1, num2);


    }

    public static int multiply(int num1, int num2) {
        return num1*num2;
    }

    public static int substraction(int num1, int num2) {
        return num1-num2;
    }

    public static int add(int num1, int num2) {
        return num1+num2;
    }


}
