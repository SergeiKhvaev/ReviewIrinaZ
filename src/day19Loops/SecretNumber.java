package day19Loops;


import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {
        // ���������� ��������� ������� ���� ����������� ���������� ����� ������. ������������ ������������ � ������ � �������� �����. �� ���������� ������������ ���� �� ����������. ���������: ����� ������; ����� ������

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

        } while (secretNumber != inputNum); // Loop ����������� ���� ��������� ����� �� ����� 87. ��� ������ ��������� ����� == 87 ����������� ����� ��������� "You Guessed the number"
        System.out.println("You guessed the number");


    }
    }
