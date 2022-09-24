package day23ArraysLoopForEachLoops;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoopScannerPartyList {
    public static void main(String[] args) {
        // нужно собрать все имена для вечеринки

        Scanner input = new Scanner(System.in);
        System.out.println("How many people will come");
        int size = input.nextInt();

        String[] names = new String[size]; // new String[input.nextInt()]
        System.out.println(Arrays.toString(names)); // просто показал что мы можем определить размер массива через консоль

        for(int i = 0; i < names.length; i++){// спрашиваем имя и записываем это имя в массив для храннения, нельзя менять i =1, т.к. нужно начинать хранение объектов с нулевого index массива
            System.out.println("Enter the name of person " + (i + 1));// I+1 сделали, что бы в сообщении появлялся не номер индекса - 0, а 1 , т.е. номер первого гостя
            String guest = input.next();
            names[i] = guest; // names[i] = input.next() - норм вариант тоже

        }
        System.out.println(Arrays.toString(names));






    }
}
