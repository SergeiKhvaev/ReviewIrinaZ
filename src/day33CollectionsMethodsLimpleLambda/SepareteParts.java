package day33CollectionsMethodsLimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;

public class SepareteParts {
    /*
    Separate Parts

Write a program that can extract the special characters,
digits and letters from a string and stores them into
separate ArrayLists of Characters

Ex:
str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}

     */

    public static void main(String[] args) {
        String str = str = "ABCD123$%#@&456EFG!";

        // выделяем буквы

        ArrayList<String> letters = new ArrayList<>(Arrays.asList(str.split("")));// list where every element is separete character
        System.out.println(letters);
        letters.removeIf(p -> !Character.isLetter(p.charAt(0)));// p every element, each character of String, but those characters were String type, so in order to get a char type we did charAt(0). Character method need char type
        System.out.println(letters);// в итоге напечатает одни буквы

        System.out.println("======================================");
        // выделяем цифры
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList(str.split("")));
        numbers.removeIf(each -> !Character.isDigit(each.charAt(0))); //
        System.out.println(numbers);

        System.out.println("======================================");
        // выделяем специальные символы
        ArrayList<String> cpecialChararters = new ArrayList<>(Arrays.asList(str.split("")));
        cpecialChararters.removeAll(letters);
        cpecialChararters.removeAll(numbers);
        System.out.println(cpecialChararters);

    }
}
