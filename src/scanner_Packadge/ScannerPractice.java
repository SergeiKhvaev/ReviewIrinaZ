package scanner_Packadge;

import java.util.Scanner;// �������� scanner class, ���������� ����������� �������� ������ ����� � �������, ��� java.util - ��� ����������� ����� java, � Scanner - ��� ����� Scanner

public class ScannerPractice {

    public static void main(String[] args){

        Scanner answers = new Scanner(System.in); // ������� �������, ������� ������� ����� ��������� ������ � ����� ��������, ��� answer - ��� ��� ����������, ����� ������� �� ����� ���������� � ����������� �������� � ��������� ����������� ������, (System.in) - ��� �������� input, ....... ������ scanner �������� � ����� ����������� � �� ����� ��������� ������ � �������������� ����� ������� � ��� �������


        // Ask the user to enter an integer number (������1)

        System.out.println("Enter an integer number"); // ���������� ���������, �.�. � ������� ��������� ������ �� �������� �������������� �������� (������ 1)

       int num1 = answers.nextInt(); // ��� answers - ��� �������� ���������, ����� ������� �� ���������� � �������, � .nextInt -��� �������� ������, ������� �� ���������� ���������, � ���� � ����, ��� �� ����� ���� �������� ������������ ����� ���, ��� ����� ��� �������� ��� ���������� int, �.�. int num1 =

        // Ask the user to enter a decimal number (������ 2)
        System.out.println("Enter a decimal number, please:");
    double num2 = answers.nextDouble(); // ���� � ���� ��� �� ������� ����� ���� �������� ������������ ����� ���, ������� ��� �������� ��� ���������� double, �.�. (double =)

        // Ask the user to enter a word (������ 3)
       System.out.println("Enter a word, please");
     String wordOne =  answers.next(); // ��� �� ������� ���� ������ reusible ����� ��� �������� ���������� String, �.�. (String =)

        answers.nextLine(); // ������ ������ ����������, ��� �� ������� Enter �� ������, ������������� ����� ����������� ���������� ���������� ������ nextLine()

        // Ask the user to enter full name
        System.out.println("Enter your full name, please: ");
       String fullName = answers.nextLine();

        // Ask user answer true or false (������ 4)
System.out.println("Is your eyes are blue: ");

boolean isGreenEyes = answers.nextBoolean();





        System.out.println("Number 1 = " + num1 + "\n" + "Number 2 = " + num2 + "\n" + "Name: " + wordOne+ "\n" + "Full name: " + fullName + "\n" + "Your eyes are green: " + isGreenEyes);





    }


}
