package day16_string_practice;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter first name");
        String firstName = input.next();

        System.out.println("Enter last name");
        String lastName = input.next();

        String initials = " " + firstName.charAt(0) + lastName.charAt(0); // charAt ���������� char, ��� ���� ��� �� ��� ����� ���� ��������� � String �� ������ ����� �������� ������ ������, ����� ������������ char � ����� ���������� �������� String
        System.out.println(initials.toUpperCase());












    }
}
