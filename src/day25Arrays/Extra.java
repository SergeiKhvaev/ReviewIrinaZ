package day25Arrays;

import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {
        String[] strs ={"Hello", "world", "monday", "java"};
        System.out.println(Arrays.toString(strs));
        System.out.println(String.join("#", strs));
        System.out.println(String.join(" ", strs));
        System.out.println(String.join(" MIDDLE ", strs));

        System.out.println("=============================");
        // ��� ���� ������ �������� ��������
        int [] aa = new int[] {1,2,5,3}; // ������� ������������ ����� �� ����� ������������ references of arr
        System.out.println(Arrays.toString(new int[] {1,2,5,3})); //  ����������� ��� reference to aa array
        System.out.println(Arrays.toString(aa)); // ������ �� �������� ������ �������� ��� ���(reference)


    }

}
