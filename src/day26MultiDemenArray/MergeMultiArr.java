package day26MultiDemenArray;

import java.util.Arrays;

public class MergeMultiArr {
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
                {10, 20, 30}, {5, 10, 99, 15}
        };

        int [] singleArr = new int[7]; // ������������ ������ ������ �������� ������ ������� ������� ��������������� �������
int singleArrIndex =0; // ������� ������� ��� ����� �������� ��������� ������ ����� �������
        for(int innArr[] : nums){ // ���� ���� ������ ������ ������ ������ ��������������� �������
            for(int eachNumber : innArr){ // ���� ���� ������������ ������ ������� � ������� ����������� �������
                singleArr[singleArrIndex] = eachNumber;// �������� ������ ������� ����������� ������� � ����� ������
                singleArrIndex++;// ���������� +1, ��� �� ��� ��������� �������� � ����� ������� ��������� ������ ���������� ������� ��������, ���� ����� �������� ��������� ������� �� ��������������� �������

                }

        }
        System.out.println(Arrays.toString(singleArr));

        System.out.println("============================================");
// ������� ������ �������


        int [][] numbers = {
                {10, 20, 30}, {5, 10, 15}
        };

int counter =0;
    int [] singleArray = new int[numbers[0].length + numbers[1].length];
    for(int eachInnerArray[] : numbers){
                for(int i = 0; i < eachInnerArray.length; i++){
            singleArray[counter] = eachInnerArray[i];//
                    counter++;

        }


    }
        System.out.println(Arrays.toString(singleArray));


    }
}
