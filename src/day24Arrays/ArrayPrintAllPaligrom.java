package day24Arrays;

import java.util.Arrays;

public class ArrayPrintAllPaligrom {
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

String str1 = "java, longer word, civic, apple, racecar, mom, anna";
String[] strArray1 = str1.split(",");
        System.out.println(Arrays.toString(strArray1));
        System.out.println("============================================");

String[] strArray =	{"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

for(String each : strArray){// ������� ������� for each loop
    String reverse = "";// ������� ������ ������ ��� ����������� ����/ � ������ ������� ������ ������ ����� ����������� �� ������ ������

    for(int i = each.length()-1; i >= 0 ; i--){// ���������� for loop, ������� ����� ����������� ������ ������� ������� ������� � ���������� �� ������� �������
       reverse += each.charAt(i);// �������� ����������� ������� ������� ����� ������� ��������� ���� ������ ����������� �����
    }
if (each.equals(reverse)){// ��������� if ��������� ������ �������� �����, ������� ��������� ���������� �� ������ ��������� ������� ��� �� ����������� ��������
    System.out.println((reverse)); // ���� ������� ��������� ������ ������������ ��������, �� �� ���������������
}

}
    }
}
