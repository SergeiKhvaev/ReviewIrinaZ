package usefullnotes.Standartethods;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperClassMethods {
    /*
    1. Character.is...(char type) � ������� ����� ��������� ������� � ���� char
    - Character.isLetter(char type)
    - Character.isDigit(char type);
    - Character.isUpperCase(char type);
    - Character.isLowerCase(char type)

    2. wrapper class methods
    1.1. parse - convert  to primitive type, ���������� ���� ����� ������������� String to int. Return int
    1.2.  valueOf- convert String to wrapper class object, return wrapper class object
     */


    // 1.1 parse - convert  to primitive type, ���������� ���� ����� ������������� String to int




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



    public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {
        boolean hunt = true;
        // define sum ol prays and how many bears we met
        int numsOfprays = 0;
        int bears = 0;
        for (String eachElement : result) {
            if (Character.isDigit(eachElement.charAt(0))) {//!!!!!!!
                numsOfprays += Integer.parseInt(eachElement);
            } else if (eachElement.equals("nanuk")) {
                bears++;
            }
        }
        if (bears > wayStones || numsOfprays < boast) {
            hunt = false;
            return hunt;
        } else {
            return hunt;
        }


    }





    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";// ������ ������ �� �� ����� ���������, ����� �� �� ���-�� ��������������, ��� ���� ���� ��� ����� � ����� ��������� characters �� ������ ��� �� ����� ����� ������� � ��� ���� data structure, where element is separate CHARACTER � ��� �� ����� ���� char [], ��� ��� ������� � ����� ������� ����� char, ������� �� �� ������ ������� � ����� ������ ���� �����, ����� ��� ����������� ������ ���. ����� �������, ��������� �� ������ ������ data structure ��� ArrayList, ��� ������ ������� is not char, but Character. Need to convert String --> ArrayList<Character>
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> symbols = new ArrayList<>();
        char [] arr = str.toCharArray(); // convert String to char []
        System.out.println(Arrays.toString(arr));// convert char[] to ArrayList<Character> - that we need finally

        for (char element : arr){
            if (Character.isDigit(element)){
                digits.add(element);
            }else if(Character.isLetter(element)){
                letters.add(element);
            }else {
                symbols.add(element);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);





        // 1.2.  valueOf- convert String to wrapper class object, return wrapper class object
        String str3 = "1.5";
        Double num = Double.valueOf(str3); // return wrapper Double
        System.out.println(num); // return wrapper Double
    }

}


