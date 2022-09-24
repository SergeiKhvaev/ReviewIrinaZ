package practice.codingbat;

public class ParticularNumbers {
    public static void main(String[] args) {
        /*
        Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
has271([1, 2, 7, 1]) ? true
has271([1, 2, 8, 1]) ? false
has271([2, 7, 1]) ? true

         */


        int[] arr = {2, 7, 1};
        System.out.println(has271(arr));


    }

    public static boolean has271(int[] nums) {
        boolean hasTarget = false;
        int length = nums.length;
        for(int i = 0; i < length-2; i++){
            if(nums[i] == 2 && nums[i+1] == 7 && nums[i+2] == 1){
                hasTarget = true;
                break;
            }
        }
        return hasTarget;
    }

}
