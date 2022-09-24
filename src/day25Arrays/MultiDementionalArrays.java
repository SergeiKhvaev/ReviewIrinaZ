package day25Arrays;

import java.util.Arrays;

public class MultiDementionalArrays {
    public static void main(String[] args) {

        int [] a = {1,2,3};
        int [] b = {4,5,6};
        int [] c = {7,8,9};

        int [] [] all = {a,b,c}; // создали еще один массив - мултибранч массив
        System.out.println(Arrays.toString(all[0])); // распечатали первый уровень мулти массива
        System.out.println(Arrays.toString(all[1]));// распечатали второй уровень мулти массива
        System.out.println(Arrays.toString(all[2]));// распечатали третий уровень мулти массива

        System.out.println(all[0] [0]); // распечатали элемент под индексом 0 массива первого уровня
        System.out.println(all[1] [0]);// распечатали элемент под индексом 0 массива второго уровня
        System.out.println(all[2] [0]);// распечатали элемент под индексом 0 массива третьего уровня


    }
}
