package day16_string_practice;
import java.util.Scanner;

public class dynamicIndexOf {
    public static void main(String[] args) {
        // find oll the indexes  'i'
        String str = "definition";

        System.out.println("First I : " + str.indexOf('i'));
        System.out.println("List I : " + str.lastIndexOf('i'));


        System.out.println("other use of indexof");


        System.out.println("First I : " + str.indexOf('i'));
        System.out.println("Second i: " + str.indexOf('i', 4)); // ������ ������ � index ��� ������� 4
        System.out.println("Second i: " + str.indexOf('i', 6)); // ������ ������ � index ��� ������� 6

        System.out.println(" ����������� ������==========================================");
        // '���� ��� ����� ����������, �.�. �� ����� ����������, �����, ���� �� ������ ������������ ������� ���� ��� ����� ������ ������� ������������� ����, ������� ��� �� ���� ��������� I


        int firstI = str.indexOf('i');
        int secondI = str.indexOf('i', firstI + 1); // �� ����� ���������� ����� � �������� +1 ��� �� ������ ��������� i
        int thirdI = str.indexOf('i', secondI + 1);// �� ����� ���������� ����� � �������� +1 ��� �� ������ ��������� i
    }
}
