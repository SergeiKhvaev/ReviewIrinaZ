package day32arraylistpractice;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequancyMethod {
    public static void main(String[] args) {
        ArrayList<Character> letter = new ArrayList<>(Arrays.asList('a', 'b' ,'c', 'e', 'i'));
      System.out.println(Collections.frequency(letter, 'e'));

        String s = "asdasdasddaadsadsadfklj"; // ��� �� ������������ collection util class methods ��� ����� arrayList
        ArrayList <String> list = new ArrayList<>(Arrays.asList(s.split("")));// �������� ������ � ����,��� ������� ������
        System.out.println(list);
        System.out.println(Collections.frequency(list, "a"));// "a" ������ ��� ������ ��� ����� String
        System.out.println(Collections.frequency(list, "k"));
        System.out.println(Collections.frequency(list, "i"));





    }

}
