package adamofficehours.day7;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    /*
    Task 2 :  Fibonacci
Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.
Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc
				    Ex:
				        Input:
				            8
				        Output:
				            0, 1, 1, 2, 3, 5, 8, 13, 21
				         */
    public static void main(String[] args) {

        System.out.println(Arrays.toString(fibonacci(8))); //  0, 1, 1, 2, 3, 5, 8, 13,21 elements
                                                                //  0, 1, 2, 3, 4, 5, 6,  7, 8  indexes
        System.out.println("=====================================");
        System.out.println(fibonacciList(8));

    }
//Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc
     public static int [] fibonacci (int num){
        int [] fibonacci = new int [num+1];
          fibonacci[0] =0;
          fibonacci[1] = 1;
          for(int i = 2; i <= 8; i++){
              fibonacci[i] = fibonacci [i-1] + fibonacci [i-2];
          }          // 3              //2                2
return fibonacci;
     }

     public static ArrayList <Integer> fibonacciList (int num){
        ArrayList<Integer> fibonacciiList = new ArrayList<>();
        fibonacciiList.add(0);
        fibonacciiList.add(1);

        for (int i = 2 ; i <= num; i++){
            fibonacciiList.add(fibonacciiList.get(i-1) + fibonacciiList.get(i-2));
                             //3
        }


         return  fibonacciiList;
     }

}
