package day22arrays;

import java.util.Scanner;

public class ArrayDaysOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] days = {"Monday", "Tuesday", "Wendsday", "Thursday", "Friday", "Suturday", "Sunday"};
        System.out.println("Enter day number");
        int numberOfDay = input.nextInt();

        if(numberOfDay <= 7 && numberOfDay >0) {
            System.out.println(days[numberOfDay - 1]);
        } else {
            System.out.println("Invalid number");
        }





    }


}
