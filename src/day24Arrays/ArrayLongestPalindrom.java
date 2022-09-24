package day24Arrays;

import java.util.Arrays;

public class ArrayLongestPalindrom {

    public static void main(String[] args) {
/*
[IQ] Longest Palindrome

	Given a String array. Find the longest Palindrome String in your array.

		Ex:
		Input:
			["java", "longer word", "civic", "apple", "racecar", "mom", "anna"]
		Output: racecar

		Ex:
		Input: ["abc", "dna", "kevin", "joe", "lamp"]
		Output: No palindrome

 */

        String str = "java, longer word, civic, apple, racecar, mom, anna";// ��������� � ������

        String[] strArray = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String longestPalidrom = "";// ������� ������ ������ � ������� �� ����� ������� ����� ������� �������� ����� ��������� ������� �������� �����, ��� ������ ����� ����������� � ���������� ����� �������� ���������

        for (String each : strArray) { //������� for each loop ��� �������
            String reverse = ""; // ������ �������� ����� ������� ������ ������, � ������� ����� ��������� ��������� ������ ������ ��������� ���� ���������� ������ � ������� ����� �������������� � ���� ��� ������ ������ ���������� �������� �����
            String palidrom = " "; // �������, ��� �� ������� ���������� ��������
            for (int i = each.length() - 1; i >= 0; i--) {// ���������� ����� ������� ����� ������� ������� ������� �������� �������
                reverse += each.charAt(i);// � ���� ������ ����� ��������� ������ ������� �������� ����� ���������� ����������� ��������� ����������� ����
            }

            if (each.equals(reverse)) {// if ���������, ����������� ������� ������� ������� ������ �������, ���� true, �� ������ ����� ������������ ����� ������� �������� �� ������ ��������
               // System.out.println(reverse);
               palidrom = reverse; // ����������� ���������� �������� � ��� ����������

            }

            if (longestPalidrom.length() < palidrom.length()) {// ��������� if ��������� ����������� ������ ���������� ����������
               longestPalidrom = palidrom; // ��� ��������, ������� �������� ����� ������� �� ��������� � ������, �������� ������� � ���������� longest
            }


        }

        System.out.println(longestPalidrom); // �������� ����� ������� �������� ����� ��������� ���� ������� ����

    }
}


