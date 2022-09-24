package day8;

import java.util.Scanner;

public class scanner13 {

    public static void main(String[] args){

        Scanner  keyboard = new Scanner(System.in);
        System.out.println("Item name");

        String name = keyboard.nextLine();

        System.out.println("Item price: ");
        float price = keyboard.nextFloat();

        System.out.println("Quantaty: ");

        int quantaty = keyboard.nextInt();

        float sum = quantaty * price;
        System.out.println("Report about items: " + "\n" + name + "\n" + price + "\n" + quantaty + "\n" + "total: " + sum);









    }


}
