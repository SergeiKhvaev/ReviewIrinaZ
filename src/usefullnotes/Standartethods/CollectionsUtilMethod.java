package usefullnotes.Standartethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilMethod {
    public static void main(String[] args) {
        /*
        Collections methods located in java.util.collections class
        1. Collection.sort(ArrayList) - sort list by ascending order(возрастающем порядке);
        2. Collection.max(ArrayList) - return max number;
        3. Collection.min(ArrayList) - return min number;
        4. Collections.shuffle(ArrayList) - change elements in list in random order
        5. Collection.revers(ArrayList) - reverse ArrayList, имеет смысл его sort before
        6. Collections.swap(ArrayList, index1, index2) (менять местами)- swap the elements at the given indexes
        7. Collections.frequency(ArrayList, element) - return the frequency of given element in ArrayList. Return int.
         */
        System.out.println("=====================================================");
        //1. Collection.sort(ArrayList) - sort list by ascending order(возрастающем порядке);
        ArrayList<Integer> list = new ArrayList(Arrays.asList(125,528,234,566,122,444));
        Collections.sort(list); // sorted our ArrayList
        System.out.println(list);

        System.out.println("=====================================================");
       // 2. Collection.max(ArrayList) - return max number;
       // 3. Collection.min(ArrayList) - return min number;

        ArrayList<Integer> list1 = new ArrayList(Arrays.asList(125,528,234,566,122,444));
        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));

        System.out.println("Second min " + list.get(1));
        System.out.println("Second max " + list.get(list.size() -2));
        // alternitive we can remove max num list.remove(Collection.max(list))? then use Collection.max(list)


        System.out.println("=====================================================");
        // 4. Collections.shuffle(ArrayList) - change elements in list in random order
        Collections.shuffle(list);// меняет порядок рандомли
        System.out.println(list);

        System.out.println("=====================================================");

        //5. Collection.reverse(ArrayList) - reverse ArrayList, имеет смысл его sort before
        ArrayList<Integer> list2 = new ArrayList(Arrays.asList(15,28,2,1));
        Collections.sort(list2); // sorted our ArrayList
        System.out.println(list2);
         Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("=====================================================");
        //6. Collections.swap(ArrayList, index1, index2) (менять местами)- swap the elements at the given indexes
        ArrayList<Integer> list3 = new ArrayList(Arrays.asList(15,28,2,1));
        Collections.swap(list3, 0,2);
        System.out.println(list3);
        Collections.swap(list3, 0, list3.size()-1);
        System.out.println(list3);

        System.out.println("=====================================================");

       // 7. Collections.frequency(ArrayList, element) - return the frequency of given element in ArrayList. Return int.
        ArrayList<Integer> list4 = new ArrayList(Arrays.asList(15,28,2,1,15,1));
        int a = Collections.frequency(list4,1);
        System.out.println(a);//2
    }

}
