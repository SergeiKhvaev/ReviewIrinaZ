package day7Practice;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args){
        Scanner triangleOrCircle = new Scanner(System.in);

        System.out.println("Enter three numbers? please");
        Double num1 = triangleOrCircle.nextDouble();
        Double num2 = triangleOrCircle.nextDouble();
        Double num3 = triangleOrCircle.nextDouble();

        Boolean isTriangle = num1 + num2 + num3 <= 180;
        Boolean isCircle = num1 + num2 + num3 == 360;

        System.out.println("You make a triangle: " + isTriangle);
        System.out.println("You make a circle: " + isCircle);

        /// решить через IF

        System.out.println("--------------------------------------------------------------");




    }
}
