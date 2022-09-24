package day32arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFindeFourLettersString {
    /*
Four or less
Given an ArrayList of Strings, go through and find
Strings that are 4 characters or less. Take those
Strings and put them into a different ArrayList. Print that ArrayList of words
Ex:
	Input:
		“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
	Output:
		 [ tree, loop, cat ]
     */
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "tree", "loop", "cat", "animal", "shortcut"));
        ArrayList<String> wordsWeNeeded = new ArrayList<>();
        for (String eachElement : words) {
                if (eachElement.length() <= 4) {
                    wordsWeNeeded.add(eachElement);
                }
            }

            System.out.println(wordsWeNeeded);
        }
    }
