package adamofficehours.day7;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = {7,8,9};
        int[] d = {10,11,12};
int [] merge  = mergeTwoArray(a,b);

        System.out.println("Merge two arrays = " + Arrays.toString(mergeTwoArray(a,b)));
        System.out.println("Merge three arrays = " + Arrays.toString(mergeThreeArray(a,b,c)));
        System.out.println("Another way to merge three arrays = " + Arrays.toString(anotherWayToMerge(a,b,c)));
        System.out.println("Third way to merge three arrays = " + Arrays.toString(mergeArrays(a,b,c)));


    }

    public static int[] mergeTwoArray(int[] a, int[] b) { // like that we can merge as many arrays as we need
        int [] dummy = new int[a.length + b.length];
        int index = 0;
        for(int eachElement : a){
            dummy[index] = eachElement;
            index++;
        }

        for (int eachElement : b){
            dummy [index] = eachElement;
            index++;
        }
        return dummy;
    }

    public static int[] mergeThreeArray(int[] a, int[] b, int[] c) { // like that we can merge as many arrays as we need
        int [] dummy = new int[a.length + b.length + c.length];
        int index = 0;
        for(int eachElement : a){
            dummy[index] = eachElement;
            index++;
        }

        for (int eachElement : b){
            dummy [index] = eachElement;
            index++;
        }
        for (int eachElement : c) {
            dummy[index] = eachElement;
            index++;
        }
        return dummy;
    }

    //======================= another solution of merge arrays
    public static int[] anotherWayToMerge(int[] a, int[] b, int[] c){
    int [] ints = mergeTwoArray(a,b);
    return mergeTwoArray(ints, c);
    }

    //======================= third solution of merge arrays
    public static int[] mergeArrays(int[] a, int[] b, int[] c){
      return  mergeTwoArray(mergeTwoArray(a,b), c);

    }


}
