package adamofficehours.day8;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumberToSum {
    /*
     Task 3 : String numbers to sum
					Given an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList.
					Ex:
					Input:
					“123”, “34”, “513”
					Output:
					[ 6, 7, 9 ]
     */
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("123", "34", "513", "9999"));
        System.out.println(StringNumberToSum(list));


    }



    public static ArrayList <Integer> StringNumberToSum (ArrayList<String> list){
        ArrayList<Integer> newArrayList = new ArrayList <>(list.size());

        for(String eachElement : list){
            int sum = 0;
            for(int i = 0; i < eachElement.length(); i++){
                sum += Integer.parseInt(""+eachElement.charAt(i));
            }
            newArrayList.add(sum);
        }


        return newArrayList;

    }

}
