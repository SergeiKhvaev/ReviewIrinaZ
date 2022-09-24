package practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    /*
    delete duplicates from string
     */
    public static void main(String[] args) {
        String str = "aasddeellmnfgrrtssllrtd";

        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (!longest.contains("" + str.charAt(j))) {
                    longest += str.charAt(j);
                }
            }

        }
        System.out.println(longest);


        // find longest substring with not duplicated latters

        /*
        String getUniqueCharacterSubstringBruteForce(String input) {
    String output = "";
    for (int start = 0; start < input.length(); start++) {
        Set visited = new HashSet<>();????
        int end = start;
        for (; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.contains(currChar)) {
                break;
            } else {
                visited.add(currChar);
           }}
        if (output.length() < end - start + 1) {
            output = input.substring(start, end);
        }
    }
    return output;                */
        String a = "123388lkhgreasafcff9";
        String longest1 = "";
        String each = "";

        for (int i = 0; i < a.length() ; i++) { //1
            int j = i;
            for (; j < a.length(); j++) { //1
                char carrChar = a.charAt(j);//
                if (each.contains("" + carrChar)) {
                    break;
                } else {
                    each += carrChar;
                }
            }
            if (longest1.length() < j - i + 1) {
                longest1 = a.substring(i, j);
            }

        }
        System.out.println(longest1);

        System.out.println(isUniq("Sergai"));
    }

    public static boolean isUniq(String word) {
        boolean isUniq = true;
        String uniq = "";
        for (int i = 0; i < word.length()-1; i++) {
            uniq += word.charAt(i);
            if (uniq.contains("" + word.charAt(i+1))) {
                isUniq = false;
                break;
            }
        }
        return isUniq;


    }
}