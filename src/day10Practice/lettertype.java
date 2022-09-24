package day10Practice;

public class lettertype {
    public static void main(String[] args){

        /// define character is letter, is special char or number????

        char c = '!'; // how to check is letter or not

        boolean isLetter = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
        boolean isNumber = c >= '0' && c <= '9';

        if (isLetter){

            System.out.println(c + " is letter");}

        if (isNumber){
            System.out.println(c + " is number");
        }

        if(!isLetter && !isNumber){
            System.out.println(c + " is special chararcter");
        }
    }
}
