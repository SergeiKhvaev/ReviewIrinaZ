package day32arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class VendingMachineArrListCreating {
    public static void main(String[] args) {
        /* old approach
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("water");
        drinks.add("Juice");
        drinks.add("Soda");
        drinks.add("Coffee");
        System.out.println(drinks);

         */
        Scanner input = new Scanner (System.in);


        ArrayList<String> drinks = new ArrayList<>(Arrays.asList("Soda", "juice", "Water", "Coffee"));

        System.out.println("Which drinc would you like");
        String selection = input.next().toLowerCase();

        if(drinks.contains(selection)){
            System.out.println(selection + " is vending");
        }else {
            System.out.println(selection + " is not in vending machine");
        }


    }
}
