package day25Arrays;

import java.util.Arrays;

public class ArraySumAndAdd {
    public static void main(String[] args) {

        //���� ������ �������� ��� ��������  � ���������� ��� � �����

        // int[] a = {1,2,5}
        // int [] b = {1,2,5,8}


        int[] arr = {1, 2, 5, 99};
        int sum = 0;

        for(int each : arr){
            sum+= each;
        }
        int[] newArr = Arrays.copyOf(arr, arr.length+1);// ������� ����� ������������� �������
        System.out.println(Arrays.toString(newArr));// ������� ��� �� ����������, �������������� ��������� ������� ������, ����������� - 0
        newArr[newArr.length-1] = sum; // �������� sum � ��������� ������ ������ �������
        System.out.println(Arrays.toString(newArr));// ������� ��� �� ����������






    }
}
