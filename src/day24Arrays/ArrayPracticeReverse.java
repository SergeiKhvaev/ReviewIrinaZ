package day24Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeReverse {

    public static void main(String[] args) {
        // ������� ������, �������� �������� ������� ������� � �������� ������� (����� ������ ������)

        int[] arr = {1, 2, 3, 4, 5};
        int [] reverse = new int[arr.length];

        for(int i = arr.length-1, y = 0; i >= 0 ; i--, y++){ // y - ����� ��� ����, ��� �� ���������� � ������� ������ �������. i - ���������� ���������� ������� ������� �������// Y ���������� ����� ����� �������� ����� ������ int y = 0;
            reverse[y] = arr[i]; // �������� ������� ��������� ������� �������, �������� ������� � ����� �������


        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("===========================");

        Scanner input = new Scanner(System.in);
        String sentance = input.nextLine();
        String[] arr1 = sentance.split(" ");
        String [] reverseArr = new String[arr1.length];

        for(int i = arr1.length-1, y = 0; i >= 0 ; i--, y++){ // y - ����� ��� ����, ��� �� ���������� � ������� ������ �������. i - ���������� ���������� ������� ������� �������// Y ���������� ����� ����� �������� ����� ������ int y = 0;
            reverseArr[y] = arr1[i]; // �������� ������� ��������� ������� �������, �������� ������� � ����� �������


        }
        System.out.println(Arrays.toString(reverseArr));



    }
}
