package day9Scanner;

import java.util.Scanner;


public class If_Scanner {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Student?");
        boolean isStudent = input.nextBoolean();

        if(isStudent){
            System.out.println("What are you studying?");
            String subject = input.next();
            System.out.println(subject);
        }
        System.out.println("Do you live in a city? T/f");

        if(input.nextBoolean()){
    System.out.println("Cool, cities are loud and fun");}
        else{
            System.out.println("How many years you lived in the suburban");
            int years = input.nextInt();
            System.out.println(years);


        }



    }


}
