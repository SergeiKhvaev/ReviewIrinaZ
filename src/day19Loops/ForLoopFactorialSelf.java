package day19Loops;


import java.util.Scanner;

public class ForLoopFactorialSelf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");

        int factorialNumber = input.nextInt(); // ���� ����� �����
        int num = 1; // ��� �������� ��������������
        String result = "Factorial of number " + factorialNumber + " is "; // ��� ��������� ��������� ���������

        for (int i = factorialNumber; i > 1; i = i -1){ // ������������� ����� ���� ���������� int--> ������������ ���� ���������� �������� ���������� �����, ��� �� ���������� ������� �����, ����� ����������� ������� �� ����� ��� ����� ���� true, ����� ���������� ������� ���� �����, �.�. � ������ loop  -1 �� i
            num = num * i; // ���������� �������� ������� ����� ������������ � ������ �����, ��� ������� � ���, ��� num ����� ��������������� ��� ������ ����� ������������� �� ��������������� ��������� i

        }

        System.out.println(result + num);














    }
}
