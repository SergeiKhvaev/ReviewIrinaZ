package day26MultiDemenArray;

import java.util.Arrays;

public class MergeMultiArr {
    public static void main(String[] args) {

/*
Given a 2D int array merge the elements into one 1D array
Ex:
       int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };
       Output:
              [ 10, 20, 30, 5, 10, 15 ]

 */

        int [][] nums = {
                {10, 20, 30}, {5, 10, 99, 15}
        };

        int [] singleArr = new int[7]; // создалиновый пустой массив размером равным размеру данного многоуровневого массива
int singleArrIndex =0; // создали счетчик для трека индексов элементов нового сингл массива
        for(int innArr[] : nums){ // этот цикл крутит каждый каждый массив вногоуровневого массива
            for(int eachNumber : innArr){ // этот цикл прокручиавет каждый элемент в каждого внутреннего массива
                singleArr[singleArrIndex] = eachNumber;// помещаем каждый элемент внутреннего массива в сингл массив
                singleArrIndex++;// прибавляем +1, что бы при следующей итерации в сингл массиве появлялся индекс следующего пустого элемента, куда будем помещать очередной элемент из многоуровневого массива

                }

        }
        System.out.println(Arrays.toString(singleArr));

        System.out.println("============================================");
// немного другое решение


        int [][] numbers = {
                {10, 20, 30}, {5, 10, 15}
        };

int counter =0;
    int [] singleArray = new int[numbers[0].length + numbers[1].length];
    for(int eachInnerArray[] : numbers){
                for(int i = 0; i < eachInnerArray.length; i++){
            singleArray[counter] = eachInnerArray[i];//
                    counter++;

        }


    }
        System.out.println(Arrays.toString(singleArray));


    }
}
