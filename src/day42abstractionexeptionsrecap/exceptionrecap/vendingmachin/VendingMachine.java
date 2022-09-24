package day42abstractionexeptionsrecap.exceptionrecap.vendingmachin;

public class VendingMachine {


    /*
     1 - chips
     2 - gum
     3 - Candy

     what if item out of stock
     */
    public static String select(int selection) {
        String item = "";
        if (selection == 1) {
            item = "Chips";
        } else if (selection == 2) {
            //  item = "Gum"; --> out of stock
            throw new OutOfStockExceptions(); // we throw our custom unchecked exception object(with empty constructor
        } else if (selection == 3) {
            item = "Candy";
        }
        return item;
    }


    public static String selectValid(int selection) throws InvalidSelectionExeption { // example of checked exception // throws help us to ignore cheked exception and continue to write code here, but if you will run code it still stop because checked exception, because need handle exception
        String item = "";
        if (selection == 1) {
            item = "Chips";
        } else if (selection == 2) {
            item = "Gum";

        } else if (selection == 3) {
            item = "Candy";
        } else {
            //we throw our custom checked exception object(with empty constructor)
            throw new InvalidSelectionExeption(); // checked exception must be happens, but we twhrow it entedely, so need use  throws key word to ignore checked exception, and pass the problem to somebody else and we compile code Дальше// handalind of chacked exeption will occeure when that method will be called


        }
        return item;

    }


}

