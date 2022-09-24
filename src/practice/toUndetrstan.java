package practice;


import my_utils.ArrayUtil;

import java.util.Arrays;

public class toUndetrstan {




    public static void main(String[] args) {
        int [] arr = {14,1,0,8, -9, 3,4};
   int min = minNum(arr);
        System.out.println(min);

        System.out.println(ArrayUtil.biggestNumOfArr(arr));

        System.out.println(TrySelf.z);
    }

        public static int minNum(int [] nums){
            Arrays.sort(nums);
            return nums[0];
        }
}

 class TrySelf{
    static int z = 20;
    int n = 10;


}
