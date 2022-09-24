package day8;

import java.util.Scanner;

public class Scanner122 {

    public static void main(String[] args){

        Scanner employeeReport = new Scanner(System.in);

        System.out.println("Full name");

        String fullName = employeeReport.nextLine();

        System.out.println("Job title");
        String jobTitle = employeeReport.nextLine();

        System.out.println("Hourly rate");
        float hourlyRate = employeeReport.nextFloat();

        System.out.println("Number of houre per week");
        int hours = employeeReport.nextInt();

        float salary = hours * hourlyRate * 52;

        employeeReport.nextLine();

        System.out.println("Where is company HQ: ");
        String HQ = employeeReport.nextLine();

        System.out.println("Job report: " + "\n" +  fullName + "\n" + jobTitle + "\n" + salary + "\n" + HQ);







    }
}
