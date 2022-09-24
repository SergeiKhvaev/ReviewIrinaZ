package day11_efElsePractice;
import java.util.Scanner;
public class EfElseMultiBranches {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

System.out.println("Enter number from 1 - 5, please");
        int language = input.nextInt();


        if(language == 1) {
            System.out.println("English");
        }
        else if(language == 2) {
            System.out.println("Spanish");
        }
        else if(language == 3) {
            System.out.println("Turkish");
        }
        else if(language == 4) {
            System.out.println("Russian");
        }
        else if(language == 5) {
            System.out.println("French");
        }
        else {
            System.out.println("English");
        }
        System.out.println("You choosen " + language + " language");}

        }





