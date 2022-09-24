package day29ReturnTypeMEthodPractice;

import jdk.jfr.Frequency;

public class FriquancyOfChar {

    /*
    Frequency of Character
    create a method that will accept a word(String) and a letter (char)
    and return how many times that given letter is found in the given word
    Ex:
    Input:
    	apple, p
     */


    public static int frequencyOfChar (String str, char letter){
        int count =0;
    //   str = str.toLowerCase();
        for(int i =0; i < str.length(); i++){
            if(str.charAt(i) == letter){
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChar("Starovoitova", 's'));
    }
}


