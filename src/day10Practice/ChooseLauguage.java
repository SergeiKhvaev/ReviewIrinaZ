package day10Practice;

import java.util.Scanner;
public class ChooseLauguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to define your language");
        int language = input.nextInt();

        if(language == 1) {
            System.out.println("Hello, thanks for your call");
        }
        else if (language == 2) {
            System.out.println("Spanish hola");
        }
        else if(language == 3) {
            System.out.println("Turkish merhaba");
        }
        else if(language == 4) {
            System.out.println("Русский, здравствуйте");
        }
        else if(language == 5) {
            System.out.println("French, merci");
        }
        else {
            System.out.println("hello. thanks for your call");}


        }

    }


