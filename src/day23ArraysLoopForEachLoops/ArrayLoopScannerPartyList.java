package day23ArraysLoopForEachLoops;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoopScannerPartyList {
    public static void main(String[] args) {
        // ����� ������� ��� ����� ��� ���������

        Scanner input = new Scanner(System.in);
        System.out.println("How many people will come");
        int size = input.nextInt();

        String[] names = new String[size]; // new String[input.nextInt()]
        System.out.println(Arrays.toString(names)); // ������ ������� ��� �� ����� ���������� ������ ������� ����� �������

        for(int i = 0; i < names.length; i++){// ���������� ��� � ���������� ��� ��� � ������ ��� ���������, ������ ������ i =1, �.�. ����� �������� �������� �������� � �������� index �������
            System.out.println("Enter the name of person " + (i + 1));// I+1 �������, ��� �� � ��������� ��������� �� ����� ������� - 0, � 1 , �.�. ����� ������� �����
            String guest = input.next();
            names[i] = guest; // names[i] = input.next() - ���� ������� ����

        }
        System.out.println(Arrays.toString(names));






    }
}
