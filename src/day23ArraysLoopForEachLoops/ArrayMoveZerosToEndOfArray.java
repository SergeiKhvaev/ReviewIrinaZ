package day23ArraysLoopForEachLoops;

import java.util.Arrays;

public class ArrayMoveZerosToEndOfArray {
    public static void main(String[] args) {

        // ����������� ��� ���� � ����� �������

        int [] numbers = {1, 2, 0, 5, 0, 6, 0};

        int [] newArray = new int[numbers.length];// ������� ����� ������ �������� = ������� ������� �������
        int newArrayIndexOf = 0; // ������� ��� ����������� �������� ������� �������

        for(int i = 0 ; i < numbers.length; i++){
            if(numbers[i] > 0){// ���������, ���� ����� ��� ������� ������� ������� ������ ����, ���� ��, �� ���� ����� �������� � ����� ������
                newArray [newArrayIndexOf++] = numbers[i];// �������� ����������� ����� � ����� ������, ++ ���� ����������� ������� ������ ������� ������������� �� 1  � ������ ���������


            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}
