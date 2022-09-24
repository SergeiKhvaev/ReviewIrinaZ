package day46_collection.set;

import java.util.*;

public class Setpractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(12);
        set.add(34);
        set.add(-1);
        set.add(9);
        System.out.println(set);

        //set.get(); there is no get method, how do you access the elements?

        for (int each : set) {// HashSet no indexes, no get() method, which we use to reach particelar element with List, so only way to operate each element of HashSet is FOR EACH loop, or put Hash set to ArrayList
            if (each > 10) {
                System.out.println(each);
            }
        }
ArrayList<Integer> setToList = new ArrayList<>(set);
        System.out.println(setToList);
        System.out.println(setToList.get(1));
        LinkedList<Integer> setToLinkelList = new LinkedList<>(set);
        System.out.println(setToLinkelList);

        Set<String> handles = new HashSet<>();
        handles.add("daad2141124");
        handles.add("dsauehui223");

        for (String each : handles) {
            if (!each.equalsIgnoreCase("daad2141124")) {
                // switch to the other handle
            }
        }

        Set<String> set3 = new HashSet<>();
        set3.add("hello");
        set3.add("bye");
        set3.add("java");
        set3.add("world");
        System.out.println(set3);

        List<String> list = new ArrayList<>(set3);// Basicaly we copied to ArrayList our HashSet, that available because they has common Parrent - Collection interface
        System.out.println(list);
        System.out.println(list.get(0));





// remove duplicates of each character
       String s = "AAAASDSDDDDDEEEDD";
        System.out.println(new LinkedHashSet<>(new ArrayList<>(Arrays.asList(s.split(""))))// removes duplicates because LinkedHasSet not allows duplicates
        .toString().replace(", ", "").replace("[", "").replace("]", "")); // return evere thing to String);




    }
}
