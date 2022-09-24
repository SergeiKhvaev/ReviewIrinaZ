package practice.codingbat;

public class RepeatDoubleTime {

    public static void main(String[] args) {
        /*
Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") ? "TThhee"
doubleChar("AAbb") ? "AAAAbbbb"
doubleChar("Hi-There") ? "HHii--TThheerree"


         */


        String str = "Hi-There";
        System.out.println(doubleChar1(str));



    }

    public static String doubleChar1(String str) {

        String doubleChar ="";
        for(int i = 0; i < str.length(); i++){
            doubleChar = doubleChar+ str.charAt(i)+str.charAt(i);
        }
        return doubleChar;
    }




    public static String doubleChar(String str) {

        String doubleChar ="";
        for(int i = 0; i < str.length(); i++){
            doubleChar += str.substring(i, i+1).repeat(2);
        }
        return doubleChar;
    }





}
