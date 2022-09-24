package day15StringMethodsPractice;

import java.util.Scanner;

public class address {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter address you need");
        String address = input.nextLine().toLowerCase().trim();

        if(address.startsWith("500")){
            System.out.println(address.toUpperCase() + "\n" + "house on the right side of the street");
        } else if (address.startsWith("600")){
            System.out.println(address.toUpperCase() + "\n" + "house on the left side of the street");
        }

        if (address.endsWith ("drive")){
            System.out.println("house on drive");
        } else if(address.endsWith("lane")){
            System.out.println("house on lane");
        } else if(address.endsWith("ave")){
            System.out.println("house on avenue");
        }





    }


}
