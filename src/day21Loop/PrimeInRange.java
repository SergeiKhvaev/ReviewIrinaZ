package day21Loop;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        // ���������� ��� ����� ����� �� ������������� �����
        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to go");
        int range = input.nextInt();

        for(int i = 2 ; i <= range; i++) {// ��������� �����
            boolean isPrime = true; // ������ ���

            for(int j = 2 ; j < i ; j++){ // � ������ ������� ����� ��������� ������� ����� �� ����� � ����� �� ����� ������� ���� -1
                if(i % j == 0){ // ��������� I ������� �� �� 2 �� i �������� ����� ��� ���
                    isPrime = false;
                    break; // ������������� ���������� ����
                }
            }
            if (isPrime){
                System.out.println(i);
            }


        }


    }
}
