package day30JavaMethodsPractice_wrapper;

public class WrapperUppEqualLow {
    /*
Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string
Ex:
    str = "JAVA java";
output:
    true
     */

    public static void main(String[] args) {

        String str = "STAROVOITOVO dstarovoitova";

        System.out.println(isEqualCharCount(str));
    }

    public static boolean isEqualCharCount (String str) {
        int lower = 0;
        int upper = 0;
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (Character.isUpperCase(letter)) {
                upper++;
            } else if (Character.isLowerCase(letter)) {
                lower++;
            }
        }
        System.out.println(upper);
        System.out.println(lower);

        //  boolean isEqual = false;
        if (lower == upper) {
            return true;
        }
        return false;

        }

    }


