package day30JavaMethodsPractice_wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class IntroArrayList {
    public static void main(String[] args) {
        int [] arr = {4,3,1};
        System.out.println("numbers of element " + arr.length);
        System.out.println("print whole arr " + Arrays.toString(arr));
        System.out.println("Access the first element " + arr[0]);
        System.out.println("Add element to arr " + " We can change size of created arr");
        System.out.println(("Remove elements from arr" + " We can`t do it"));
        System.out.println("Array can hold value that are primitive types and object types");

        System.out.println("=================================================================");
        // create first array list
        ArrayList<Integer> nums = new ArrayList<>();// empty arrayList
        System.out.println("Numbers of element " + nums.size());
        System.out.println("print whole arrayList :" + nums);
        System.out.println("Add element to arrayList use add.()method ");
        nums.add(5);
        nums.add(10);
        System.out.println(nums);
        System.out.println(nums.size());
    }


}
