package day29ReturnTypeMEthodPractice;

import java.util.Arrays;

public class AddElementToEndOfArr {
    /*
    Add Element
create a method that will accept a String array and a String element.
Add the given element value into the end of the array. Do not replace
the last index of the given array,
but instead create a new array with a bigger size to fit all the
original elements plus the new one
     */

    public static void main(String[] args) {
        String [] arr = {"Sergei", "Ekaterina", "Eva", "Lubava"};
        System.out.println(Arrays.toString(newArr(arr, "Etel")));
    }

    public static String [] newArr (String [] arr, String newElement){
        String [] newArr = new String[arr.length+1];
        int indexCounter = 0;
        for(String each : arr){
    newArr [indexCounter] = each;
    indexCounter++;
        }
        newArr[newArr.length-1] = newElement;

        return newArr;

    }
}
