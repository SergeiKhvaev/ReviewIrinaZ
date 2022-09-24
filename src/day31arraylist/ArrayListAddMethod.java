package day31arraylist;

import java.util.ArrayList;

public class ArrayListAddMethod {
    public static void main(String[] args) {


        ArrayList<Character> letters = new ArrayList<>(); // created an ampty ArrayList//but internal capacity by default 10 (capacity not affect anything)
        System.out.println(letters.size());// 0 -> empty
        letters.add('j');// converted to autoboxing
        letters.add('a');// converted to autoboxing
        letters.add('v');// converted to autoboxing
        letters.add('a');// converted to autoboxing// we can add as many element as we want and size will change automatically
        System.out.println(letters.size());// number of element ->4
        System.out.println(letters); // print whole arraylist


        // how read element from array: arrayName[index]

        // how read element from arraylist
        System.out.println(letters.get(0)); // arraylist has own method to read element from list by indexes
        System.out.println(letters.get(1));
        System.out.println(letters.get(2));
        System.out.println(letters.get(3));
        //System.out.println(letters.get(4));Index 4 out of bounds for length 4

        System.out.println("=================================================");
        System.out.println(letters);
        letters.add(0, '$');
        System.out.println(letters);
        letters.add(3, '8');
        System.out.println(letters);

    }
}
