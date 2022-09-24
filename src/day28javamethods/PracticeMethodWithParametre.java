package day28javamethods;

import java.util.Scanner;

public class PracticeMethodWithParametre {

    public static void checkNum (int num){ // num is local here, it see only inside method, so i can use num referense outside metghod again
        if (num > 0){
            System.out.println(num + " positive");
        } else if (num < 0) {
            System.out.println(num + " negative");
            }else {
            System.out.println(num + " is zero");
        }


    }

    public static void main(String[] args) {
        checkNum(0);
        checkNum(51);
        checkNum(-9);

        Scanner input = new Scanner (System.in);// как использовать сканнер, сканнер работает только внутри main метода. Т.е. Внутри кастомных методов его нельзя использовать
        System.out.println("Enter any number");
        checkNum(input.nextInt());

        System.out.println("=========================================================");
        int v = 55;
        checkNum(v);


    }

}
