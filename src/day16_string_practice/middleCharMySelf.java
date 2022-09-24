package day16_string_practice;
import java.util.Scanner;

public class middleCharMySelf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word please");
        String word = input.next().trim();// exclude possible white spaces before and after string

        int halfLength = word.length() /2; // - определил половину длинны слова
        String str2 = word.substring(halfLength -1,  halfLength + 1); // подобрал по индексам какой символ последний в первой половине слова и какой символ первый во второй половине слова (если длинна слова четное число)
        String str3 = word.substring(halfLength,  halfLength + 1); // подобрал по индексам какой символ является серединным (если длинна слова нечетное число)

        if(word.length() % 2 == 0){
            System.out.println("Length is even - " +  str2);
        } else if (word.length() % 2 == 1){
            System.out.println("Length is odd - " + str3);
        }


    }
}
