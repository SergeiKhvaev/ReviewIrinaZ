package day33CollectionsMethodsLimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AllPAlindroms {
    /*
    All Palindrome
Create a method that will accept an ArrayList of Strings and return
an ArrayList of Palindrome Strings
Ignore case sensitivity
Ex:
Input:
     "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output:
    Anna, Racecar, Level, Eye
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(allPalindrom(list));
    }

    public static ArrayList<String> allPalindrom  (ArrayList <String> words){
        ArrayList <String> palindroms = new ArrayList<>();
        for(String eachElement : words){
            String reverse = "";
            for(int i = eachElement.length()-1; i >= 0; i--){
                reverse += eachElement.charAt(i);
            }
            if(eachElement.equalsIgnoreCase(reverse)){
                palindroms.add(eachElement);
            }
        }

        return palindroms;

    }
}
