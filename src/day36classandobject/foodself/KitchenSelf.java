package day36classandobject.foodself;

import day36classandobject.food.kitchen;

import java.util.Arrays;

public class KitchenSelf {
    public static void main(String[] args) {
        /*
        Create a separate class to create and test the Food objects
    	try making an array of Food objects
    	find all the Food objects that start with 'a' and print the whole information
    	find all the Food objects that have a total price over 10 and print the name of the food

         */

        FoodSelf bread = new FoodSelf("Bread", 1, 0.99);
        System.out.println(bread); // создал однин объект и распечатал его

        FoodSelf[] kitchen = new FoodSelf[6]; // создали массив, при этом вид массива -кастом класс, т.е. вместо String, int, double ... мы используем type of variable - custom class (созданный самостоятельно класс и которого потом будем создавать конкретные обхекты и класть их в массив, т.е. элементами массива будут отельные объекты из FoodSelf class
        System.out.println(Arrays.toString(kitchen)); // распечатали пусто массив, что бы посмотреть

        kitchen[0] = bread; // в массив под индекс 0 положили instance of FoodSelf class
        System.out.println(Arrays.toString(kitchen));// распечатали массив с заполненым первым индексом, остальные индексы пусты, что бы посмотреть
        kitchen[1] = new FoodSelf("Milk", 2, 2.5);
        kitchen[2] = new FoodSelf("Cheese", 5, 4.99);
        kitchen[3] = new FoodSelf("Cake", 5, 1.39);
        kitchen[4] = new FoodSelf("Macaron", 6, 7.3);
        kitchen[5] = new FoodSelf("Baccardi", 1, 21);

        System.out.println(Arrays.toString(kitchen));

        System.out.println("=============================");
        //find all the Food objects that start with 'B' and print the whole information
        for(FoodSelf eachElement : kitchen){// создаем обычный лууп, где custom class встает на место type (instead String forexample) : имя массива после двоеточия (обычный синтаксист)
            if(eachElement.name.startsWith("B"))// доступ к insctance variables внутри каждого элемента массива происходит по средством указанного синтаксиса
                System.out.println(eachElement);
        }
        System.out.println("========================");
        // find all the Food objects that have a quantity  ,3 and more and print the name of the food
        for(int i = 0; i < kitchen.length; i++){
            if (kitchen[i].quantity >= 3){
                System.out.println(kitchen[i]);
                // how to print only name of those products
                System.out.println(kitchen[i].name + " = " + kitchen[i].quantity);
            }
        }

        System.out.println("============================");
        //find all the Food objects that have a total price over 10 and print the name of the food

        for(FoodSelf eachElement : kitchen){
            if(eachElement.totalPrice >= 10){
                System.out.println(eachElement);
                System.out.println(eachElement.name + "= $" + eachElement.totalPrice);
            }
        }
    }
}
