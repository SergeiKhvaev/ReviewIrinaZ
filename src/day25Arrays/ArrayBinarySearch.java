package day25Arrays;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {

        int[] arr = {6,23,10,40, 240}; // ������ ������ ��� � ���������� ������������� ����, � ��������� ������ ����� �����������

        System.out.println(Arrays.binarySearch(arr, 240));
        System.out.println(Arrays.binarySearch(arr, 2000)); // ���� ���� �� ������������ �������, ����� ������������� �����

        System.out.println("================================================================");

        int[] b = {6,3,7,2,9,-14};
                 //0 1 2
        System.out.println(Arrays.binarySearch(b,3));// �� ������ , �.�. �� ��������������� ������
        Arrays.sort(b); // ���������� ������
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.binarySearch(b,3));//������ ������ �����, �.�. ������ ������������
        System.out.println(Arrays.binarySearch(b,-14));
        System.out.println(Arrays.binarySearch(b,5)); // ���� ���� �� ������������ �������, ������ ������������� �����

        System.out.println("========================================");

        String [] words ={"hello", "world", "zebra", "water"};
        Arrays.sort(words); // ����������
        System.out.println(Arrays.toString(words));

        System.out.println(Arrays.binarySearch(words, "world"));// ������ ������ ����� �������� � �������
        System.out.println(Arrays.binarySearch(words, "ass"));// ������ ������������� �����, ���� ���� �������������� � ������� �������


    }

}
