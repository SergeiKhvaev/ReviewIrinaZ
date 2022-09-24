package day29ReturnTypeMEthodPractice;

import java.util.Arrays;

public class OverloadMethodAddElementToEnd {

    /*
    Add Element
overload the add element method to accept two String arrays.
For this one add all the given elements from the second array
in the the first array.

Ex:
	{"today", "is", "monday"}
	{"no", "softskills", "today"}

output > [today, is, monday, no, softskills, today]
     */

    public static void main(String[] args) {
       String [] firstArr = {"today", "is", "monday", "batch 27", "and", "Sergei"};
        String [] secondArr = {"has","no", "softskills", "today"};
        // {1, 2, 3, 4, 5, 6}
        // {0, 1, 2, 3, 4, 5} // indexes

        System.out.println(Arrays.toString (newArr(firstArr, secondArr)));

    }
    public static String [] newArr (String [] firstArr, String [] secondArr){
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
