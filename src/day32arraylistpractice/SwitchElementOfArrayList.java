package day32arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchElementOfArrayList {
    /*
Switch Pairs
Given an ArrayList of words switch position for
each pair in the List. A pair is an element and the element next to it.
The given ArrayList will always have an even number
of elements so each element will always have a single pair.
Ex:
Input: {"Cat", "in", "the", "hat"}
There is two pairs:
"Cat" and "in"
 "the" and "hat"
Output: {"in", "Cat", "hat", "the”}
     */
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Cat", "in", "the", "Sergei"));
ArrayList<String> swithedElements = new ArrayList<>();         // 0      1      2      3

for(int i = 0; i < words.size() ; i++) {
    if (i % 2 == 0) {
        swithedElements.add( words.get(i+1));
    } else {
        swithedElements.add(words.get(i-1));

    }


}
        System.out.println(swithedElements);



        }
    }

