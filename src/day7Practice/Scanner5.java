package day7Practice;

import java.util.Scanner; // мы импортировали пакет сканнер, который содеожт готовые к применению методы

public class Scanner5 {

    public static void main(String[] args){

        Scanner natureOfNumber = new Scanner(System.in); // мы объявили переменную сканнер и дали ей имя(natureOfNumber), при упоменании имения сканера, программа понимает, что ожидается ввод данных пользователем

        System.out.println("Enter any number, please:"); // мы определили какое сообщение будет выводиться в консоли перед вводом пользователем данных

        double num1 = natureOfNumber.nextFloat(); // мы затолькали метод Сканнер в переменную, что бы появилась возможность повторного использования переменной, и вызвали метод ввода данных типа дробное число

        boolean divisibleOn2 = num1 % 2 == 0;
        boolean divisibleOn3 = num1 % 3 == 0;
        boolean divisibleOn5 = num1 % 5 == 0;
        System.out.println("This number is even; " + divisibleOn2 + "\n" + "This number is divisble on 3: " + divisibleOn3 + "\n" +
                "This number is divisible on 5: " + divisibleOn5);


        // возможно более изящное решение при использовании конструкии if....else



    }


}
