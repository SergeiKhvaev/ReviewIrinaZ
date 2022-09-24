package day33CollectionsMethodsLimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    /*
    Remove Duplicates
    Create a method that will take an ArrayList of numbers and remove
    any duplicates values.
    The method will return an ArrayList of unique elements.
    @param nums - The given ArrayList of numbers
    @return - ArrayList of numbers
    Ex:
    Input: {1, 3, 5, 1, 4, 5, 9};
    Output: {3, 4, 9};
     */
// traditional solution, where all uniq num we will put in new arr
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
      //  System.out.println(addDupToNewList(listOfNumbers));
       System.out.println(addUniqToNewList(listOfNumbers));
       int a = Collections.frequency(listOfNumbers, 10);


    }

    // метод оставлени€ уникальных цифр в листе
    public static ArrayList<Integer> removeDup(ArrayList<Integer> nums) {
        ArrayList<Integer> uniqNums = new ArrayList<>(nums);
        uniqNums.removeIf(eachElement -> Collections.frequency(nums, eachElement) > 1);// Initially we applied lambda method removeIf(этим мы заменили лууп) collection method, тем самым мы ввели переменную котора€ провер€ет каждые елемент листа - eachElement, затем использовали Collection method frequancy что бы определить често ли встречаетс€ каждый eachElement в листе, затем сравнили int который выдате Collection frequancy method на предмет больше ли это число чем 1 (1 означает уникальность метода) - тем самым мы изменили существующий лист, оставив в нем только уникальные символы

        return uniqNums;

    }

    // метод дл€ удалени€ уникальных цифр в лсте

    public static ArrayList<Integer> removeUniq(ArrayList<Integer> nums) {
        nums.removeIf(eachElement -> Collections.frequency(nums, eachElement) == 1);

        return nums;
    }


    //  добавить все повтор€ющиес€ цифры в новый лист
    public static ArrayList<Integer> addDupToNewList(ArrayList<Integer> nums) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer eachElement : nums) {
            if (Collections.frequency(nums, eachElement)  >1) {
                newList.add(eachElement);
            }

        }
        return newList;

    }


    //  добавить все уникальные цифры в новый лист
    // 1, 3, 5, 1, 4, 5, 9
    public static ArrayList<Integer> addUniqToNewList(ArrayList<Integer> nums){
        ArrayList<Integer> newList = new ArrayList<>();
        for(Integer eachElement : nums){
           boolean uniq = true;
            if(Collections.frequency(nums, eachElement) == 0){
                newList.add(eachElement);
            }

        }
        return newList;
    }

}

