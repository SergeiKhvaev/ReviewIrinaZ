package day20forlooppractice;

import java.sql.SQLOutput;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        // написать слово love наоборот;
        // концепция 1) найти используя метод substring серединное слово 2) сделать реверс, т.к. в реверс слове нужно искать СИМВОЛЫ, используем метод charAt(), что бы найти последовательно каждый символ 3) вставить обратно в предложение 3) т.к. в задаче просят вернуть строку, создаем пустой string

        String str = "I Sergei java";
        String reverse ="";
        String substr = str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" ")).toLowerCase(); // выделяем сабстринг слова, которое нужно перевернуть, делыем + 1, т.к. мы не хотим, что бы сабстрока начиналась с пробела.

       for (int i = substr.length() -1; i >= 0 ; i-- ){// строем сабстринг reversly. Для прочтения слова задом на перед i должен начаться с числа - количества символов в строке, которое уменьшается by 1 с каждым циклом. Делаем - 1, т.к. длинна строки больше на один чем количество индексов в ней, в противном случае следующий шаг, где мы вводим метод charAt(i)будет out of bounce exeption, т.к. метод будет искать символ нпод несуществующем индексом

          reverse = reverse +  substr.charAt(i);}


        System.out.println(substr);
        System.out.println(reverse);

        System.out.println(str.substring(0, str.indexOf(" ")) + " " + reverse + str.substring(str.lastIndexOf(" "))); // собрали новое предложение из трех сабстрингов, при этом первый и последний сабстринг собрали вручную, путем использования индексов indexOf(" ") b lastIndexOf(" ") соответственнно, а серединное слово задом на перед - это наш reverse, который мы собрали циклами



    }


}
