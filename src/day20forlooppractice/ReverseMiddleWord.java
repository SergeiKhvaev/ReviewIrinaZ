package day20forlooppractice;

import java.sql.SQLOutput;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        // �������� ����� love ��������;
        // ��������� 1) ����� ��������� ����� substring ���������� ����� 2) ������� ������, �.�. � ������ ����� ����� ������ �������, ���������� ����� charAt(), ��� �� ����� ��������������� ������ ������ 3) �������� ������� � ����������� 3) �.�. � ������ ������ ������� ������, ������� ������ string

        String str = "I Sergei java";
        String reverse ="";
        String substr = str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" ")).toLowerCase(); // �������� ��������� �����, ������� ����� �����������, ������ + 1, �.�. �� �� �����, ��� �� ��������� ���������� � �������.

       for (int i = substr.length() -1; i >= 0 ; i-- ){// ������ ��������� reversly. ��� ��������� ����� ����� �� ����� i ������ �������� � ����� - ���������� �������� � ������, ������� ����������� by 1 � ������ ������. ������ - 1, �.�. ������ ������ ������ �� ���� ��� ���������� �������� � ���, � ��������� ������ ��������� ���, ��� �� ������ ����� charAt(i)����� out of bounce exeption, �.�. ����� ����� ������ ������ ���� �������������� ��������

          reverse = reverse +  substr.charAt(i);}


        System.out.println(substr);
        System.out.println(reverse);

        System.out.println(str.substring(0, str.indexOf(" ")) + " " + reverse + str.substring(str.lastIndexOf(" "))); // ������� ����� ����������� �� ���� �����������, ��� ���� ������ � ��������� ��������� ������� �������, ����� ������������� �������� indexOf(" ") b lastIndexOf(" ") ���������������, � ���������� ����� ����� �� ����� - ��� ��� reverse, ������� �� ������� �������



    }


}
