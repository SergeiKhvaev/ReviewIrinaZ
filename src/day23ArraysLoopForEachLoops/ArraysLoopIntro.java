package day23ArraysLoopForEachLoops;

import java.util.Arrays;

public class ArraysLoopIntro {
    public static void main(String[] args) {


        int[] nums ={1, 2, 3, 4, 5}; // ����� ��� ������������ �������, ����� ��� ����������� ����� Arrays.toString � ����������� ���� ������, ����� ������ ����������� ����� ����

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]); // ����������� � ������

        System.out.println("---------------------------------------------------------");
        System.out.println(Arrays.toString(nums)); // ������������ Arrays.toString, �� � ���� ������ ��� ������������ String ������ � � ���� ������� ���� ��� ����� �������, ������� ������������ �����
        System.out.println("---------------------------------------------------------");

for(int i = 0; i < nums.length; i++){ //����������� ��������� ���� for
    System.out.println(nums[i]);
}
        System.out.println("---------------------------------------------------------");
        //��� ���� ������ ����������� �����

       String arrayAsString = "Array -  ";
       for (int i = 0; i < nums.length; i++){
            arrayAsString += nums[i]+ " | ";

        }
        arrayAsString += " - END";
        System.out.println(arrayAsString);







    }
}
