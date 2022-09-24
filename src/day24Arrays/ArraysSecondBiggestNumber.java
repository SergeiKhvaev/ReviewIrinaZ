package day24Arrays;

import java.util.Arrays;

public class ArraysSecondBiggestNumber {

    public static void main(String[] args) {

        /*

        [IQ] Second Biggest Number

Given an Array of numbers. Find and print the 2nd biggest number.
Note the 2nd biggest should be unique meaning it should be different from the max number
Example:
	Input:
		[4,3,1,4,5,2,4,8,4,8]
	Output:
		5
         */

        int[] numbers = {5,3,1,4,9};
       Arrays.sort(numbers);// отсортировали от малого к большому
        int firstBiggest = numbers[numbers.length-1];// элемент в последней позиции отсортированного массива является самым большим в массиве
int secondBiggest = 0;
        // System.out.println(Arrays.toString(numbers));
for(int i =  numbers.length-1; i >0 ; i--){ // проверка начинается с конца массива, при этом элемент под последним индексом отсортированного массива автоматически является самым большим
if(numbers[i] < firstBiggest){// как только находится элемент который является маньшим по сравнению с последним элементом, этот элемент и распечатывается
    System.out.println(numbers[i]);
    break;// программа прерывается, т.к. нет необходимости дальнейшей работы кода, в противном случае, распечатается весь массив в начиная с предпоследнего элемента и заканчивая элементом под индексом 0
}

}




    }
}
