package usefullnotes.Standartethods;

import java.util.Arrays;

public class ArrayStringMethodsCOLLECT {
    public static void main(String[] args) {

        // String to array methods
        // 1. toCharArray() convert string to char[] where every chrar of string will present as element of array
        // 2/ split("") split of string at parts and convert it to String[], where every element of array is part/ Parts defined by inside brackets("") for example split(",") or (" ")


        // toCharArray
        String str = "hello world";
        char[] array = str.toCharArray();
        System.out.println(array);// String use array internally, so it print like String
        System.out.println(Arrays.toString(array));
        System.out.println(str.length());// counts number of char
        System.out.println(array.length);// counts numbers of array elemetns
        System.out.println(array[0]);

        System.out.println("----------------------");

        for (char eachLetter : str.toCharArray()) {
            System.out.print(eachLetter);
        }

        System.out.println("----------------------");
        System.out.println("----------------------");


        // split()
        String str1 ="Mondeq, tusday, wendsday, thursday, friday, suturday, sunday";
        String []arr= str1.split(",");
        System.out.println(Arrays.toString(str1.split(",")));
        System.out.println(arr.length);
        for(String each : str1.split( ",")){
            System.out.println(each);
        }



        System.out.println("----------------------");


String str3 = "java";

        System.out.println(Arrays.toString(str3.toCharArray()));// возвращает массив типа сhar[]
     System.out.println(str3.toCharArray());// печатает слово, при этом массив exist internally
        System.out.println((Arrays.toString(str3.split("")))); // возвращает массив типа string[], между "" пустое место, слово разбивается на char , каждый из них помещается в елемент массива




    }
}