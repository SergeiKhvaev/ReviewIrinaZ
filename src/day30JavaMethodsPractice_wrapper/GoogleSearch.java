package day30JavaMethodsPractice_wrapper;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {

        String str ="About 1,609,000,000 results (0.49 seconds)";
        String [] parts = str.split(" ");
        // System.out.println(parts[1].replace(",", "")); // убрали запятые
int results = Integer.parseInt(parts[1].replace(",","")); // убрали запятые и перевели стринг в int
        if (results > 10_000_000){
            System.out.println("narrow the search down");
        }
        if (results<50_000){
            System.out.println("not too mauch information");
        }

        System.out.println(Arrays.toString(parts));
        System.out.println(parts[3]);
double seconds = Double.parseDouble(parts[3].substring(1));
if(seconds >1.0){
    System.out.println("Search took too long");
} else if(seconds > 0.5){
    System.out.println("Or but could be better");
       } else {
    System.out.println("Good speed");
       }



    }

}
