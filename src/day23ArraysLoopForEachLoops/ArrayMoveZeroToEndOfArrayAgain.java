package day23ArraysLoopForEachLoops;

import java.util.Arrays;

public class ArrayMoveZeroToEndOfArrayAgain {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 0, 3, 0, 5, 2, 0};
        int[] newArray = new int[numbers.length];
        int newArrayIndex = 0;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0){
                newArray[newArrayIndex++] = numbers[i];
            }
        }

        System.out.println(Arrays.toString(newArray));

    }
}
