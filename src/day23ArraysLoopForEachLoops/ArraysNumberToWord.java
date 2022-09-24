package day23ArraysLoopForEachLoops;

import java.util.Scanner;

public class ArraysNumberToWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words ={"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "fifteen" };
        System.out.println("Enter number gor zero to 12");
        int num = input.nextInt();
        if(num >= 0 && num <= 15){
            System.out.println(words[num]);
        } else{
            System.out.println("Invalid number");
        }




    }
}
