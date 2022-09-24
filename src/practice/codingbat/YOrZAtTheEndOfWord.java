package practice.codingbat;

import java.util.Scanner;

public class YOrZAtTheEndOfWord {
    /*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


countYZ("fez day") ? 2
countYZ("day fez") ? 2
countYZ("day fyyyz") ? 2


     */


    public static void main(String[] args) {

      //  System.out.println(countYZ1(str));
Scanner input = new Scanner (System.in);
String str = input.nextLine();
       // System.out.println(!Character.isLetter(str.charAt(1)));

        System.out.println(str.charAt(str.length() - 1) == 'y');

    }



    public static int countYZ(String str) {
        String newStr = str.toLowerCase();
        String [] arr = newStr.split(" ");
        int count = 0;
        for (String eachElement : arr){
            if(eachElement.charAt(eachElement.length() -1) =='y' || eachElement.charAt(eachElement.length() - 1) == 'z'){
                count ++;
            }
        }
        return count;
    }

    public static int countYZ1(String str) {
        //String newStr = str.toLowerCase();
        // String [] arr = newStr.split(" ");
        int count = 0;
        for (int i = 0 ; i < str.length() -1; i++){
            if(str.charAt(i) == 'y' && str.charAt(i+1) == ' ' ||
                    str.charAt(i) == 'z' && str.charAt(i+1) == ' ' ||
                   // str.charAt(str.length() - 1) =='y'||
                    //str.charAt(str.length() - 1) == 'z' ||
                    str.charAt(i) == 'y' &&  !Character.isLetter(str.charAt(i+1)) ||
                    str.charAt(i) == 'z' &&  !Character.isLetter(str.charAt(i+1)))
                count ++;

        }
        return count;


    }



}
