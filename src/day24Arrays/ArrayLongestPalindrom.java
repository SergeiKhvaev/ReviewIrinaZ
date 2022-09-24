package day24Arrays;

import java.util.Arrays;

public class ArrayLongestPalindrom {

    public static void main(String[] args) {
/*
[IQ] Longest Palindrome

	Given a String array. Find the longest Palindrome String in your array.

		Ex:
		Input:
			["java", "longer word", "civic", "apple", "racecar", "mom", "anna"]
		Output: racecar

		Ex:
		Input: ["abc", "dna", "kevin", "joe", "lamp"]
		Output: No palindrome

 */

        String str = "java, longer word, civic, apple, racecar, mom, anna";// перевести в массив

        String[] strArray = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String longestPalidrom = "";// создали пустую строку в которую мы будем хранить самый длинный палидром после окончания каждого внешнего цикла, эта строка будет обновлаться с выявлением более длинного палидрома

        for (String each : strArray) { //создали for each loop для массива
            String reverse = ""; // внутри внешнего цикла создали пустую строку, в которой будет храниться найденный реверс послле прокрутки всех внутренний циклов и который будет приравниваться к нулу при начале работы очередного внешнего цикла
            String palidrom = " "; // создаем, что бы хранить выявленный палидром
            for (int i = each.length() - 1; i >= 0; i--) {// внутренний цикал который будет строить реверсы каждого элемента массива
                reverse += each.charAt(i);// в этой строке будет храниться реверс каждого элемента после построения посредством прокрутки внутреннего лууп
            }

            if (each.equals(reverse)) {// if стайтмент, проверяющий равенли элемент массива своему реверсу, если true, то реверс будет признаваться самым длинным реверсом на момент проверки
               // System.out.println(reverse);
               palidrom = reverse; // присваиваем выявленный палидром в эту переменную

            }

            if (longestPalidrom.length() < palidrom.length()) {// отдельный if стайтмент проверяющий длинну выявленных палидромов
               longestPalidrom = palidrom; // тот палидром, который является более длиннее по сравнению с другим, начинаем хранить в переменной longest
            }


        }

        System.out.println(longestPalidrom); // печатаем самый длинный Палидром после прокрутки всех внешних лупп

    }
}


