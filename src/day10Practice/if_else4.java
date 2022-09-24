package day10Practice;
import java.util.Scanner;
public class if_else4 {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a time from 0-23 in 24H format, where 0 is midnight");
        int hours = keyboard.nextInt();
        String message = ""; //


        if (hours >= 6 && hours <= 11) {
            message = "Good morning";
        }
        else if (hours >= 12 && hours <= 16) {
            message = "Good Evening";
        }
        else if((hours >= 17 && hours <= 23) || (hours >= 0 && hours <= 5)){
            message = "Good night";
        }
        else {
            message = "Not in 24H format";
        }

System.out.println(message);

    }


}
