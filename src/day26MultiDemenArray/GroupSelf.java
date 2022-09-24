package day26MultiDemenArray;

import java.util.Arrays;

public class GroupSelf {
    public static void main(String[] args) {

        String[][] classGroup = {
                {"Sergei", "Katy", "Eva"},
                {"Anatoliy", "Etel", "Lubava"},
                {"Oly", "Barnaba", "Pedro", "Huanitta"},
                {"Blyadina", "Ueba", "Ass"}

        };
        System.out.println(classGroup.length);// ������ ������������� - 4
        System.out.println(classGroup[1].length);  // ������ ������� ������� - 3
        System.out.println(classGroup[0][2]);// ������ ������� ������� ������� 2 ������ - Eva
        System.out.println(Arrays.toString(classGroup[1])); // �������� ������ ��� �������� 1 -  {"Anatoliy", "Etel", "Lubava"},
        System.out.println(Arrays.deepToString(classGroup)); // ������������� �������������� ������ ���������

        System.out.println("=====================================================");
        // how to loop through each inner array

        for (String innerArr[] : classGroup) { // �� �������� ��� ���������� ������ ������������� ������� �������� ����� �������, ������� ��������� �� ������ ��� �� � ������ ������� - innerArr[]
            System.out.println(Arrays.toString(innerArr));

        }

        System.out.println("=====================================================");
        // how to loop through each name each array

        for (String innerArr[] : classGroup) { // �� �������� ��� ���������� ������ ������������� ������� �������� ����� �������, ������� ��������� �� ������ ��� �� � ������ ������� - innerArr[]
            for (int i = 0; i <= innerArr.length - 1; i++)
                System.out.println(innerArr[i]);// i - ���������� ������� ���������� �������, ������� ����� ����������� � ������ ���������

            // ��� �� ����� ������������ each for loop inside each for loop


        }

        System.out.println("=====================================================");
        // how to loop through each name each array and print last letter in upper case

        for (String innerArr[] : classGroup) { // �� �������� ��� ���������� ������ ������������� ������� �������� ����� �������, ������� ��������� �� ������ ��� �� � ������ ������� - innerArr[]
            for (int i = 0; i <= innerArr.length - 1; i++) {
                System.out.println(innerArr[i]);
                System.out.println(innerArr[i].substring(innerArr[i].length() - 1).toUpperCase());

            }

        }
    }
}