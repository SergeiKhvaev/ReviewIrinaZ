package day18_whale_loop_practice;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        // попросить пользователя ввести 5 разных цифр и вывести сколько из них было позитивных, сколько негативных цивр

        Scanner input = new Scanner(System.in);

        int steps =0;

        int posit = 0;
        int negat = 0;

        while (steps < 5){
            System.out.println("Enter  number");
            int number = input.nextInt();
            steps = steps +1;

            if (number > 0 ){
               // System.out.println("Positive " + number);
                posit = posit + 1;
            } else{
               // System.out.println("Negative " + number);
                negat = negat + 1;
            }
            }

        System.out.println("How many positive numbers - " + posit);
        System.out.println("How many negative numbers - " + negat);






    }
}
