package day32arraylistpractice;

import java.util.Arrays;

public class Prractice2 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(populated(5)));;

    }

    public static int[] populated (int num){

        int [] arr12 = new int[num];
        int index = 0;
        for(int i = 1 ; i <= num; i++){
            arr12[index] = i;
            index++;

        }
        return arr12;

    }

}
