package day24Arrays;

import java.util.Arrays;

public class ArraysClassMethods {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,7,2,7,9,4,2,7};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);// меняет порядок в нтри заданного массива, поэтому его не нужно никуда переназначать, он выдается с новым порядком элементов и все
        System.out.println(Arrays.toString(nums));
        System.out.println("min - " + nums[0]);
        System.out.println("max - " + nums[nums.length-1]);

        System.out.println("------------------------------------");

        String[] strs = {"hello", "world", "4four", "#zebra", "apple", "bee", "1aaaaaaa"};
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs)); // сравнивает по ACII table// сначала идут специальные символы, потом цифры, потом буквы верхнего регистра, затем буквы нижнего регистра


        System.out.println("====================================");

int [] a = {1,2,3};
int [] b = {1,2,3};
int [] c = {1,2,4};
int [] d = {3,2,1};// но мы можем sort этот массив, тогда он будет equals  с а, и массивами

        System.out.println(Arrays.equals(a,b)); // true
        System.out.println(Arrays.equals(a,c)); // false
        System.out.println(Arrays.equals(a,d)); // false

        System.out.println("------------------------------------");



    }
}
