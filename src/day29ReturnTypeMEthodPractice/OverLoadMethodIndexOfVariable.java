package day29ReturnTypeMEthodPractice;

import javax.imageio.stream.ImageInputStreamImpl;
import java.util.Arrays;

public class OverLoadMethodIndexOfVariable {
    /*
    IndexOf

overload the indexOf method to work with String array and String element
     */

    public static void main(String[] args) {

        String[] arr = {"Eva", "Sergei", "Katy", "Etel", "Anatoliy", "Lubava"}; // [Anatoliy, Etel, Eva, Katy, Lubava, Sergei] - sorted

        System.out.println(indexOfElement(arr, "Eva"));


    }

    public static int indexOfElement (String [] arr, String element){
        Arrays.sort(arr); // sort given arr alfabeticaly
        int indexOfNum = Arrays.binarySearch(arr, element); // used binary search to find index of element in sorted array

        return indexOfNum;
    }




}
