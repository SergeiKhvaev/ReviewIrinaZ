package day32arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ToUnderstend {
/*
    Separate Parts

    Write a program that can extract the special characters,
    digits and letters from a string and stores them into
    separate ArrayLists of Characters

    Ex:
    str = "ABCD123$%#@&456EFG!"
    list1: {$, %, #, @, &, !}
    list2: {A, B, C, D, E, F, G}
    list3: {1, 2, 3, 4, 5, 6}

 */
public static void main(String[] args) {
    String str = "ABCD123$%#@&456EFG!";
    String[] arr = str.split("");
    System.out.println(Arrays.toString(arr)); // convert String to array
    ArrayList<String> characters = new ArrayList<>(Arrays.asList(arr)); // convert array to ArrayLIst
    System.out.println(characters);
    //Double.parseDouble(parts[3].substring(1));

    for(String each : characters){
      //  if(Character.parsechar(each));

        String str1 ="java";
        int d = Integer.parseInt(str1);





    }
}




}
