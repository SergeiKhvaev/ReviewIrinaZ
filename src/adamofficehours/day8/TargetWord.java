package adamofficehours.day8;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    /*
    Task 4 : Target Words
					Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList
					Ex:
					Input:
						”java”, ”html”, “css”, “java”, “javascript”, “selenium”
						Target: java
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));

        System.out.println(targetWord(list, "selenium"));

    }

    public static int targetWord (ArrayList<String> list, String word){
        int countOfTarget = 0;
        for(String eachElement : list){
            if (eachElement.equalsIgnoreCase(word)) {

                countOfTarget ++;
            }
        }
        return countOfTarget;
    }
    // anothet approche



}
