package practice.codingbat;

public class IsNineExistInFirstFourElement {
/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
arrayFront9([1, 2, 9, 3, 4]) ? true
arrayFront9([1, 2, 3, 4, 9]) ? false
arrayFront9([1, 2, 3, 4, 5]) ? false
 */


    public boolean arrayFront9(int[] nums) {
        boolean isNine = false;
        int length = 4;
        if(nums.length < 4){
            length = nums.length;
        }
        for(int i = 0; i <  length ; i++){
            if(nums[i] == 9){
                isNine = true;
            }
        }
        return isNine;
    }

}
