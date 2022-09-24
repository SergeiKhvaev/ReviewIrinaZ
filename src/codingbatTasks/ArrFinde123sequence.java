package codingbatTasks;

import java.util.Arrays;

public class ArrFinde123sequence {
    public static void main(String[] args) {

boolean isTrue = false;
        int[] arr = {1, 2, 3, 1, 2, 3};
        System.out.println(Arrays.toString(arr));
        String sortedNums = "";
        for (int i = 0; i < arr.length; i++) {
            sortedNums += arr[i];
        }
        if(sortedNums.contains("123")){
            isTrue = true;
        }
        System.out.println(isTrue);
       System.out.println(array123(arr));

    }


    public static boolean array123(int[] nums) {
        String sortedNums = "";
        for (int i = 0; i < nums.length; i++) {
            sortedNums += nums[i];
        }
        boolean isSequence = false;
        if (sortedNums.contains("123")) {
            isSequence = true;
        }

        return isSequence;

    }

}

