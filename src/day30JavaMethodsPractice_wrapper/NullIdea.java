package day30JavaMethodsPractice_wrapper;

public class NullIdea {
    public static void main(String[] args) {
        String [] a = {"hello", "World", "friday"};
        System.out.println(a[0]); // hello
        System.out.println(a[0].charAt(0));// h

        String [] b = new String[2]; // [null, null] - ������ ������, � ������ ������ ������, �� ������ ����
        System.out.println(b[0]); // null - ��������, ��� ��� ���� ��� ������ ��� -����
        System.out.println(b[0].charAt(0)); //Exception in thread "main" java.lang.NullPointerException, �.�. �������, ������� �� ���� ��� � ��� �����, ��� �� ����, charAt - ��� ������ �����, �� ��� ������ ��������� � ������� �����



    }
}
