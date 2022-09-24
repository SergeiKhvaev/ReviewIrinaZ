package day8;

import java.util.Scanner;

public class ScannerPersInfo {

    public static void main(String[] args){
        Scanner persInfo = new Scanner(System.in);


        System.out.println("First name: ");
        String firstName = persInfo.next();

        System.out.println("Last name: ");
        int lastName = persInfo.nextInt();

        persInfo.nextLine();

        System.out.println("Address");
        String address = persInfo.nextLine();

        System.out.println("Personal information: " + firstName + " " + lastName + " " + address);









    }
}
