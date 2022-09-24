package day30JavaMethodsPractice_wrapper;

import my_utils.ArrayUtil;

import java.util.Arrays;

public class CallMEthods {
    public static void main(String[] args) {
        int []arr ={-1,2,5};
        int num1 = Practice.minFromArr(arr);
        System.out.println(num1);
        System.out.println(Practice.minFromArr(5,4,6, -9, 7,8));


        System.out.println("-=====================================");

        System.out.println(Practice.maxFromArr(99,-209,2,7747));
        System.out.println(Practice.maxFromArr(new int []{1,2,3,477,0}));

        System.out.println("-=====================================");
int [] arr1 = {1,2,3,4,5,6};
        System.out.println(Practice.contains(arr1, 1));
        System.out.println("-=====================================");


        int [] arr2 = {1,2,3,4,5,6};
        System.out.println(Practice.indexOf(arr2,7));
        System.out.println("-=====================================");
//не динамичный вариант
        int [] arr3 = {1,2,3,6 ,4,5,6};
        System.out.println(Practice.indexOf(arr3,6));
        System.out.println(Practice.indexOf(arr3,6,4));

        System.out.println("-=====================================");
        // тотже вариант, что выше(предыдущий), но более динамичный, т.е. мы вводим автоматическую начальную точку, найденную через метод, с которой начинается поиск индекса второго появления 6

        int [] arr4 = {1,2,3,6 ,4,5,6};

        int firstIndex = Practice.indexOf(arr4,6);
int secondIndex = Practice.indexOf(arr4,6,firstIndex+1);
        System.out.println(firstIndex);
        System.out.println(secondIndex);

        System.out.println("-=====================================");
        String [] arr5 = {"Java", "is", "the", "best"};
        System.out.println(Arrays.toString(Practice.addElement(arr5, "language")));

        System.out.println("-=====================================");
        String [] arr6 = {"today", "is", "tuesday"};
        String [] arr7 = {"no", "soft", "skills", "today"};
        System.out.println(Arrays.toString(Practice.addElement(arr6, arr7)));
        System.out.println(Arrays.toString(ArrayUtil.addElementInArr(arr6,arr7)));




    }





}
