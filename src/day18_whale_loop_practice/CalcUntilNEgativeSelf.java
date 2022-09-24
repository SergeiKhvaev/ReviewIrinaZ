package day18_whale_loop_practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class CalcUntilNEgativeSelf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();


        while (num >= 0) {
            System.out.println("Enter next number");
            int num1 = input.nextInt();
            if (num1 >= 0) {
               System.out.println("Summary of numbers is: " + (num + num1));
                num = num1;
            } else if (num1 < 0) {
                System.out.println("Stop");
                num = -1;
                // or we can terminate loop here by declaring keyword - break

            }

        }

    }
}











