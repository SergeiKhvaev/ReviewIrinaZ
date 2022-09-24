package day32arraylistpractice;

import java.util.ArrayList;

public class creatingArrayList {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Friday");
        list1.add("java");
        list1.add("movies");
        list1.add("sport");
        System.out.println(list1);

        System.out.println("=============================================");

        ArrayList<String> list2 = list1; // we make just another referense for same list. We still have   one list, if you want to create new list need to make copy of it
        list2.add("soft skills");
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("=======================================");

        ArrayList<String> list3 = new ArrayList<>(list1); //  creating new list with the same element as list 1, acctuali we just copy list 1
        list3.remove(0); // удалили первый жлемент но только из копии, т.е. нового листа, лист 1 остался тем же
        System.out.println("list1 "  + list1);//
        System.out.println("list3 " + list3);


    }

}
