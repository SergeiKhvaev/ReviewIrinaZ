package day24Arrays;

import java.util.Arrays;

public class ArrayPratiseSelf1 {
    public static void main(String[] args) {

        /*
    Given a String array:

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };

Find and print all the first and last characters
Find and print all the middle character
Print each country as a char array

     */
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"};

        for( String each : countries){
            System.out.println(each + " first and last letters are " + each.charAt(0) + " " + each.charAt(each.length()-1));
            }
        System.out.println("=========================================================");
        for (String each : countries){
            System.out.println(each + " middle letters are " + each.substring(1, each.length() -1));
        }

        System.out.println("=========================================================");

for(String each : countries){
    System.out.println(each.toCharArray());// char array internal
    System.out.println(Arrays.toString(each.toCharArray()));// печатает в виде строки
}

        System.out.println("==========TO UNDESTANDING=========");
// is that possible to use simple element in char Array, print it forexample or define its index

        String word = "java";
        char [] wordCharArray = word.toCharArray();
        System.out.println(wordCharArray[0]);
        System.out.println(wordCharArray[wordCharArray.length-1]);


    }
}