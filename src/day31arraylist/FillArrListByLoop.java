package day31arraylist;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;

public class FillArrListByLoop {
    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>();

        for (char i = 'a'; i < 'z'; i++) {// autoboxing
            letters.add(i);
        }
        System.out.println(letters); // created Arraylist with all letters


}


    }
