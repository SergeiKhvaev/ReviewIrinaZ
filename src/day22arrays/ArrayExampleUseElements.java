package day22arrays;

import java.util.Arrays;

public class ArrayExampleUseElements {
    public static void main(String[] args) {

        int[] nums = {4, 6, 15};
        System.out.println(nums.length); // difine how many elements in array
        System.out.println(Arrays.toString(nums)); // ������������ ����������� ����� ��� ������ ����� �������
        System.out.println(nums[0] + nums[1]); // ����� ������������ ������ ��� �������� � ��� ����������

        String [] strs = {"Hello", "World", "java", "code"};
        System.out.println(strs.length); // 4
        System.out.println((strs[2])); // java
        System.out.println((strs[2] + strs[0]));//javaHello
        System.out.println(strs[0].length()); // length string at 0 index of array -> 5
        System.out.println(strs[1].charAt(strs[1].length()-1)); //d

        String s = strs[2];// reassign word from array to new string s
        System.out.println(s);






    }
}
