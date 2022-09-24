package day25Arrays;

import java.util.Arrays;

public class ArraySumAndAdd {
    public static void main(String[] args) {

        //есть массив добавить все элементы  и суммируйте все в конце

        // int[] a = {1,2,5}
        // int [] b = {1,2,5,8}


        int[] arr = {1, 2, 5, 99};
        int sum = 0;

        for(int each : arr){
            sum+= each;
        }
        int[] newArr = Arrays.copyOf(arr, arr.length+1);// создали копию оригинального массива
        System.out.println(Arrays.toString(newArr));// создали что бы посмотреть, соответственно последний элемент пустой, поумолчанию - 0
        newArr[newArr.length-1] = sum; // положили sum в последний индекс нового массива
        System.out.println(Arrays.toString(newArr));// создали что бы посмотреть






    }
}
