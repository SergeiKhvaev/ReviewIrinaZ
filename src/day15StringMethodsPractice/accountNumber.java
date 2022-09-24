package day15StringMethodsPractice;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
public class accountNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an account please");
        String account = input.nextLine();

     if (account.startsWith(" ") || account.endsWith(" ")) {
       System.out.println("Empty inputs"); /// не могу понять как вывести вот эту строку
     } else if (account.startsWith("2") && account.length() == 7) {
        System.out.println("Valid 7-digits account number");
    } else if (account.startsWith("2") && account.length() != 7) {
      System.out.println("Invalid 7-digits account number");
     } else if (account.startsWith("5") && account.length() == 5) {
      System.out.println("Valid 5-digits account number");
   } else if (account.startsWith("5") && account.length() != 5) {
        System.out.println("Invalid 5-digits account number");
   } else {
         System.out.println("Invalid number");
     }






                }


            }


