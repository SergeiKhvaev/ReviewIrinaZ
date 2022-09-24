package day26MultiDemenArray;

import java.util.Arrays;

public class maxAndMinMultiArray {
    public static void main(String[] args) {

        int [][] nums = {
                {3,5,59,6}, // max 59
                {7,3,55,8,-2}, //min 1
               {9,3,5,7}
        };

        int maxWholeArr = 0; // создали для хранения максимума после прокрутки очередного внутреннего массива
        int minWholeArr = - 0;// создали для хранения минимума после прокрутки очередного внутреннего массива

        for(int eachInnArr[] : nums){ // внешний цикл переключает внутренние массивы

            for(int innNumbers : eachInnArr){ // внутренний цикл переключает элементы внутреннего массива
                if(maxWholeArr < innNumbers){
                    maxWholeArr = innNumbers;
                } else if  (minWholeArr > innNumbers){
                    minWholeArr = innNumbers;

                }
            }
        }
        System.out.println(Arrays.deepToString(nums));
        System.out.println("Maximum number for array nums is " + maxWholeArr);
        System.out.println("Minimum number for array nums is " + minWholeArr);


        System.out.println("--------------------------------");

        int [][] nums1 = {
                {3,4,55,-6}, // max 59
                {7,3,55,8,-2}, //min 1
                {9,3,5,7},
                {1, -10}
        };

        for(int eachInnerArr1[] : nums1){
            int maxNum = -1000;
            int minNum = 1000;

            for(int eachNum : eachInnerArr1){
                if(maxNum < eachNum){
                    maxNum = eachNum;
                }
                if (minNum > eachNum){
                    minNum = eachNum;
                }


            }
            System.out.println(Arrays.toString(eachInnerArr1));
            System.out.println("Max num is " + maxNum);
            System.out.println("Min num is " + minNum);

        }

    }

}
