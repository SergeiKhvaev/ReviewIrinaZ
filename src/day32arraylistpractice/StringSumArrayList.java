package day32arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSumArrayList {
    public static void main(String[] args) {
        /*
String Sum

Create a method that will accept an ArrayList of numbers in
String format, add each digit of each element and store
into a different ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
         */
      ArrayList<String> numberCollection = new ArrayList<>(Arrays.asList("123", "34", "513"));

        System.out.println(sumOfElement(numberCollection));

    }
    public static ArrayList<Integer> sumOfElement (ArrayList<String> numberCollection) {
        ArrayList<Integer> sumOfNumbers = new ArrayList<>();
        for (String eachElement : numberCollection) {
            int eachSum = 0;
            for (int i = 0; i < eachElement.length(); i++) {
                eachSum += Integer.parseInt("" + eachElement.charAt(i));
            }
            sumOfNumbers.add(eachSum);
        }

        return sumOfNumbers;
    }
}
