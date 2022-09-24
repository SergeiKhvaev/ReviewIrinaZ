package day7Practice;

public class giftCard {
    public static void main(String[] args){

        double giftCard = 500;
        int timeUsed = 3;
        giftCard -= 150;
        timeUsed--;

        System.out.println(giftCard);
        System.out.println(timeUsed);


        System.out.println("Using gift card6: " + (giftCard - 150) + " "+ "time used: " + timeUsed);

        giftCard -=99;
        System.out.println(timeUsed);
        timeUsed--;

        System.out.println(giftCard);
        System.out.println(timeUsed);







    }
}
