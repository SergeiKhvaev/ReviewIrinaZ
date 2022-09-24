package adamofficehours.day8;

import java.util.ArrayList;
import java.util.Arrays;

public class ForOrLEss {
    public static void main(String[] args) {
       /*
       Task 1 : Four or less
					Given an ArrayList of Strings, go through and read only Strings that are 4 characters or less.
					Take those Strings and put them into a different ArrayList
					Ex:
					Input:
					“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
					Output:
					[ tree, loop, cat ]

        */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
        System.out.println(fourOrLess(list));

    }
    public static ArrayList <String> fourOrLess (ArrayList <String> list){
        ArrayList<String> newList = new ArrayList<>();
    for(String eachElement : list){
        if(eachElement.length() <= 4) {
        newList.add(eachElement);
    }
}

return newList;
    }

}
