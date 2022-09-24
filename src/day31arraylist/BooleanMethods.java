package day31arraylist;

import java.util.ArrayList;

public class BooleanMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add(4);
        list.add(5);
        list.add(41);
        list.add(5512);
        list.add(413);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println("==================================");

        System.out.println("contains 41 " + list.contains(41));
        System.out.println("contains 1 " + list.contains(1));


        System.out.println("==================================");

        ArrayList<Integer> list2 = new ArrayList<>();
      //  System.out.println(list2.isEmpty());
        list2.add(4);
        list2.add(5);
        list2.add(41);
        list2.add(5512);
        list2.add(413);

        System.out.println(list.equals(list2));
        list.remove(0);
        System.out.println(list.equals(list2));

        System.out.println("=================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        //  System.out.println(list2.isEmpty());
        list3.add(4);
        list3.add(5);
        list3.add(41);

        ArrayList<Integer> list4 = new ArrayList<>();
        //  System.out.println(list2.isEmpty());
        list4.add(4);
        list4.add(41);
        list4.add(5);

        System.out.println(list3.equals(list4));

    }
}
