package day20forlooppractice;

import java.util.Scanner;

public class WhileToFor {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = input.nextLine();


        for(int i = 0 ; i < word.length() ; i++){
            char letter = word.charAt(i);
            System.out.println(letter);

        }

    }

}
