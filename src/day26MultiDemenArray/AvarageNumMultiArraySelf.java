package day26MultiDemenArray;

import java.util.Arrays;

public class AvarageNumMultiArraySelf {
    public static void main(String[] args) {
        //����� ��������� ������� ����� � ������ ���������� �������
        // ����� ��������� ������� ����� ��� ��������������� �������


        int[] [] multiArr = {
                {1,3,5,6}, // 3,75
                {4,6,4,5,6,8,1},// 4.85
                {4,3,4,6,7},// 4.8
                {1,7}//4
        };

        int totalSum = 0;
        int numsInWholeArr = 0;

        for (int [] innerArr: multiArr){// ���� ���� ����� ����������� ���������� �������
            int sum = 0;
            for(int innerNums : innerArr){ // ���� ���� ����� ������� �������� � ������ ���������� �������
                sum+=innerNums; // ��������� �������� � ������ ���������� �������

            }
            System.out.println(Arrays.toString(innerArr));
            System.out.println("Avarage num for every array - " + (double)sum / innerArr.length);
            totalSum+= sum;
            numsInWholeArr += innerArr.length;
             }

        System.out.println("Avarage for multydemension array is " + (double) totalSum / numsInWholeArr);

    }

}
