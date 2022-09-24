package day32arraylistpractice;

import java.util.ArrayList;

public class newMethodsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(0);
        list.add(12);
        list.add(9);
        System.out.println(list);

        list.set(2, 10); // поменял элемент под индексом 2 на элемент 10
        System.out.println(list);
        list.set(0, 2);// поменял элемент под индексом 0 на элемент 10
        System.out.println(list);

ArrayList<String> str = new ArrayList<>();
        str.add("friday");
        str.add("off");
        str.add("study");
        str.add("relax");
        System.out.println(str);
        int indexOfRelax = str.indexOf("relax");
str.set(indexOfRelax, "coding");
        System.out.println(str);


    }
}
