package day41exeptions.try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FanallyExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter nimber 1");
            int num1 = input.nextInt();

            System.out.println("Enter number 2");
            int num2 = input.nextInt();

            System.out.println(num1 + num2);
            String s = null;
            s.trim(); // we will not catch that exception, but finally code will run anyway

        }catch (InputMismatchException e) {
            System.out.println("Need to type numbers input");
        } finally { // always run, even  I will not handle any exceptions
            System.out.println("FINALLY RUN");
            input.close(); // closes the Scanner

        }
    }

}
