package day33CollectionsMethodsLimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSum {
    /*
    String Sum
Create a method that will accept an ArrayList of numbers in
String format, add each digit of each element and store
into a different ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
�123�, �34�, �513�
Output:
[ 6, 7, 9 ]
     */
    public static void main(String[] args) {
        ArrayList <String> strNum = new ArrayList<>(Arrays.asList("123", "345", "556", "14453", "9999923", "3344353")); // 6, 12, 16, 17, 50, 25
        System.out.println(stringSum(strNum));

    }
    public static ArrayList<Integer> stringSum(ArrayList<String> str) {
        ArrayList<Integer> nums = new ArrayList<>();

        for (String eachElement : str) {
            int sum = 0;
            for (String eachDigit: eachElement.split("")) { // ������ ����� ���������� �� ������ � ������ ������� ����� ��������� ������(char)
               sum += Integer.parseInt(eachDigit);

            }
            nums.add(sum);
        }
return nums;
    }


}

