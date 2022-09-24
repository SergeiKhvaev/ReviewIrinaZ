package day25Arrays;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int[] nums = {1,2,3};
        int[] other = nums;
        // ����� ����� ���� ���� ������ � ��� references ����������� �� ���� ������

        nums[0] = 10; // ������ ������� � �������
        other[2] = 25;// ������ ������ �������, �� � ��� �� (������������) �������, ������ ���������� ������ reference
        System.out.println(Arrays.toString(nums));//
        System.out.println(Arrays.toString(other));

        System.out.println("-------------------------------------------");

        int[] numbers ={1,2,3,5,3,6,7,5,3,3,33};
        Arrays.sort(numbers); // ����� ����� �� �� ������� ����� ������, �� ��� ������ �������������
        System.out.println(Arrays.toString(numbers));


        System.out.println("-------------------------------------------");


int[] a = {5,10,18};
int [] b = Arrays.copyOf(a,3);// �� ������� ����� ������� a, �� ��� ����� ������
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("----------");

a[1] = 100;// �������� �������� � ������� �, �������������� ���� ������� � ����� b �� ���������, �.�. b ��� ������ ������� �, �� ���-���� b - ��� ������ ����� ������
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int [] v = {1,4,5};
        int[] d = Arrays.copyOf(v, v.length);



    }
}
