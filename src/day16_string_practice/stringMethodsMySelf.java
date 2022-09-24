package day16_string_practice;

import java.util.Scanner;

//import java.util.Scanner;
public class stringMethodsMySelf {

    public static void main(String[] args) {


     Scanner input = new Scanner(System.in);

      System.out.println("Enter first word");
        String firstWord = input.nextLine();

        int lastIndex = firstWord.length();

       System.out.println("Enter second word");
       String secondWord = input.nextLine();



        System.out.println(firstWord.substring(1));
        System.out.println(secondWord.substring(0,lastIndex));

// Khvalev
// 0123456

        // как убрать последнюю букву в слове введенном через сканнет???







    }
}


