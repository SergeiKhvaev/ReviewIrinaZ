package day32arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLettersArrayList {
    public static void main(String[] args) {
        /*
        Count Letters
Create a method that will accept an ArrayList of Strings and a
letter (char) print how many times the letter is found in the ArrayList elements
Ex:
Input:
	”java”, ”html”, “css”, “java”, “javascript”, “selenium”
	letter: ‘a’
Output:
	6
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        System.out.println(countOfCharacter(list, 'j'));


    }
    public static int countOfCharacter (ArrayList<String> list, char letter){
        int count = 0;
        for(String eachElement : list){
            for(int i = 0; i < eachElement.length() ; i++){
                if(eachElement.charAt(i) == letter){
                    count++;
                }
            }
        }
        return count;
    }

}
