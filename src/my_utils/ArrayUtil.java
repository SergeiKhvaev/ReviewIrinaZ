package my_utils;

import java.util.Arrays;

public class ArrayUtil {
    // greate group for utility method for array// extra prictice from 08/01 need to dine here


// biggest number of given array
public static int biggestNumOfArr (int...arr){
    int biggestNum = 0;
    for(int each : arr){
        if(each > biggestNum){
            biggestNum = each;
        }
    }
    return biggestNum;
}

// if number in array (return String)
public static String isNumInArr(int[] arr, int number) {
    String inArr = "";
    for (int each : arr) {
        if (each == number) {
            inArr = "Contains";
            break;
        } else {
            inArr = "Not contains";
        }

    }
    return inArr;

}

// if number in array (return boolean)
    public static boolean isNumInArr2(int [] arr, int number) {
        boolean inArr = true;
        for (int each : arr) {
            if (each == number) {
                inArr = true;
                break;
            } else {
                inArr = false;
            }

        }
        return inArr;


    }


// index of given number element in INT [] arr
public static int indexOf(int[] arr, int num){// сорт и байнари не подходет, т.к. сорт поменяет изначальный индекс искомого числа

    for(int i = 0; i < arr.length; i++){
        if(arr[i] == num){
            return i;// это будет индекс
        }
    }
    return -1;// число не найдено, принято возвращать -1, если индекс элемента не найден
}



    // // index of given element in STRING arr??????????????????????????????
    public static int indexOfElement (String [] arr, String element){
        for(int i = 0; i < arr.length; i++){

            if(arr[i] == element){
            return i;// это будет индекс
        }
    }
    return -1;// число не найдено, принято возвращать -1, если индекс элемента не найден


    }


// add new element in the end of given array
    public static String [] newArr (String [] arr, String newElement){
        String [] newArr = new String[arr.length+1];
        int indexCounter = 0;
        for(String each : arr){
            newArr [indexCounter] = each;
            indexCounter++;
        }
        newArr[newArr.length-1] = newElement;

        return newArr;

    }

    // add one arr in the end of another array
    public static String [] addElementInArr (String [] firstArr, String [] secondArr){
        String [] newArr = new String[firstArr.length + secondArr.length];//6
        int indexCounter1 = 0;
        for(int i = 0 ;  i < firstArr.length; i++ ){ // положили в новый массив firstArr
            newArr[indexCounter1] = firstArr[i];
            indexCounter1++;
        }

        int indexCounter2 = firstArr.length; // 3
        int indexOfSecondArr = 0;
        for(int i = firstArr.length ; i < newArr.length; i++ ){ // begin from 3, положили в новый массив secondArr
            newArr [indexCounter2] = secondArr[indexOfSecondArr];
            indexOfSecondArr++;
            indexCounter2++;
        }
        //   newArr[newArr.length-1] = newElement;

        return newArr;

    }

}
