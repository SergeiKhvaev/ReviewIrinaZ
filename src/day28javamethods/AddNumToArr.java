package day28javamethods;

import java.util.Arrays;

public class AddNumToArr {
    /*
Add Element

create a method that will accept an int array and an int number.
Return an array with the given number added to the end of the array

     */
    public static void main(String[] args) {
     int[] a = {1,2,3,6,8};
              //0 1 2 3 4
        System.out.println(Arrays.toString(newArr(a, 4)));


    }

    public static int [] newArr (int[] arr, int num){
        int [] addedArr = new int [arr.length+1];
        int indexOfadderArr = 0;
        for(int each : arr){
            addedArr[indexOfadderArr] = each;
            indexOfadderArr++;
        }
       addedArr[addedArr.length-1] = num;

        return addedArr;

    }

}
