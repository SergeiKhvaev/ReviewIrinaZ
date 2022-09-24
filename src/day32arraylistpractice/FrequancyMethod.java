package day32arraylistpractice;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequancyMethod {
    public static void main(String[] args) {
        ArrayList<Character> letter = new ArrayList<>(Arrays.asList('a', 'b' ,'c', 'e', 'i'));
      System.out.println(Collections.frequency(letter, 'e'));

        String s = "asdasdasddaadsadsadfklj"; // что бы использовать collection util class methods нам нужны arrayList
        ArrayList <String> list = new ArrayList<>(Arrays.asList(s.split("")));// положили массив в лист,где элемент символ
        System.out.println(list);
        System.out.println(Collections.frequency(list, "a"));// "a" потому что массив был ввиде String
        System.out.println(Collections.frequency(list, "k"));
        System.out.println(Collections.frequency(list, "i"));





    }

}
