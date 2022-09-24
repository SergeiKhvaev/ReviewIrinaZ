package day45_casting_collections.Collection_data_stractures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {

        List<Character> list1 = new ArrayList<>();
        list1.add('a');
        list1.add('b');
        list1.add(null);// empty space in arrayList
        list1.add('c');
        list1.add('c'); //duplicates allowed

        System.out.println(list1);// maintained order of input;, allowed duplicates, empty spaces allowed


        List <Character> list2 = new LinkedList<>();
        list2.add('a');
        list2.add('b');
        list2.add(null);// empty space in arrayList
        list2.add('c');
        list2.add('c'); //duplicates allowed
        System.out.println(list2); // same output as with list 1. Differencies occured inside, how linked list handle data, espetially with adding and deleting data, we do not see it. But adding and deleteng happended faster then seme actions witn ArrayList
        System.out.println(list2.get(2));

        List<Character> list3 = new Vector<>();
        list3.add('a');
        list3.add('b');
        list3.add(null);// empty space in arrayList
        list3.add('c');
        list3.add('c'); //duplicates allowed
        System.out.println(list3);
        System.out.println(list3.get(3));









    }
}
