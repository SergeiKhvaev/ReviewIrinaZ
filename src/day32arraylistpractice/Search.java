package day32arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(Arrays.asList("Friday", "Coding", "Java", "Java"));
        System.out.println(searchInList(list, "java"));
        System.out.println(searchInList(list, "CODING"));

    }

    // как часто данное слово встречается в arrayList
    public static int searchInList (ArrayList<String> list, String target){
        int count = 0;
        for(String eachWord : list){
            if(eachWord.equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }

}
