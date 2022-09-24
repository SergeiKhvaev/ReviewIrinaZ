package day10Practice;

import java.util.Scanner;
public class ef_else_mounths {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month number from 1-12");

        int month = input.nextInt();

        int day = 0; // пределив пустую переменную начале, дает нам возможность в будущев в рамках кода присвоить ей нужное нам значение

        if ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10|| month == 12){

            System.out.println("Month that has 31 days");}
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {

            System.out.println("Month that has 30 days");
        }
        else if (month == 2) {
            System.out.println("Month that has 28 days");
        }


        // ввести boolean изначально, что бы укоротить if....else code blocks




    }


}
