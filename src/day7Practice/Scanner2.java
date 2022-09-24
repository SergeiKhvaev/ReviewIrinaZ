package day7Practice;

import java.util.Scanner;
public class Scanner2 {

    public static void main(String[] args){
        Scanner priceAndItem = new Scanner(System.in);


        System.out.println("What price per item: ");

       double pricePerItem = priceAndItem.nextDouble();

        System.out.println("How mani items");

        int quantatyOfItems = priceAndItem.nextInt();

        Double totalAmount = pricePerItem * quantatyOfItems;

        System.out.println("Total amount is: " +totalAmount);











    }


}
