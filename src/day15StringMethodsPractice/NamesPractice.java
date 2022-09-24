package day15StringMethodsPractice;
import java.util.Scanner;

public class NamesPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.nextLine().toLowerCase();

        System.out.println ("Enter your last name");
        String lastName = input.nextLine().toLowerCase();

        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.substring(0, 1).toUpperCase() + lastName.substring(0, 1).toUpperCase());
    }
}
