package day32arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingWithValues {
    public static void main(String[] args) {
        //how to convert Array to ArrayList

        int[] arr = {1,2,3,4,5}; // elements are int type, not Integer

        Arrays.asList(arr); // this method convert arr to arrList
        // creating an ArrList with initial values
        //ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr))// не могу сделать так потому, что элементы int

        System.out.println("=================================================");
        Integer[] arr3 = {1,2,3,4}; // wrapper type, we created arr where elements are INTEGER, not just int

        ArrayList<Integer> num2 = new ArrayList(Arrays.asList(arr3)); // works because now arr include not int, but INTEGER


        // The way we will usually create an ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,7,8)); // создали Arraylist с уже известными нам элементами most time we will use that way
        System.out.println(list);

        System.out.println("=======================");

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Sergei", "Eva", "Katy", "Etel"));// создали Arraylist с уже известными нам элементами

        System.out.println(names);
    }
}
