package day14string;

import java.util.Scanner;
public class StringMEthodsSelf2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any words");

        String words = input.nextLine();
        System.out.println(words);

        words.trim();
        System.out.println(words.trim());

        System.out.println(words.toLowerCase());
        System.out.println(words.length());

        System.out.println("---------------------------------------------------");

        String item = "Sergei";

        String item2 = "Segrei";

        System.out.println(item == item2);


    }
}
