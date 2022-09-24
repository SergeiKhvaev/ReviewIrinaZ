package day36classandobject.food;

import java.util.Arrays;

public class kitchen {
    public static void main(String[] args) {

        FoodClass[] allFood = new FoodClass[5];// создали обычный массив размером 5, для хранения в нем отдельных объектов
        System.out.println(Arrays.toString(allFood));

        FoodClass apples = new FoodClass("Apples"); // создал объектя apple
        allFood[0] = apples; // храню созданный apple объект положил в массив под индекс 0 Food arr[0];
        allFood[1] = new FoodClass("Sushi", 10);//сразу в массив положил объект, не создавая его предварительно как выше
        allFood[2] = new FoodClass("Casta", 2, 3.99);
        allFood[3] = new FoodClass("KEbab", 4, 2.5);
        allFood[4] = new FoodClass("Plov", 4, 2.5);
        System.out.println(Arrays.toString(allFood));

        System.out.println("======================");
        // распечатать  каждый объект в отдельной линии
        for (FoodClass each : allFood) {
            System.out.println(each);
        }


        System.out.println("=========================");
        // finde objects starts with A or C

        for (FoodClass each : allFood) {
            if (each.name.startsWith("A") || each.name.startsWith("C")) {
                System.out.println(each);

            }
        }
        System.out.println("========================");
        // find food over 9$

        for (FoodClass each : allFood) {
            if (each.totalPrice >= 9) {
                System.out.println(each.name);

            }
        }



    }
}