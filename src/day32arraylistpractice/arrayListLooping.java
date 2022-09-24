package day32arraylistpractice;

import java.util.ArrayList;

public class arrayListLooping {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(8);
        nums.add(7);
        nums.add(3);
        nums.add(4);
// get(0), get(1) and so on

        // traditional for looping
        for(int i = 0; i <nums.size(); i++){ // отличие в size insted length or length()
            System.out.print(nums.get(i) + " ");// print element of arrayList by indexes in same line
        }

        System.out.println();

        // for each loop example
       for(int each : nums){
           System.out.print(each + " ");

       }
        System.out.println();
// looping with string pring initials
        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Capitan America");
        avengers.add("Hawkeye");
        System.out.println(avengers);
        for(String eachName : avengers){
            if(eachName.contains(" ")){
                int space = eachName.indexOf(" ");
                System.out.println(eachName.substring(0, 1) + eachName.substring(space+1, space+2)); // or we can use charAt()
            } else{
                System.out.println(eachName.charAt(0));
            }

        }




    }
}
