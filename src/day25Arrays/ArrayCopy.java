package day25Arrays;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int[] nums = {1,2,3};
        int[] other = nums;
        // здесь всего лишь один массив и две references указывающих на один массив

        nums[0] = 10; // мен€ем элемент в массиве
        other[2] = 25;// мен€ем другой элемент, но в том же (единственном) массиве, просто используем другой reference
        System.out.println(Arrays.toString(nums));//
        System.out.println(Arrays.toString(other));

        System.out.println("-------------------------------------------");

        int[] numbers ={1,2,3,5,3,6,7,5,3,3,33};
        Arrays.sort(numbers); // здесь также мы не создали новый массив, мы его просто отсортировали
        System.out.println(Arrays.toString(numbers));


        System.out.println("-------------------------------------------");


int[] a = {5,10,18};
int [] b = Arrays.copyOf(a,3);// мы создали копию массива a, но это Ќќ¬џ… ћј——»¬
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("----------");

a[1] = 100;// изменили элемента в массиве а, соответственно этот элемент в копии b не изменилс€, т.к. b это копис€ массива а, но все-таки b - это совсем новый массив
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int [] v = {1,4,5};
        int[] d = Arrays.copyOf(v, v.length);



    }
}
