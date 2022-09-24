package day28javamethods;

public class NumberToWord {
    public static void main(String[] args) {

        System.out.println(numberToWord(1));
        System.out.println(numberToWord2(1));

    } // main


    public static String numberToWord(int n) {
        String word = " ";//  здесь будем хранить слово выбранное по свитч

        switch (n) {
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            default:
                word = "Invalid num";
        }
        return word; // это слово отстанваливает код

    }


    public static String numberToWord2(int n) {

        switch (n) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
        }
        return "invalid"; // это слово отстанваливает код

    }

}