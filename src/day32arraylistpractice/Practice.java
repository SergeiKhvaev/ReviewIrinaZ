package day32arraylistpractice;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
/*
Practice flow:

Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made

 */

        ArrayList<String> words = new ArrayList<>();
        words.add("Har");
        System.out.println(words);
        words.add("Shoes");
        System.out.println(words);
        words.add(1, "Jacket");
        System.out.println(words);
        words.add("0, Towel");
        System.out.println(words);
        words.add(1, "Car");
        System.out.println(words);


        System.out.println("=======================================");
        /*
        Practice flow:

Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye

    remove Thor by index

    remove Iron Man by element

    remove the first index

Print the ArrayList after each action to see how the change is mad
         */
        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Capitan America");
        avengers.add("Hawkeye");
        System.out.println(avengers);
        int indexOfThor = avengers.indexOf("Thor");
        System.out.println(avengers.indexOf("Thor"));
        avengers.remove(indexOfThor);
        System.out.println(avengers);
        avengers.remove("Iron Man");
        System.out.println(avengers);
        avengers.remove(0);
        System.out.println(avengers);

        System.out.println("=========================");
        // removing arrayList int
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(800);
        nums.add(300);
        nums.add(400);
        nums.add(300);
        System.out.println(nums);

      //  nums.remove(300); не будет удалать, т.е. проблема что код думает что это индекс
        nums.remove((Integer) 300); // кастим в Integer теперь машина понимает, что мы удаляем элемент arrayList, тк. там могуть быть только Integer (boolean method that mean return true jf success removed and false - if not. That boolean result we can use in future code) Other way is finde indexOf нужного к удалению элемента и потом его вставить в remove method
        System.out.println(nums);

        System.out.println("++++============================");
        // Name in ArrayList
        ArrayList<Character> name = new ArrayList<>();
        name.add('S');
        name.add('a');
        name.add('i');
        name.add('m');
        System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println(name.get(2));
        System.out.println(name.get(3));



    }
}
