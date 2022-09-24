package day41exeptions.bank;

public class NotEnoughMoneyException extends RuntimeException { // extend RuntimeException class makes
    public NotEnoughMoneyException(){ // make constructor which call super class RuntimeException constructor
        super("Not enough money in account"); // allows me to define massage part of the exception

    }

}
