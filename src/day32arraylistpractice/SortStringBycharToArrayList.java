package day32arraylistpractice;

import javax.sound.midi.Soundbank;
import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;

public class SortStringBycharToArrayList {
    /*
Separate Parts
Write a program that can extract the special characters,
digits and letters from a string and stores them into
separate ArrayLists of Characters
Ex:
str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}

     */
    public static void main(String[] args) {

//Пиздец Сережа это длинное решение, береги память компьютера, пожалуйста
        String str = "ABCD123$%#@&456EFG!";// (первоначальное рассуждение (неверное понимание Wrapper class, autoboxing, недопонимание того, что буква в стринг - это и char который автоматически пакуется в Character когда нужно ее положить в ArrayList, также непонимание того, что буква в String is String as well, соответственно это non primitive type и это мы также можем положить в ArrayList - все эти неверные понимания привели вот к такой логике(хотя решение хоть и длинное но верное(короткое решение приведено снизу)) - просто Стринг мы не можем разобрать, нужно ее во что-то конвертировать, при этом если нам нужно в итоге оценивать characters мы должны что бы перед такой оценкой у нас была data structure, where element is separate CHARACTER и это не может быть char [], так как элемень в таком массиве будет char, который мы не сможем оценить с точки зрения того буква, цифра или специальный символ это. ТАким образом, наилучшая на данный момент data structure это ArrayList, где каждый элемент is not char, but Character. Need to convert String --> ArrayList<Character>
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> symbols = new ArrayList<>();
        char [] arr = str.toCharArray(); // convert String to char []
        System.out.println(Arrays.toString(arr));// convert char[] to ArrayList<Character> - that we need finally

        for (char element : arr){
            if (Character.isDigit(element)){
                digits.add(element);
            }else if(Character.isLetter(element)){
                letters.add(element);
            }else {
                symbols.add(element);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);

        /*
        более короткое решение
         String str = "ABCD123$%#@&456EFG!";// можем разобрать стриг по буквал через лууп, проверить каждую букву строкичерез Charagter, и раскидать все буквы по нужныл ArrayList
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> symbols = new ArrayList<>();


        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                digits.add(str.charAt(i));
            }else if(Character.isLetter(str.charAt(i))){
                letters.add(str.charAt(i));
            }else {
                symbols.add(str.charAt(i));
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);

         */

    }
}
