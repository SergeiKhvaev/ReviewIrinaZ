package day42abstractionexeptionsrecap.exceptionrecap.vendingmachin;

public class OutOfStockExceptions extends RuntimeException{ // we made sub class from RuntimEception Super class
    // prepare custom exception for vending machine

    public OutOfStockExceptions(){// Constructor which call RuntameExceptions Super class we can put argument heer and print custom message ->more dynamic
       super("Item is out of stock"); // called Parent constructor// if we call constructor it is helps use define message
    }

}
