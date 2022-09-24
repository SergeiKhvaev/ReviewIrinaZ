package day7Practice;

import java.util.Scanner;

public class Scanner7 {
    public static void main(String[] args){

        Scanner salaryRate = new Scanner(System.in);

        System.out.println("Enter amount of your salary, please: ");

        float salary = salaryRate.nextFloat();

        System.out.println("Enter number of hours you work, please: ");

        int hoursWork = salaryRate.nextInt();

        float hourlyRate = salary / hoursWork;

        System.out.println("Your hourly rate is: " + hourlyRate);




    }


}
