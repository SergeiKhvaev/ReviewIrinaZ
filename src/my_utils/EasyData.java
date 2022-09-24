package my_utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EasyData {


    // ���������� arrayList ��� ������ ��� �������� �������������
    public static ArrayList<String> getDaysOfWeek() {
        // return ArrayList with all days of week
        return new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    }


    // ����� ���������� ArrayList � ������� ��������� ����� ��� �������������
    public static ArrayList<Integer> getRandomNumbers(int limit) { // ����� ������� �� ���������� ������� ��������� ����� ��� ����� � �������� ArrayList
        Random random = new Random(); // Research about this class, look documantation
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            list.add(random.nextInt(1000));// ��������� 1000, �.� ����� ��������� ����� ����� �� ������ 1000
        }
        return list;
    }
}