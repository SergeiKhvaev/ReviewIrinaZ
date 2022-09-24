package day26MultiDemenArray;

import java.util.Arrays;

public class AvarageEachArray {
    public static void main(String[] args) {
        // среднее каждого массива
        // среднее всего многоуровневого массива


        int totalSum = 0;
        int totalElements = 0;

        int[][] nums = {
                {3,3,5,6,7},
                {3,5,7,8,9,6},
                {4,5,2,1,3,5,5}
                        };
        for(int[] eachInnerArr: nums){// looping througt 2d array nums
            int sum = 0; // resets for next array

            for(int eachNum : eachInnerArr){
                sum+= eachNum; // считаем суммы цифр в каждом массиве

            }
            System.out.println(Arrays.toString(eachInnerArr));
            System.out.println("Avarage: " + (double)sum / eachInnerArr.length);// считаем среднее при этом делаем кастинг в double
            totalSum+= sum;
            totalElements += eachInnerArr.length;

        }

        System.out.println("Total avarege: " + (double)(totalSum) / totalElements);


    }

}
