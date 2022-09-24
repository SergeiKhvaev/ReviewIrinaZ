package day26MultiDemenArray;

import java.util.Arrays;

public class groupCreation {
    public static void main(String[] args) {

// ������� �������� �������� ��������������� ��������

        char[] upper = {'R', 'j', 'A',};
        char[] lower = {'p' , 'z', 'q', 'd'};
        char[] other = {'4', '*', '#', '$', '@'};

        char[][] chars = new char[3][];// {upper, lower, other} - ����� ������� � ���. [] � 2 ��� �� ����� ������� ������ ��������
        chars[0] = upper; // ��������� ������� � ������ ������ ������ ������ ������
        chars[1] = lower;// ��������� ������� �� ������ ������ ������ ������ ������
        chars[2] = other;// ��������� ������� � ������� ������ ������ ������ ������
        System.out.println(Arrays.toString(chars[0]));// ����������� ������ ������� ��������
        System.out.println(Arrays.toString(chars[1]));// ����������� ������ ������� ��������
        System.out.println(Arrays.toString(chars[2]));// ����������� ������ ������� ��������

        System.out.println(Arrays.deepToString(chars)); // ���� ����� ������������ ��� ���������� ����������������� �������

        System.out.println("====================================================");
        //

        String [][] cydeo = {
                {"Alen", "tina", "Alina", "NArgiza"},
                {"Sergei", "Ekaterina", "Eva", "Adam"},
                {"Etel", "Anatoliy", "Lubava"},
                {"Kety", "Olia", "Zarub", "Coba", "Toto"}

                 };

        System.out.println(cydeo.length);// ������ ������������� ������� -4, �.�. 4 ��������(4 ������� �������) ������
        System.out.println(cydeo[2].length); // ������ ������� ������� - 3
        System.out.println(cydeo[0][3]); // ������ ������� ������� ������� 3 ������ - NArgiza
        System.out.println(Arrays.toString(cydeo[1])); // �������� ������ ��� �������� 1 - {"Sergei", "Ekaterina", "Eva", "Adam"},
        System.out.println(Arrays.deepToString(cydeo)); // ������������� �������������� ������ ���������


        // how to loop through each inner array

        for(String [] eachInner : cydeo){
            System.out.println(Arrays.toString(eachInner));

        }
            System.out.println("===========================");
            // how to loop through each name each array

            for(String[] eachInner : cydeo){
                for(String eachName : eachInner){
                    System.out.println(eachName);

                }

            }

        System.out.println("===========================");
        // how to loop through each name each array and print last letter in upper case

        for(String[] eachInner : cydeo){
            for(String eachName : eachInner){
                System.out.println(eachName.substring(eachName.length()-1).toUpperCase());

            }

        }

    }
}
