package day24Arrays;

import java.util.Arrays;

public class ArrayPrintAllPaligrom {
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

String str1 = "java, longer word, civic, apple, racecar, mom, anna";
String[] strArray1 = str1.split(",");
        System.out.println(Arrays.toString(strArray1));
        System.out.println("============================================");

String[] strArray =	{"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

for(String each : strArray){// создали внешний for each loop
    String reverse = "";// создали пустой стринг для реверсивных слов/ с каждым внешним циклом реверс будет обновляться до пустой строки

    for(int i = each.length()-1; i >= 0 ; i--){// внутренний for loop, который будет собрираться каждый элемент массива начиная с последнего до первого символа
       reverse += each.charAt(i);// хранится реверсивный элемент массива после каждого прокрутки всех циклов внутреннего цикла
    }
if (each.equals(reverse)){// отдельный if стайтмент внутри внешнего цикла, который проверяет идентичный ли каждый отдельный элемент его же реверсивной вариации
    System.out.println((reverse)); // если элемент идентичен своему реверсивному вариатну, то он распечатывается
}

}
    }
}
