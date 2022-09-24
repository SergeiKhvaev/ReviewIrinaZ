package day20forlooppractice;

import java.util.Scanner;

public class ForLootCamelCase
{
    public static void main(String[] args) {

        // today is SUNDAY - удалить пробелы и написать каждое слово с большой буквы


        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple words");
        String str = input.nextLine().toLowerCase();
        String camleCase = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){

               camleCase+= str.substring(i+1, i+2).toUpperCase();// next char after the space
                //str.charAt(i+1); or ("" + str.charAt(i+1)).toUpperCase() or str.toUpperCase().charAt(i+1);
                i++;// one more encramenting to avoid reapiting
            }else {
                camleCase += str.charAt(i);
            }
        }

        System.out.println(camleCase);

    }
}
