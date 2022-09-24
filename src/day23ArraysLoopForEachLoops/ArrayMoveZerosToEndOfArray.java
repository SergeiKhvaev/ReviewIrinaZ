package day23ArraysLoopForEachLoops;

import java.util.Arrays;

public class ArrayMoveZerosToEndOfArray {
    public static void main(String[] args) {

        // переместить все нули в конец массива

        int [] numbers = {1, 2, 0, 5, 0, 6, 0};

        int [] newArray = new int[numbers.length];// создали новый массив размеров = размеру данного массива
        int newArrayIndexOf = 0; // создали для обозначения индексов старого массива

        for(int i = 0 ; i < numbers.length; i++){
            if(numbers[i] > 0){// проверяем, если число под номером данного массива больше нуля, если да, то этот номер помещаем в новый массив
                newArray [newArrayIndexOf++] = numbers[i];// помещаем проверенные даные в новый массив, ++ дает возможность индексу нового массива увеличиваться на 1  с каждой итерацией


            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}
