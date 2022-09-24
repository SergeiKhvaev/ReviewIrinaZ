package day37staticvariablesandmethod.debitcard;

import day03_variables.WatchInfo;

public class myCard {
    public static void main(String[] args) {
       // static variable called
        //System.out.println(DebitCard.accoutType);

        // first object with valid info
        DebitCard myFirstCard = new DebitCard (1234567998, "Sergei Khvalev", 1000000); // all info is valid
       System.out.println(myFirstCard);
       System.out.println(myFirstCard.cardNumber);
        System.out.println(myFirstCard.holderName);


        System.out.println("================");
        //second card with invalid card number length
        DebitCard mySecondCard = new DebitCard(12111233, "Ekaterina Starovoitova", 500000);
        System.out.println(mySecondCard);
        System.out.println(mySecondCard.cardNumber);
        System.out.println(mySecondCard.holderName);


        System.out.println("================");
        //third card

        DebitCard myThirdCard = new DebitCard(12345600078l, "Etel", 1000, "Discovery", 12334);
        System.out.println(myThirdCard);
      // System.out.println(myThirdCard.cardType);
      //  System.out.println(myThirdCard.cardNumber);
       // System.out.println(myThirdCard.pin);

        System.out.println("==============");
        DebitCard myForthCard = new DebitCard(33344455, "Eva Khvaleva", 100000, "MIR", 1212);
        System.out.println(myForthCard);
        System.out.println(myForthCard.pin);
       // System.out.println(myForthCard.cardType);
        System.out.println(myForthCard.cardNumber);
        System.out.println(myForthCard.holderName);
        System.out.println(myForthCard.balance);

    }
}
