package day31arraylist;

import java.util.ArrayList;

public class Avangers {
    public static void main(String[] args) {
        /*
        Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye
    remove Thor by index
    remove Iron Man by element
    remove the first index
Print the ArrayList after each action to see how the change is made
         */
        ArrayList<String> avangers = new ArrayList<>();
        avangers.add("Iron Man");
        avangers.add("Spider Man");
        avangers.add("Thor");
        avangers.add("Capitan America");
        avangers.add("Hawkeye");
        System.out.println(avangers);
        int indexOfThor = avangers.indexOf("Thor"); // 2
        avangers.remove(indexOfThor);
        System.out.println(avangers);
        avangers.remove("Iron Man");
        System.out.println(avangers);
        avangers.remove(1);
        System.out.println(avangers);
        System.out.println("==================");
        // print initials of each avanger
        ArrayList<String> avangers1 = new ArrayList<>();
        avangers1.add("Iron Man");
        avangers1.add("Spider Man");
        avangers1.add("Thor");
        avangers1.add("Capitan America");
        avangers1.add("Hawkeye");
        System.out.println(avangers1);
        for(String eachName : avangers1){
            if(eachName.contains(" ")){
                System.out.println(""+ eachName.charAt(0) + " " + eachName.charAt(eachName.indexOf(" ")+1));
            }else{
                System.out.println(eachName.charAt(0));
            }
        }





    }
}
