package day33CollectionsMethodsLimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkArrayListMethods {
    public static void main(String[] args) {
// addAll
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(4);
        ArrayList <Integer> other = new ArrayList<>(Arrays.asList(1,2,3,4));
        nums.addAll(other);
        System.out.println(nums);
        nums.addAll(Arrays.asList(40,34,56));
        System.out.println(nums);
nums.addAll(0, Arrays.asList(00, 00)); // add 00 b 00 at start of list
        System.out.println(nums);

        System.out.println("========================================");
        // removeAll
        ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,121, 1));
        list2.removeAll(Arrays.asList(1,1,1));
        System.out.println(list2);
        list2.removeAll(Arrays.asList(1,3,121));
        System.out.println(list2);

        System.out.println("========================================");
        // containsAll
        ArrayList <Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,3,4, 5, 121, 1));
        System.out.println("contains 4 " + list3.contains(4));
        System.out.println("contains 4 and 5 " +(list3.contains(4) && list3.contains(5)));
        System.out.println("checking all numbers 4 and 5 and 121 " + list3.containsAll(Arrays.asList(4,5, 121)));

        System.out.println("=======================================");
        // retainAll

        ArrayList <Integer> list4 = new ArrayList<>(Arrays.asList(1,1,2,3,4, 5, 121, 1));
        list4.retainAll(Arrays.asList(2,5,121));
        System.out.println(list4);

        // how manu=y vowls in word
        String s = "implementation";
        ArrayList<String> list5 = new ArrayList<>(Arrays.asList(s.split("")));// convert the string to string arraylist, where each character s different element
        list5.retainAll(Arrays.asList("a","e","i","o","u"));
        System.out.println(list5.size());
        System.out.println(list5);;

    }

}
