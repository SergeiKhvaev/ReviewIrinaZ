package day33CollectionsMethodsLimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountries {
    /*
    Remove Countries
Create a method that will take an ArrayList of countries and returns
an ArrayList of countries that have a length of less than 7
@param nums - The given ArrayList of numbers
@return - ArrayList of numbers
Ex:
Input: "Japan", "Korea", "United States", "Turkey",
"United Kingdom", "Canada"
Output: "Japan", "Korea", "Turkey", "Canada"
     */
    // traditional solve

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey","United Kingdom", "Canada" ));
        System.out.println(countries(list));// created new ArrayLIst and printed that NEW lest
        System.out.println(countriesWithNewMethod(list)); // changed old list and printed that old list
        System.out.println(list);
    }
    public static ArrayList<String> countries(ArrayList<String> list){
        ArrayList<String> newList = new ArrayList<>();
        for(String eachElement : list){
            if(eachElement.length() < 7){
                newList.add(eachElement);
            }

        }
        return newList;

    }

   // solve with new knowlege
   public static ArrayList<String> countriesWithNewMethod(ArrayList<String> list){

        list.removeIf(eachElement -> eachElement.length() > 7);

       return list;
   }

}
