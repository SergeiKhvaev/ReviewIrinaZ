package day04_print_statment;

public class AvarageNumber {
    public static void main(String[]args){
        int avar1 = 4;
        int avar2 = 5;
        short avar3 = 6;
        byte avar4 = 7;

        int amountOfAvar = 4;
        int avarageNumber = (avar1+avar2+avar3+avar4) / amountOfAvar;
        int remainder = (avar1+avar2+avar3+avar4) % 4;

        String result = "Avarage number is " + avarageNumber;
        String remainderResult = "Remainder resalr is " + remainder;

        System.out.println(result);
        System.out.println(remainderResult);

        System.out.println("-------------------------------------------");








    }




}
