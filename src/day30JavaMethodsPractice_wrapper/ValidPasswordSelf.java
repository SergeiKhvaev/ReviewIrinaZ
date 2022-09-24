package day30JavaMethodsPractice_wrapper;

public class ValidPasswordSelf {
    /*
Valid Password
    Given a String password find out if it is a valid password
    Requirements:
        Must have at least 8 characters
        Must have at least 1 uppercase letter
        Must have at least 1 lowercase letter
        Must have at least 1 number
        Must have one of the follow special characters:
            ! @ # $ % ^ & *
     */

    public static void main(String[] args) {
        String str ="aSdjssdsddsdsd%1";
        System.out.println(isValidPassword(str));
    }


    public static boolean isValidPassword(String word) {
      boolean isValid = true;
        int chars = word.length();
        int upperChar = 0;
        int lowerChar = 0;
        int number = 0;
        int specials = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
             if (Character.isUpperCase(letter)) {
                upperChar++;
            } else if (Character.isLowerCase(letter)) {
                lowerChar++;
            } else if (Character.isDigit(letter)) {
                number++;
            } else if (letter == '!' || letter == '@' || letter == '#' || letter == '$' || letter == '%' || letter == '^' || letter == '&' || letter == '8') {
                specials++;
            }
        }
        if (chars >= 8 && upperChar >= 1 && lowerChar >= 1 && number >= 1 && specials == 1){

            return true;
        } else {
            return false;
        }



    }
}