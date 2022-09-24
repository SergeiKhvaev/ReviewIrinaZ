package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Understand {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 4, 4, 5, 6, 7, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 5) {
                nums.remove(nums.get(i)); //[2, 4, 5, 6, 7, 7]
            }
        }
        System.out.println(nums);

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 2, 4, 4, 5, 6, 7, 7));
        nums2.removeIf(eachNum -> eachNum < 5); // [5, 6, 7, 7]
        System.out.println(nums2);

        int[] nums4 = {};
        System.out.println(Arrays.toString(nums4));


        String str = "ABCD123$%#@&456EFG!";// можем разобрать стриг по буквал через лууп, проверить каждую букву строкичерез Charagter, и раскидать все буквы по нужныл ArrayList
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> symbols = new ArrayList<>();


        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits.add(str.charAt(i));
            } else if (Character.isLetter(str.charAt(i))) {
                letters.add(str.charAt(i));
            } else {
                symbols.add(str.charAt(i));
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);


        System.out.println("================");

        long i = 123456;
        String str19 = String.valueOf(i);
        System.out.println(str19);
        System.out.println(str19.length());

        //
        // String s=String.valueOf(i);//Now it will return "10"
/*
If your variable is of primitive type (int), it is better to use Integer. toString(int) or String. valueOf(int) . But if your variable is already an instance of Integer (wrapper class of the primitive type int), it is better to just invoke its toString() method as shown above.8 февр. 2019 г.


 */
        long cardNumber = 12312322;
        String str22 = String.valueOf(cardNumber);// convert long to String to define length
        long ik = 0;
        if (str22.length() == 8) {
            System.out.println(ik = cardNumber);
        } else {
            System.out.println("invalid number");
        }


        System.out.println("============================");
        //altPairs("kitten") ? "kien"
        String str5 = "yak";
        // 012345
        String altPair = "";
        for (int j = 0; j < str5.length(); j += 4) {
            int index = j + 1;
            if (index >= str5.length()) {
                index = str5.length();
                altPair += str5.substring(j, index);
            } else {
                altPair += str5.charAt(j);
                altPair += str5.charAt(j + 1);


            }
        }
        System.out.println(altPair);

        String str7 = "Chocolate";
        String altPair2 = "";
        for (int o = 0; o < str7.length(); o += 4) {
            int end = o + 2;
            if (end > str7.length()) {
                end = str7.length();
            }
            altPair2 += str7.substring(o, end);


        }
        System.out.println(altPair2);

        System.out.println("===================================");

        String s = "Sergei";
        System.out.println(s.substring(0, 2).repeat(3));


    }

    }

