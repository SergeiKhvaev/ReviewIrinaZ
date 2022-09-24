package day25Arrays;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {

        int[] arr = {6,23,10,40, 240}; // массив создан уже в натурально сортированном виде, в противном случае нужно сортировать

        System.out.println(Arrays.binarySearch(arr, 240));
        System.out.println(Arrays.binarySearch(arr, 2000)); // если ищем не существующий элемент, будет отрицательное число

        System.out.println("================================================================");

        int[] b = {6,3,7,2,9,-14};
                 //0 1 2
        System.out.println(Arrays.binarySearch(b,3));// не выдает , т.к. не отсортерованный масива
        Arrays.sort(b); // сортируюем массив
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.binarySearch(b,3));//выдает верный ответ, т.к. массив отсортирован
        System.out.println(Arrays.binarySearch(b,-14));
        System.out.println(Arrays.binarySearch(b,5)); // если ищем не существующий элемент, выдает отрицательное число

        System.out.println("========================================");

        String [] words ={"hello", "world", "zebra", "water"};
        Arrays.sort(words); // сортиируем
        System.out.println(Arrays.toString(words));

        System.out.println(Arrays.binarySearch(words, "world"));// выдает индекс этого элемента в массиве
        System.out.println(Arrays.binarySearch(words, "ass"));// выдает отрицательное число, если ищем несуществующий в массиве элемент


    }

}
