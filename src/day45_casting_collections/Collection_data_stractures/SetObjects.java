package day45_casting_collections.Collection_data_stractures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();//NO maintain order(random order)

        set1.add(null);
        set1.add("hello world");// no duplicates
        set1.add("5.0");
        set1.add("#zebra");
        set1.add("Java");
        set1.add("hello world");// will not print in whole set


        System.out.println(set1);// NO maintain order

       // System.out.println(set1.get(0)); - no indexes


        Set<String> set2 = new LinkedHashSet<>(); //mantains order

        set2.add(null);
        set2.add("hello world");// no duplicates
        set2.add("5.0");
        set2.add("#zebra");
        set2.add("hello world");// will not print in whole set
        set2.add("Java");
        System.out.println(set2);//mantains order


        Set<String> set3 = new TreeSet<>(); //mantains ascending order

        //set3.add(null); // not accept null
        set3.add("hello world");// no duplicates
        set3.add("5.0");
        set3.add("#zebra");
        set3.add("hello world");// will not print in whole set
        set3.add("Java");
        System.out.println(set3);//mantains order
    }
}
