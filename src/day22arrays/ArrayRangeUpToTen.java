package day22arrays;


import java.util.Scanner;

public class ArrayRangeUpToTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number from one to ten");
        int enterNum = input.nextInt();

        String[] numbers = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen"};

        if(enterNum >= 1 && enterNum <= 15){
        System.out.println(numbers[enterNum - 1]);
        } else{
            System.out.println("Invalid number has been entered");
        }


    }
}
