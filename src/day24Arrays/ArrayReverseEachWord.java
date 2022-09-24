package day24Arrays;

import java.util.Arrays;

public class ArrayReverseEachWord {
    public static void main(String[] args) {
        String str = "Today is Friday. Have a good weekend!";
// reverce each word withaut reversing string

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));// просто что бы увидеть появившийся массив
        String reverse = "";

        for (String each : words) {
            System.out.println(each);

            String eachReverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {

                eachReverse += each.charAt(i);
            }
reverse += eachReverse + " ";


        }
        System.out.println(reverse);

    }
}
