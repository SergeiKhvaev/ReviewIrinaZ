package day26MultiDemenArray;

import java.util.Arrays;

public class GroupSelf {
    public static void main(String[] args) {

        String[][] classGroup = {
                {"Sergei", "Katy", "Eva"},
                {"Anatoliy", "Etel", "Lubava"},
                {"Oly", "Barnaba", "Pedro", "Huanitta"},
                {"Blyadina", "Ueba", "Ass"}

        };
        System.out.println(classGroup.length);// длинна мальтимассива - 4
        System.out.println(classGroup[1].length);  // длинна второго массива - 3
        System.out.println(classGroup[0][2]);// просим вывести первого массива 2 индекс - Eva
        System.out.println(Arrays.toString(classGroup[1])); // печатаем массив под индексом 1 -  {"Anatoliy", "Etel", "Lubava"},
        System.out.println(Arrays.deepToString(classGroup)); // распечатываем многоуровневый массив полностью

        System.out.println("=====================================================");
        // how to loop through each inner array

        for (String innerArr[] : classGroup) { // не забываем что элементами внутри многоуровнего массива €вл€ютс€ также массивы, поэтому указываем не просто им€ но и символ массива - innerArr[]
            System.out.println(Arrays.toString(innerArr));

        }

        System.out.println("=====================================================");
        // how to loop through each name each array

        for (String innerArr[] : classGroup) { // не забываем что элементами внутри многоуровнего массива €вл€ютс€ также массивы, поэтому указываем не просто им€ но и символ массива - innerArr[]
            for (int i = 0; i <= innerArr.length - 1; i++)
                System.out.println(innerArr[i]);// i - обозночает элемент внутренего массива, который будет обновл€тьс€ с каждой итерацией

            // или мы можем использовать each for loop inside each for loop


        }

        System.out.println("=====================================================");
        // how to loop through each name each array and print last letter in upper case

        for (String innerArr[] : classGroup) { // не забываем что элементами внутри многоуровнего массива €вл€ютс€ также массивы, поэтому указываем не просто им€ но и символ массива - innerArr[]
            for (int i = 0; i <= innerArr.length - 1; i++) {
                System.out.println(innerArr[i]);
                System.out.println(innerArr[i].substring(innerArr[i].length() - 1).toUpperCase());

            }

        }
    }
}