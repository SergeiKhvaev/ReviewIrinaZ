package day17_strings_loops;

public class restOfMethods {

    public static void main(String[] args) {
        // isEmpty() method -��������� ���� �� � ������ �������. ���������� BOOLEAN, ������ ������, ���� � ��� ��� �� ����� ��������, ��� ����, ����, ����������� ��������, � ��� ����� ������ ��������
        String s = " ";
        System.out.println(s.isEmpty());

        // isBlank() - ��������� ���� �� � ������ �������, �� �������� ������ �������, �.�. ���� ���� ������, �� ��� ������ ��������, ������ ����� ��������� blank, ���������� boolean

        String a = "    ";
        System.out.println(a.isBlank());

        // replace("char" - ��� ����� ��������, "char" - �� ��� ����� ��������)  �������� ��� ����������� ������� � ������,���� �� ����� ��������, �� ����������� ����� ������� ����� ������, �.�. ������ ���������.���������� string

        String str = "java";



        System.out.println(str.replace('a', 'z'));

        str.replace(" ", " ");

String str3 = "an apple path";
        System.out.println(str3.replace("a", "(a)"));

        // common use case: delete spaces

        String str4 = "multiple words here";
        System.out.println(str4.replace(" ", ""));

        // ���� �������� ����� ������ replaceFirst() - �������� ������ ���������� ����������� ������ � ���������� ������.

        // ��� �������� ������ � ��������? ����� ��������� substring
        String d = "Wooden Spoon";
        int firstO = d.indexOf('o');
        int secondO = d.indexOf('0', firstO + 1);
        System.out.println(d.substring(0, secondO));
        System.out.println(d.substring(secondO). replaceFirst("o", "-"));
        System.out.println((d.substring(0, secondO)) + d.substring(secondO).replaceFirst("o", "-"));
        //FIX IT



    }
}
