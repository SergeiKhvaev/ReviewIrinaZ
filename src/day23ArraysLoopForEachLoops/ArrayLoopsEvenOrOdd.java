package day23ArraysLoopForEachLoops;

public class ArrayLoopsEvenOrOdd {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 9, 8};
        int even = 0;
        int odd = 0;

        for (int each : nums) {
            if (each % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers - " + even);
        System.out.println("Odd numbers - " + odd);


        System.out.println("REGULAR LOOP +++++++++++++++++++++++++++++++++++++++++++++++");
        int[] nums1 = {1, 2, 3, 4, 5, 7, 8};
        int even1 = 0;
        int odd1 = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 == 0) {
                even1++;
            } else {
                odd1++;
            }

        }
        System.out.println("Even numbers - " + even1);
        System.out.println("Odd numbers - " + odd1);
    }
}