package day28javamethods;

import java.util.Arrays;

public class ArraysQuiz {

    public static void main(String[] args) {


        int n = 0;
        String[] days = {"sun", "mon", "wed", "sat"};
        for (int i = 0; i < days.length; i++) {
            switch (days[i]) {
                case "sat":
                case "sun":
                    n++;
                    break;
                case "mon":
                    n += 5;
                    break;
                case "wed":
                    n -= 2;
            }
        }
        System.out.println(n);


        int[] num1 = {1, 2, 3, 4};
        int[] num2 = num1;

     //   num1[0] = 10;
        num2[2] = 9;
        num2[0] = 0;
        num2[1] = 0;
        System.out.println(Arrays.toString(num1));
     //   System.out.println(Arrays.toString(num2));


    }
}