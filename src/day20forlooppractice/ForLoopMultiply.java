package day20forlooppractice;

public class ForLoopMultiply {
    public static void main(String[] args) {

        // ������ ������ � �����, ����� ��������� ��������� ������ � ������ �������� ����� ���

        String s = "Hello";
        int end = 8;

        for(int i = 0; i < end; i ++) {
            s = s + s.charAt(s.length() -1); //��������� � ������������ ������ ��������� ����� �������� ���������� ���

        }
        System.out.println(s);


    }
}
