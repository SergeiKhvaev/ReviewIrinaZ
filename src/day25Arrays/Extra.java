package day25Arrays;

import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {
        String[] strs ={"Hello", "world", "monday", "java"};
        System.out.println(Arrays.toString(strs));
        System.out.println(String.join("#", strs));
        System.out.println(String.join(" ", strs));
        System.out.println(String.join(" MIDDLE ", strs));

        System.out.println("=============================");
        // еще один способ создания массивов
        int [] aa = new int[] {1,2,5,3}; // обычной используется когда не нудно использовать references of arr
        System.out.println(Arrays.toString(new int[] {1,2,5,3})); //  распечатали без reference to aa array
        System.out.println(Arrays.toString(aa)); // обычно мы печатаем массив указывая его имя(reference)


    }

}
