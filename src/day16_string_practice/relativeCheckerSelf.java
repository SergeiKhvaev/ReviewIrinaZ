package day16_string_practice;

import java.util.Scanner;
public class relativeCheckerSelf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name and last name of the first person");
        String firstPerson = input.nextLine();
        String firstPersonLowerCase = firstPerson.toLowerCase();

        String lnameFirstPerson = firstPersonLowerCase.substring(firstPerson.indexOf(" "));

        System.out.println("Enter first name and last name of the second person");
        String secondPerson = input.nextLine();
        String secondPersonLowerCase = secondPerson.toLowerCase();

        String lnameSecondPerson = secondPersonLowerCase.substring(secondPerson.indexOf(" "));

        if (lnameFirstPerson.equals(lnameSecondPerson)){
            System.out.println(firstPerson + " and " + secondPerson + " are related");
        }
        else {
            System.out.println(firstPerson + " and " + secondPerson + " are NOT related");
        }




    }
}
