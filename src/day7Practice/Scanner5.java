package day7Practice;

import java.util.Scanner; // �� ������������� ����� �������, ������� ������� ������� � ���������� ������

public class Scanner5 {

    public static void main(String[] args){

        Scanner natureOfNumber = new Scanner(System.in); // �� �������� ���������� ������� � ���� �� ���(natureOfNumber), ��� ���������� ������ �������, ��������� ��������, ��� ��������� ���� ������ �������������

        System.out.println("Enter any number, please:"); // �� ���������� ����� ��������� ����� ���������� � ������� ����� ������ ������������� ������

        double num1 = natureOfNumber.nextFloat(); // �� ���������� ����� ������� � ����������, ��� �� ��������� ����������� ���������� ������������� ����������, � ������� ����� ����� ������ ���� ������� �����

        boolean divisibleOn2 = num1 % 2 == 0;
        boolean divisibleOn3 = num1 % 3 == 0;
        boolean divisibleOn5 = num1 % 5 == 0;
        System.out.println("This number is even; " + divisibleOn2 + "\n" + "This number is divisble on 3: " + divisibleOn3 + "\n" +
                "This number is divisible on 5: " + divisibleOn5);


        // �������� ����� ������� ������� ��� ������������� ���������� if....else



    }


}
