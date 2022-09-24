package day24Arrays;

import java.util.Arrays;

public class ArraysMoveZeros {
    public static void main(String[] args) {
        //переместить все нули в конец массива

    int[] nums = {1, 0, 3, 0, 5, 6, 0, 9};
    int indexToRead = 0;// читает элементы в старов массив с начала до конца

    int [] fixed = new int[nums.length]; // создали пустой массив с размером равным размеру старого массива
    int indexToStore = 0; // используется для хранения переменных в новом массиве, ножет быть не будет увеличиваться с каждой итерацией

        while(indexToRead < nums.length){
            if (nums[indexToRead] != 0){
                fixed[indexToStore++] = nums[indexToRead];
             //   indexToStore++; инкрементинг можно указать и здесь
            }
            indexToRead++;
        }

        System.out.println(Arrays.toString(fixed));






    }
}
