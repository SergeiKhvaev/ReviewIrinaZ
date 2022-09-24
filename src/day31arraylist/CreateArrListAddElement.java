package day31arraylist;

import java.util.ArrayList;

public class CreateArrListAddElement {
    public static void main(String[] args) {

        /*
Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat
Print the ArrayList after each action to see how the change is made
        */
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.println(weekDays);
        System.out.println("=================================");

        ArrayList<String> words = new ArrayList<>();
        words.add("Hat");
        words.add("Shoes");
        words.add(1,"Jacket"); // put between hat and Shoes
        words.add("Towel");
        System.out.println(words);
        words.add(0,"Towel");
        words.add(1, "car"); // put car between towel and hat
        System.out.println(words);




    }

}
