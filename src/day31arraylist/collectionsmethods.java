package day31arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class collectionsmethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(125,528,234,566,122,444));

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        System.out.println("Before " + list);
        Collections.sort(list); // sorted our ArrayList
        System.out.println("After " + list);

        System.out.println("Second min " + list.get(1));
        System.out.println("Second max " + list.get(list.size() -2));

        // alternitive we can remove max num list.remove(Collection.max(list))? then use Collection.max(list)

        Collections.shuffle(list);// меняет порядок рандомли
        System.out.println(list);



    }
}
