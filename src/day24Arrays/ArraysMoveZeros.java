package day24Arrays;

import java.util.Arrays;

public class ArraysMoveZeros {
    public static void main(String[] args) {
        //����������� ��� ���� � ����� �������

    int[] nums = {1, 0, 3, 0, 5, 6, 0, 9};
    int indexToRead = 0;// ������ �������� � ������ ������ � ������ �� �����

    int [] fixed = new int[nums.length]; // ������� ������ ������ � �������� ������ ������� ������� �������
    int indexToStore = 0; // ������������ ��� �������� ���������� � ����� �������, ����� ���� �� ����� ������������� � ������ ���������

        while(indexToRead < nums.length){
            if (nums[indexToRead] != 0){
                fixed[indexToStore++] = nums[indexToRead];
             //   indexToStore++; ������������ ����� ������� � �����
            }
            indexToRead++;
        }

        System.out.println(Arrays.toString(fixed));






    }
}
