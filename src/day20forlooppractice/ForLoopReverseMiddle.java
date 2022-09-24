package day20forlooppractice;

public class ForLoopReverseMiddle {
    public static void main(String[] args) {

        // нужно написать задом на перед слово всередине

        String word = "I love you";
        int start = word.indexOf(' ') +1;
        int end = word.lastIndexOf(' ');
        String subWord = word.substring(start, end);
        String reverseWord = "";

        for(int i = subWord.length() -1; i >= 0; i--) {
            reverseWord = reverseWord + subWord.charAt(i);// переназначаем каждую букву на основе значения I при каждом цикле (помни это строка, поэтому контанатация)

        }
        System.out.println(word.substring(0, word.indexOf(' ')) + " " + reverseWord + " " + word.substring(end+1)); // или можно просто использовать медов subWord.replace(reverseWord)





    }
}
