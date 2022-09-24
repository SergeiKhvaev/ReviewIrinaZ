package day9Scanner;
import java.util.Scanner;
public class Lettets {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
                int num = input.nextInt();

                if(num % 2 == 0){
                    System.out.println("Number is even");
                }

        if(num % 2 == 1){
            System.out.println("Number is odd");
        }


System.out.println("________________________________________________________________________");

        char letter = 'Z';
        if (letter >= 'A'&& letter <= 'Z'){
            System.out.println(letter + " is upper case");

        }

    }
}
