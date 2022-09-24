package day42abstractionexeptionsrecap.exceptionrecap.atmself;

public class BelowZeroException extends RuntimeException{ // extended my class by Parent for all unchecked exceptions -RuntimeException

    public BelowZeroException(){ // we build constructor for that class
        super("Expected balance below zero");
    } // my custom exception

    public BelowZeroException(String message){
        super();
    }

}
