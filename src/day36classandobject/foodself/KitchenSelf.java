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
        System.out.println(bread); // ������ ����� ������ � ���������� ���

        FoodSelf[] kitchen = new FoodSelf[6]; // ������� ������, ��� ���� ��� ������� -������ �����, �.�. ������ String, int, double ... �� ���������� type of variable - custom class (��������� �������������� ����� � �������� ����� ����� ��������� ���������� ������� � ������ �� � ������, �.�. ���������� ������� ����� �������� ������� �� FoodSelf class
        System.out.println(Arrays.toString(kitchen)); // ����������� ����� ������, ��� �� ����������

        kitchen[0] = bread; // � ������ ��� ������ 0 �������� instance of FoodSelf class
        System.out.println(Arrays.toString(kitchen));// ����������� ������ � ���������� ������ ��������, ��������� ������� �����, ��� �� ����������
        kitchen[1] = new FoodSelf("Milk", 2, 2.5);
        kitchen[2] = new FoodSelf("Cheese", 5, 4.99);
        kitchen[3] = new FoodSelf("Cake", 5, 1.39);
        kitchen[4] = new FoodSelf("Macaron", 6, 7.3);
        kitchen[5] = new FoodSelf("Baccardi", 1, 21);

        System.out.println(Arrays.toString(kitchen));

        System.out.println("=============================");
        //find all the Food objects that start with 'B' and print the whole information
        for(FoodSelf eachElement : kitchen){// ������� ������� ����, ��� custom class ������ �� ����� type (instead String forexample) : ��� ������� ����� ��������� (������� ����������)
            if(eachElement.name.startsWith("B"))// ������ � insctance variables ������ ������� �������� ������� ���������� �� ��������� ���������� ����������
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
