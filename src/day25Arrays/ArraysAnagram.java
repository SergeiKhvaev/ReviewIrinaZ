package day25Arrays;

import java.util.Arrays;

public class ArraysAnagram {
    public static void main(String[] args) {


        /*

        [IQ] Given two Strings determine if they are anagram or not. Anagram is when the character of the words can be reordered to get a different word
Ex:
  listen
  silent

The letters of the two words are the same so they are anagram
         */

        String word1 = "listen"; // если в слове есть верхний регистр, то нужно применять стринг метод to.LowerCase, т.е систему chaiga
        String word2 = "silent";

        char[] first = word1.toCharArray(); //конвертировали слово в массив
        char[] second =word2.toCharArray();//конвертировали слово в массив
        System.out.println(Arrays.toString(first).toLowerCase());
        System.out.println(Arrays.toString(second).toLowerCase());


Arrays.sort(first);// не создавали новые массив просто отсортировали, т.к. это char сортирует по ASCII порядку
Arrays.sort(second);
System.out.println(Arrays.toString(first));//
System.out.println(Arrays.toString(second));//

       if(Arrays.equals(first,second)){ //если буквы в словах совпадают, значит это анаграмм
           System.out.println("Anagram");
       } else {
           System.out.println("Not anagram");
       }

        System.out.println("============================================");

        System.out.println(Arrays.equals(first,second) ? "Annagra" : "Not anagram");

    }
}
