package day7Practice;

import java.util.Scanner; //// ������������� ����� ������� � ��� �����, ������ ���� � ����� ������

public class Scanner6 {
    public static void main(String[] args){

        Scanner natureOfNumber1 = new Scanner(System.in); // �������� ���������� ������, ���� �� ���, System.in �������� java � �����������, ��� ��� ���� ����������� ����������������� �����

System.out.println("Enter any number, please: ");
Float num1 = natureOfNumber1.nextFloat(); // �������� ����������, ���� �� ���, ��� �� ��������� ����������� ����������� ��� �������������, �������� ����� ��������, ������������� ������ ��������� ������ ������ ���������

        if (num1 % 2 == 0){
            System.out.println("Entered number is Even.");}
        else if(num1 % 3 ==0){
            System.out.println("Entered number is divisible on 3.");}
        else if (num1 % 5 ==0){
            System.out.println("Entered number is divisible on 5.");}
        else {
                System.out.println("Entered number is decimal.");}







    }
}
