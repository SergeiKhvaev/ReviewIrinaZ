package day29ReturnTypeMEthodPractice;

import java.util.Arrays;

public class IndexOfNumInArr {
        /*
    IndexOf
create a method that will accept an int array and an int number.
Find and return the index of the number in the array.
If there is multiple occurrence return the first occurrence's index
     */
        public static void main(String[] args) {

            int [] arr = {1,9,3,2}; // 1,2,3,9

            System.out.println(indexOfNum(arr, 9));

        }
    public static int indexOfNum (int [] arr, int num){
            Arrays.sort(arr); // sort given arr
      // my_utils.ArrayUtil.isNumInArr(arr, num); // used to define if num in arr
       int indexOfNum = Arrays.binarySearch(arr, num); // used binary search to find index of num in sorted array

        return indexOfNum;
        }



    }




