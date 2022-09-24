package my_utils;

import java.util.Locale;

public class StringUtil {
    // This class we will use to create String utility methods


    // method which reverse any word
    public static String reverse (String str){
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i --){
            reverse += str.charAt(i);

        }
        return reverse;
    }


    // palindrom method (string the same forwards and dacwards)

    public static boolean isPAlindrom (String str){

        return reverse(str).equalsIgnoreCase(str);
    }

 // fixing format, first letter is uppercase reso of string lowercase

    public static String fixFormat(String str){

        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();

    }

    // cameleCase
   /* create a method that will accept a String, of words separated by spaces,
    and return a camel case version of the String where the first letter
    of each word is Uppercase and the rest of the word is in lowercase.
    Exception: First word starts with lowercase
    Ex:
    Input:
    JAVA will ruLE tHe wORLd
    Output:
    javaWillRuleTheWorld
*/

    public static String camleCase (String str){
        String[] allWords = str.split(" ");

        String camleCase = allWords[0].toLowerCase();

        for(int i = 1; i < allWords.length; i++) { // начиванем цикл со второго элемента масисва, т.к. первый мы уже перевели в нижний формат
            camleCase+= fixFormat(allWords[i]);// применили другой fix format метод
        }
        return camleCase;
    }


// Frequency of character

    public static int frequencyOfChar (String str, char letter){
        int count =0;
        //   str = str.toLowerCase();
        for(int i =0; i < str.length(); i++){
            if(str.charAt(i) == letter){
                count++;
            }

        }

        return count;
    }

    // dublicate charactes



    public static String getduplicateCharacters (String str){
        String dublicate ="";
        for(int i =0; i < str.length(); i++){
            // str.char(i) give me every char

            if(dublicate.contains("" + str.charAt(i))){// если дубликат буквы уже попоался то пропустить код
                continue;
            }
            int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));

            if( frequency > 1) {
                dublicate += str.charAt(i);
            }
        }

        return dublicate;



    }


    // isPrime

    public static boolean isPrime(int num) {

        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
