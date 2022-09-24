package day42abstractionexeptionsrecap.exceptionrecap.vendingcheckedxc;

public class InvalidselectSelf extends Exception{// custom checked exception

    public InvalidselectSelf(){
        super("Invalid selection was made");
    }
}
