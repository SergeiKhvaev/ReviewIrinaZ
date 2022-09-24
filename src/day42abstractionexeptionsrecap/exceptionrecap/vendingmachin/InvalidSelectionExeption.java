package day42abstractionexeptionsrecap.exceptionrecap.vendingmachin;

public class InvalidSelectionExeption extends Exception{
    // being a sub class oe Exception class makes this a checked exception

    public InvalidSelectionExeption(){ // called constructor of Exception class
        super(" Selection can only be 1,2 or 3");
    }

}
