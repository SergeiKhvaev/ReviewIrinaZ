package day27ArraysMEthods;

import java.util.Arrays;

public class ArraysMethodsMergeArray {
    public static void main(String[] args) {

        /*
Given a 2D int array merge the elements into one 1D array
Ex:
       int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };
       Output:
              [ 10, 20, 30, 5, 10, 15 ]
         */

        int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };
        // we need to count total alements, so we need to loop arr

        int size = 0;

        for(int[] eachArr : nums){
          size +=  eachArr.length; //  ��� ������ �������� ������������ ������ ����������� ������� � ��� ������ ������������ � ������ ����� ����������, �.�. ���� ��������� ��� ��������, ���� ������� ���� ����������� ������ ���������� ��������� � nums  � ��� ����� ��������

        }

        int [] newArr = new int[size]; //[nums[0].length + nums[1].length] ->  works as well
        int indexOfNewArrCounter = 0;
        for(int [] eachInnerArr : nums){
            for(int eachNum : eachInnerArr){
                newArr[indexOfNewArrCounter] = eachNum;
                indexOfNewArrCounter++;
            }
        }
        System.out.println(Arrays.deepToString(nums));
        System.out.println(Arrays.toString(newArr));

    }
}
