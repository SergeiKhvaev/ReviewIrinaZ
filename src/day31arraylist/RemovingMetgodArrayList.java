package day31arraylist;

import java.util.ArrayList;

public class RemovingMetgodArrayList {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);
        System.out.println("==============================");
        words.remove(2); // return element that we remove // �� ���� � �������� ��� ������� �
        // ���������� � ������ ������������ ���
       // System.out.println(words.remove(0));//������� ��� ����� ������� � ���� ������
        System.out.println(words);
        System.out.println("==============================");
        System.out.println(words.remove(0));//������� ��� ����� ������� � ���� ������
        System.out.println(words);


        System.out.println("-------------------------");
        words.clear();// emptyes the whole arraylist
        System.out.println(words);
        System.out.println("-------------------------");

        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);

        words.remove("today");// return boolean, will be true if removed succsess, false - if not
        System.out.println(words);
        System.out.println(words.remove("cow"));
        System.out.println(words.remove("java"));

        System.out.println("===================================");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(5);
        nums.add(0);
        nums.add(2);
        nums.add(4);
        System.out.println(nums);
nums.remove(0);// 4
        System.out.println(nums);

        // how i remove 0 ��� �������?
        Integer a= 0;
        nums.remove(a); // a as Integer, so I remove by element, the element it  removes 0
        System.out.println(nums);
        nums.remove((Integer) 2);// casting to Integer type and i can remove element not the index 2 (�.�. ����� ���������� ��� ��� ������� � ����� � �� ������, ��� ����� ����� ������� ������� ���� ��� ������� INTEGER, �.�. ArrayList ����� ������� ������ �������(��� �������� ����) ��� int - ��� UNTEGER
        System.out.println();
    }
}
