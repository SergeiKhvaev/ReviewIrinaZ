package day24Arrays;

import java.util.Arrays;

public class ArrayReversSentanceStringMethod {
    public static void main(String[] args) {

        // reverse sentance
        String str = "Today is Friday. Have a good weekend!";

        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));// ������ ��� �� ������� ����������� ������
        String reverse = "";

        for(int i = words.length-1; i >= 0; i --){
           reverse += words[i] +" "; // " " - �������� ������, ��� ��� ��������� ��� ������

        }
        System.out.println(reverse.trim());


        System.out.println("-----------------------------------------------------------");



















    }






}
