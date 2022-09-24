package day19Loops;


import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {
        // определить программу которая даст возможность догадаться какое числою. Пользователь догадывается о номере и получает ответ. Он продолжает догадываться пока не догадается. подсказки: число больше; число меньше

        int secretNumber = 87;
        int inputNum;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Guess a number");
            inputNum = input.nextInt();
            if (inputNum < secretNumber) {
                System.out.println("Secret number is higher");
            } else if (inputNum > secretNumber) {
                System.out.println("Secret number is lower");
            }

        } while (secretNumber != inputNum); // Loop выполняется пока введенное число не равно 87. как только введенное число == 87 срабатывает принт стайтмент "You Guessed the number"
        System.out.println("You guessed the number");


    }
    }
