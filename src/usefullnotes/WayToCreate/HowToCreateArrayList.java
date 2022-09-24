package usefullnotes.WayToCreate;

import day36classandobject.hobby.Hobby;

import java.util.ArrayList;
import java.util.Arrays;

public class HowToCreateArrayList {
    public static void main(String[] args) {
        // ArrayList - is class, also this is a part of collection framework. ArrayList is collection type. This is non primitive data type. ArrayList can contain oly non-primitive data types, that why if we want to put inside ArrayList int, double, long ....primitive type we have to yse wrapper class and convert primitive type to non primitive type - Integer, Double, Long.....
        //1. Creating ArrayList using "new" key word - ArrayList<DATA TYPE> name = new ArrayList<>()
        // 2. Creating empty ArrayList but set of capacity of list ArrayList<Integer> numbers = new ArratList<>(12);
        //3. Copying of existing ArrayList - ArrayList<Double> list1 = new ArrayList <>(name of existing ArrayList);
        // 4. Creating ArrayList if we know values initially. We cant put values in ArrayList(like we do it with Array? because ArrayList accept only collection type)/ In this way, we have to convert values into any collection type. Need to use special method from Arrays utility - asList to convert Array to ArrayList (help to convert array to arrayList. That method Allow as to put values into ArrayList directly without creating Array list first


        //1. Creating ArrayList using "new" key word - ArrayList<DATA TYPE> name = new ArrayList<>() (we can create ArrayList without defining size, because ArrayList is flexible

        ArrayList<Character> letters = new ArrayList<>(); // created an ampty ArrayList//but internal capacity by default 10 (capacity not affect anything)
        System.out.println(letters.size());// 0 -> empty
        letters.add('j');// converted to autoboxing
        letters.add('a');// converted to autoboxing
        letters.add('v');// converted to autoboxing
        letters.add('a');// converted to autoboxing// we can add as many element as we want and size will change automatically
        System.out.println(letters.size());// number of element ->4
        System.out.println(letters); // print whole arraylist

        System.out.println("===================================================");
        // 2. Creating empty ArrayList but set of capacity of list ArrayList<Integer> numbers = new ArrayList<>(12);
        ArrayList<Integer> numbers = new ArrayList<>(112);

        System.out.println("=======================================================");

        //3. Copying of existing ArrayList - ArrayList<Double> list1 = new ArrayList <>(name of existing ArrayList);

        ArrayList<Hobby> myHobbies =new ArrayList<>();
        myHobbies.add(new Hobby("Golf", 1000, true, false));
        myHobbies.add(new Hobby("Puzzles", 50, false, false));
        myHobbies.add(new Hobby("Basketball", 2500, true,true));
        myHobbies.add(new Hobby("Online games", 550, false, true));
        myHobbies.add(new Hobby("Traiding", 450, false, false));
        System.out.println(myHobbies);//печатаем весь arrayList
        ArrayList<Hobby> withoutOutDoors = new ArrayList<>(myHobbies); // withoutOutDoors is  copy of myHobbies ArrayLisr
        ArrayList<Hobby> playAlong = new ArrayList<>(myHobbies); // playAlong is  copy of myHobbies ArrayList

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Friday");
        list1.add("java");
        list1.add("movies");
        list1.add("sport");
        System.out.println(list1);

        ArrayList<String> list2 = list1; // we make just another referense for same list. We still have   one list, if you want to create new list need to make copy of it


        System.out.println("==============================================");

        // 4. Creating ArrayList if we know values initially. We cant put values in ArrayList(like we do it with Array? because ArrayList accept only collection type)/ In this way, we have to convert values into any collection type. Need to use special method from Arrays utility - asList to convert Array to ArrayList (help to convert array to arrayList. That method Allow as to put values into ArrayList directly without creating Array list first

        //а The way we will usually create an ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,7,8)); // создали Arraylist с уже известными нам элементами most time we will use that way
        System.out.println(list);



        //б) we also can create array first, then put its reference in arraList and use asList method - that works too
        Integer[] arr3 = {1,2,3,4}; // wrapper type, we created arr where elements are INTEGER, not just int

        ArrayList<Integer> num3 = new ArrayList(Arrays.asList(arr3)); // works because now arr include not int, but INTEGER


    }


}
