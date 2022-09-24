package day24Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeReverse {

    public static void main(String[] args) {
        // сделать массив, хранящий элементы данного массива в обратном порядке (новый реверс массив)

        int[] arr = {1, 2, 3, 4, 5};
        int [] reverse = new int[arr.length];

        for(int i = arr.length-1, y = 0; i >= 0 ; i--, y++){ // y - ввели для того, что бы определить в индексы нового массива. i - переменная определяет индексы старого массива// Y переменную также можем объявить перед циклом int y = 0;
            reverse[y] = arr[i]; // обратный порядок элементов данного массива, начинаем хранить в новом массиве


        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("===========================");

        Scanner input = new Scanner(System.in);
        String sentance = input.nextLine();
        String[] arr1 = sentance.split(" ");
        String [] reverseArr = new String[arr1.length];

        for(int i = arr1.length-1, y = 0; i >= 0 ; i--, y++){ // y - ввели для того, что бы определить в индексы нового массива. i - переменная определяет индексы старого массива// Y переменную также можем объявить перед циклом int y = 0;
            reverseArr[y] = arr1[i]; // обратный порядок элементов данного массива, начинаем хранить в новом массиве


        }
        System.out.println(Arrays.toString(reverseArr));



    }
}
