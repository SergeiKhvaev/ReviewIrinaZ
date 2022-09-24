package day30JavaMethodsPractice_wrapper;

import java.util.Arrays;

public class HTMLGenerator {
    public static void main(String[] args) {
         /*
HTML Generator

Given a String in the following format take the number part of
 the generator the html tags.
    Tags are surrounded with diamond brackets.
The number of times to repeat with be given as the number after the ^

    Ex:
        Input:
            li^3
            // 1. выделить посдтроку li через indexOf("^");
               2. выделить подстроку последнего символа - конвертировать ее в int через парсе - это будет количество повторений
        Output:
            <li></li><li></li><li></li>
     */


        System.out.println(htmlGeneratot("li^3"));
        System.out.println(htmlGeneratot("div^2"));
        System.out.println(htmlGeneratot("html^5"));

        String str2 = "ADCD1.5";
     //   char s = Character.parseChar(str2);
        double g = Double.parseDouble(str2.substring(str2.length()-3));
        System.out.println(g);

    }




    public static String htmlGeneratot(String str) {
        String result = "";
        String subFirst = "<" + str.substring(0, str.indexOf('^')) + ">"; // из данной строки выделил подстроку и добавил в нее символы, которые будут всегда повторяться
        int repeatNum = Integer.parseInt(str.substring(str.length() - 1)); // выделил подстроку, которая содержит исключительно нужную цифру и перевел эту цифру в int формат
        for (int i = 0; i < repeatNum; i++) { // замутил лууп, который будет итерировать количество раз равное выделенной выше цифре
            result += subFirst + "/" + subFirst;
        }
return result;
    }
}


