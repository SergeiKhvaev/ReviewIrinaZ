package day10Practice;

public class biggerNumber {
    public static void main(String[] args) {

        int n = 99;
        int n2 = 7;
        int n3 = 5;
        int biggest = 0; // �� ���������� ������ ����������, ��� �� � ������� �� ��������������� � ������������ � ����������
        if (n > n2 && n > n3) {
            //System.out.println(n + " is biggest number");
            biggest = n; // ������������ ��� ����������, ���� ��� ��������� ���������� ��������
        } else if (n2 > n && n2 > n3) {

            // System.out.println(n2 + "is biggest number");
            biggest = n2; // ������������ ��� ����������, ���� ��� ��������� ���������� ��������
        } else {
            //  System.out.println(n3 + " is biggest number");}
            biggest = n3; // ������������ ��� ����������, ���� ��� ��������� ���������� ��������

        }

        System.out.println(biggest + " is the biggest number");


    }
}