package day22arrays;

import java.util.Arrays;

public class StringArrayIntroCities {

    public static void main(String[] args) {
        // cities in saparet strings
        String city1 = "Chicago";
        String city2 = "Orlando";
        String city3 = "New York";
        String city4 = "Washington";
        String city5 = "Miami";
        String citi6 = "Austin";

        // make an array for those cities

        String[] cities = { "Chicago", "Orlando",  "New York", "Washington", "Miami", "Austin"};
        System.out.println(cities[0]);// access each city one at time
        System.out.println(cities[1]);// access each city one at time
        System.out.println(cities[2]);// access each city one at time
        System.out.println(cities[3]);// access each city one at time
        System.out.println(cities[4]);// access each city one at time
        System.out.println(cities[5].toLowerCase());// access each city one at time


        // printing whole array
        System.out.println(cities); // hash code кракозябра нечитаемая
        Arrays.toString(cities);// Arrays.toString(cities) - используются для печати всего массива вцеломб this method return object in string format ,нужно использовать специальный метод для печати, вызывающий специальный класс
        System.out.println(Arrays.toString(cities)); // print whole array. Arrayes - name utiliti class, which help us to work with

        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i]+" ");

        }
        System.out.println();

        for (int i = cities.length - 1; i >= 0; i--) {
            System.out.print(cities[i]+" ");

        }

    }
}
