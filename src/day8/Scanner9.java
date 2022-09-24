package day8;

import java.util.Scanner;

public class Scanner9 {
    public static void main(String[] args){

        Scanner shapes = new Scanner(System.in);

        System.out.println("Enter first number");

        float num1 = shapes.nextFloat();

        System.out.println("Enter second number");

        float num2 = shapes.nextFloat();

        System.out.println("Enter third number");

        float num3 = shapes.nextFloat();

        boolean triangle = num1 + num2 + num3 == 180;
        boolean circle = num1 + num2 + num3 == 360;

        System.out.println("Is triangle: " + triangle);
        System.out.println("Is circle: " + circle);

    }

}
