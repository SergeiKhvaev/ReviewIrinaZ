package day11_efElsePractice;

import java.util.Scanner;

public class Else_IfNested {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter level of oxigen, please");

        int oxLevel = input.nextInt();
        String message = "";

        if(oxLevel >= 90) {
            message = "Your tank is full";
        }
        else if (oxLevel >= 80) {
            message = "Still ok";
        }
        else if(oxLevel >= 70) {
            message = "Don`t go too far";
        }
        else if(oxLevel >= 60) {
            message = "Start to go head back";
        }
        else if(oxLevel >= 50){
            message = "Be carefull now at 50%";}

        System.out.println(message);









    }
}
