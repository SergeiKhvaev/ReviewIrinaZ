package day7Practice;

import java.util.Scanner;

public class Scanner4 {

    public static void main(String[] args){

        Scanner triangleOrCirculOrAnother = new Scanner(System.in);

        System.out.println("Enter first number, please: ");
        float num1 = triangleOrCirculOrAnother.nextFloat();

        System.out.println("Enter second number, please: ");
        float num2 = triangleOrCirculOrAnother.nextFloat();

        System.out.println("Enter third number, please: ");
        float num3 = triangleOrCirculOrAnother.nextFloat();


        if (num1+num2+num3 == 180){
            System.out.println("Your shape is Triangle");}
        else if(num1+num2+num3 == 360){
            System.out.println("Your shape is Circul");}
        else {
            System.out.println("Deffenatly not triangle and not circul");}






    }

}
