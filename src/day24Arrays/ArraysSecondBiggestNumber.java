package day24Arrays;

import java.util.Arrays;

public class ArraysSecondBiggestNumber {

    public static void main(String[] args) {

        /*

        [IQ] Second Biggest Number

Given an Array of numbers. Find and print the 2nd biggest number.
Note the 2nd biggest should be unique meaning it should be different from the max number
Example:
	Input:
		[4,3,1,4,5,2,4,8,4,8]
	Output:
		5
         */

        int[] numbers = {5,3,1,4,9};
       Arrays.sort(numbers);// ������������� �� ������ � ��������
        int firstBiggest = numbers[numbers.length-1];// ������� � ��������� ������� ���������������� ������� �������� ����� ������� � �������
int secondBiggest = 0;
        // System.out.println(Arrays.toString(numbers));
for(int i =  numbers.length-1; i >0 ; i--){ // �������� ���������� � ����� �������, ��� ���� ������� ��� ��������� �������� ���������������� ������� ������������� �������� ����� �������
if(numbers[i] < firstBiggest){// ��� ������ ��������� ������� ������� �������� ������� �� ��������� � ��������� ���������, ���� ������� � ���������������
    System.out.println(numbers[i]);
    break;// ��������� �����������, �.�. ��� ������������� ���������� ������ ����, � ��������� ������, ������������� ���� ������ � ������� � �������������� �������� � ���������� ��������� ��� �������� 0
}

}




    }
}
