package day33CollectionsMethodsLimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNumsLambdaIntro {
    public static void main(String[] args) {
        // remove all numbers less then 5

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,4,5,7,3,4,5,0,6,7,8,3,4,10,9));// �� ������ ������� ������� ������, ��� ���� ����� ����������� �� � ���� ����� +1 � ������ ���������, ��� ��������, ��� ������ �����, ��������� ������ ��������� ����� � ����� �������� ����, �.�. �������� ������� �� ����� ��������� (� �� �������� ������������ FOR EACH LOOP � ����� ������� ������ ������������ ����, ����� ����������� ������������ ����// ������������ �������� ����� � ���������� �� � ����� ���� ����� �������� ��� �������������� ������������� �� ���� i--
        for(int i = 0; i  < nums.size(); i++){
            if (nums.get(i) < 5){
    nums.remove(i);
    i--;// ��� �� ��������� ���� �������� ������������ ���� �������� � ���� ������, ����� �������� ������ ���  �������� �������� �� ����� ��������
            }
        }
        System.out.println(nums);

        System.out.println("==============SAME BUT WITH LAMBDA+++++++++++++++++++++");


        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1,4,5,7,3,4,5,0,6,7,8,3,4,10,9));// remove all the numbers are less 5 - using removeIf
        nums2.removeIf(n -> n < 5); // n will be every element. n - this is every element of ArrayList, -> lambda(arrow is part of sintax), so we remove numbers we need without loop, dont need to handle with skiping indexes which exist with looping,
        System.out.println(nums2);

    }

}
