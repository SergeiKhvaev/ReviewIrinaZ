package day26MultiDemenArray;

import java.util.Arrays;

public class CommonElementInEachInnerArray {
    public static void main(String[] args) {

        /*
        Write a program that can print out the common elements from each inner element of a 2D
array
Ex:
       int[][] arr {
              {4, 1, 24, 5},
              {24, 1, 5, 2},
              {4, 1, 5, 1}
       }
         */

        int[][] arr = {
                {4, 1, 24, 5},
                {24, 1, 5, 2},
                {4, 1, 5, 1}
        };
        int firstArr1 = arr[0][0];
        int firstArr2 = arr[0][1];
        int firstArr3 = arr[0][2];
        int firstArr4 = arr[0][3];

        int [] singleArr = new int[arr[0].length + arr[1].length+arr[2].length];
int counter = 4;
        for(int eachInnArr []: arr){
            for(int eachNum : eachInnArr){
              if(firstArr1 == eachNum || firstArr2 == eachNum || firstArr3 == eachNum || firstArr4 == eachNum){
                  counter--;
              }
            }

        }





    }
}
