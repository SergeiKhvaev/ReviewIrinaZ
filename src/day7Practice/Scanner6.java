package day7Practice;

import java.util.Scanner; //// импортировали пакет сканнер в наш пакет, указав путь к этому пакету

public class Scanner6 {
    public static void main(String[] args){

        Scanner natureOfNumber1 = new Scanner(System.in); // объявили переменную сканер, дали ее имя, System.in соединил java с клавиатурой, дав при этом возможность пользовательского ввода

System.out.println("Enter any number, please: ");
Float num1 = natureOfNumber1.nextFloat(); // объявили переменную, дали ей имя, что бы появилась возможность дальнейшего его использования, объявили метод сканнера, определяющего какого характера данные должны вводиться

        if (num1 % 2 == 0){
            System.out.println("Entered number is Even.");}
        else if(num1 % 3 ==0){
            System.out.println("Entered number is divisible on 3.");}
        else if (num1 % 5 ==0){
            System.out.println("Entered number is divisible on 5.");}
        else {
                System.out.println("Entered number is decimal.");}







    }
}
