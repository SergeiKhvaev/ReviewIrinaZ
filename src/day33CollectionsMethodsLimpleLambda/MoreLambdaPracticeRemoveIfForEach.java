package day33CollectionsMethodsLimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;

public class MoreLambdaPracticeRemoveIfForEach {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Segei", "Eva", "Ekaterina", "Ethel", "Anatoliy", "Liubava", "Cot", "Sot"));
        System.out.println(names);

        ArrayList<String>bylength = new ArrayList<>(names);
        bylength.removeIf(name -> name.length() < 4);
        System.out.println(bylength);

        System.out.println("==========================================================");
        System.out.println(names);
        ArrayList<String> byFirstLetter = new ArrayList<>(names);
        byFirstLetter.removeIf(p -> p.startsWith("E") || p.startsWith("A"));
        System.out.println(byFirstLetter);

        System.out.println("++++===============================================");
        System.out.println(names);
        ArrayList<String> byLastLetter = new ArrayList<>(names);
        byLastLetter.removeIf(p -> !p.endsWith("a"));
        System.out.println(byLastLetter);

        System.out.println("===========================================================");
        System.out.println(names);
        for (String eachElement : names){
            System.out.println(eachElement);
        }
// different way to each loop

        names.forEach(each -> System.out.println(each));// priint every element from ArrayList

        names.forEach(each -> System.out.println(each.charAt(0) + " " + each.charAt(each.length()-1)));
    }
}
