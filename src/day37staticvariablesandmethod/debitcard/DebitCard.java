package day37staticvariablesandmethod.debitcard;

public class DebitCard {
    /*
Debit card - custom classes + static

    Create a class for Debit Card that has the following
instance variables:
        card number (long), holder name (String),
card type (String), pin (int), and balance (double)

        static variables: account type (debit)
            -> Use static block to initialize account type
    Create a constructor that will create a debit card object
and initialize the card number, the card holder name, and the balance.
The card number has to be 8 characters long to be a valid card number.
If the length is too short or too big do not store the card number
and print “Invalid card number”

    Overload the constructor to take all of the instance variables.
The card type must be either MasterCard or Visa to be valid card type.
If it is not one of those two then do not store the type and
print “invalid card type”.
Also the pin must be only 4 characters long.
If the pin is more than or less than 4 characters then do not
store the pin into the instance variable and print “Invalid pin length”

    Add the toString method that will print all of the
cards information (Except the pin).
If the card type does not have a value do not print that line.
     */
    //instance variable
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    // static variable
    static String accoutType; // we declared static variable

    static {
        accoutType = "Debit";
        System.out.println("Accoutn type " + accoutType); // we assined static variable in staic block
    }

    /*
    Create a constructor that will create a debit card object
and initialize the card number, the card holder name, and the balance.
The card number has to be 8 characters long to be a valid card number.
If the length is too short or too big do not store the card number
and print “Invalid card number”
     */

    public DebitCard(long cardNumber, String holderName, double balance) {
        String str = String.valueOf(cardNumber);// convert long to String to define length
        if (str.length() == 8) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("invalid number");
        }
        this.holderName = holderName;
        this.balance = balance;
    }

    /*
    Overload the constructor to take all of the instance variables.
The card type must be either MasterCard or Visa to be valid card type.
If it is not one of those two then do not store the type and
print “invalid card type”.
Also the pin must be only 4 characters long.
If the pin is more than or less than 4 characters then do not
store the pin into the instance variable and print “Invalid pin length”
     */
    public DebitCard(long cardNumber, String holderName, double balance, String cardType, int pin) {
        this(cardNumber, holderName, balance);
        if (cardType.equalsIgnoreCase("MasterCard") || cardType.equalsIgnoreCase("Visa")) {
            this.cardType = cardType;
        } else {
            System.out.println("Invalid card type");
        }
        String str2 = String.valueOf(pin);
        if (str2.length() == 4) {
            this.pin = pin;
        } else {
            System.out.println("Invalid pin length");
        }
    }

    public String toString() {
        String str3 = "Debit card{";
        if (cardNumber != 0) {
            str3 += "card number = " + cardNumber +" ";
        }
        if (cardType != null) {
            str3 += "card type = " + cardType + " ";
        }
        //  if (pin != 0) {
        //str3 += "pin " + pin + " ";
        //  }
        str3 += "balance $" + balance + " ";
        str3 += "Card holder = " + holderName + "}";

        return str3;
    }
    }
